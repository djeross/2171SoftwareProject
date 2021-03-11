package DBManager;
import persistent.*;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import database.TrkDatabaseConnect;


public class DatabaseFacade{
	private TrkDatabaseConnect trkconnect;
	
	
	
	/**
	 * 
	 */
	public DatabaseFacade() {
		this.trkconnect= new TrkDatabaseConnect();
	}
	
	/**
	 * 
	 * @return
	 */
	public TrkDatabaseConnect getTrkconnect() {
		return trkconnect;
	}
	
	/**
	 * 
	 * @param trkconn
	 * @param rid
	 * @return
	 */
	private Resource createResourceDB(TrkDatabaseConnect trkconn,String rid){
		String query="SELECT DISTINCT EquipmentID, EquipmentName, Total_Quantity, Remaining_Quantity FROM resource where EquipmentID='"+rid+"'";
		ResultSet result;
		try {
			result = trkconn.getStmt().executeQuery(query);
			String equipid="";
			int totalqty=0;
			int remainqty=0;
			while(result.next()){
				equipid = result.getString("EquipmentID");
				totalqty = Integer.parseInt(result.getString("Total_Quantity"));
				remainqty = Integer.parseInt(result.getString("Remaining_Quantity"));
			}
			return new Resource(equipid,totalqty,remainqty);
		}
		catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		
	}


	/**
	 * Schedule an equipment for an event.
	 * @param schedule schedule object from which the attribute will be used to update database. 
	 */
	public String Schedule_Equipment(String eventid, String location, String date, String s_time, String e_time, ArrayList<String[]> equipment_list){
		try {
			TrkDatabaseConnect trkconn=this.getTrkconnect();
			String query="INSERT INTO schedule (EventID,Location,Date,Start_Time,End_Time)VALUES (?, ?, ?, ?, ?)";
			PreparedStatement statement =trkconn.getDbconn().prepareStatement(query);
			statement.setString(1, eventid);
			statement.setString(2, location);
			statement.setString(3, date);
			statement.setString(4, s_time);
			statement.setString(5, e_time);
			int query1 = statement.executeUpdate();
			if(query1 >0){
				for(String[] pair:equipment_list) {
					query="INSERT INTO contains (EventID,EquipmentID,Quantity)VALUES (?, ?, ?)";
					PreparedStatement statement2 =trkconn.getDbconn().prepareStatement(query);
					String equipid=pair[0];
					int quantity= Integer.parseInt(pair[1]);
					statement2.setString(1, eventid);
					statement2.setString(2, equipid);
					statement2.setInt(3, quantity);
					int query2 = statement2.executeUpdate();
					if(query2 >0){
						Resource resource = createResourceDB(trkconn,equipid);
						resource.setR_Qty(resource.getR_Qty()-quantity);
						query="UPDATE resource SET Remaining_Quantity='"+resource.getR_Qty()+"' WHERE EquipmentID ='"+resource.getID()+"'";
						trkconn.getStmt().executeUpdate(query);
					}
					else {
						return "Fail to Schedule "+equipid+" for Event ID: "+eventid;
					}
				}
				return "Success";
			}
			else {
				String sql = "DELETE FROM schedule WHERE EventID=?";
				PreparedStatement statement3 = trkconn.getDbconn().prepareStatement(sql);
				statement.setString(1,eventid);
				int rowsDeleted = statement3.executeUpdate();
				if (rowsDeleted > 0) {
				    System.out.println("Roll back Successful");
				}
			}
			return "No equipment Scheldued";
		}
		catch(Exception ex){
			ex.printStackTrace();
			return "Error in Scheduling Details, Failure To Schedule equipment";
		}
		
	}
	
	
	

	
}
