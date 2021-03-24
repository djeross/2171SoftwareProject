package DBControl;
import database.TrkDatabaseConnect;
import persistent.Resource;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;



public class DatabaseManager{
	private TrkDatabaseConnect trkconnect;
	/**
	 * 
	 */
	public DatabaseManager() {
		this.trkconnect= new TrkDatabaseConnect();
	}
	
	
	
	
	/**
	 * 
	 * @return
	 */
	public TrkDatabaseConnect getTrkconnect() {
		return trkconnect;
	}
	
	
	public ArrayList<String> getReosurceIDs(){
		ArrayList<String>list=new ArrayList<String>();
		String query="SELECT DISTINCT EquipmentID FROM resource ";
		ResultSet result;
		try {
			result = getTrkconnect().getStmt().executeQuery(query);
			String equipid="";
			while(result.next()){
				equipid = result.getString("EquipmentID");
				list.add(equipid);
			}
			return list;
		}
		catch (SQLException e) {
			e.printStackTrace();
			return list;
		}
		
	}
	
	/**
	 * Used to get the table fields of a Reseource object from the database.
	 * @param trkconn
	 * @param rid
	 * @return Object[]
	 */
	public Object[] getResourceDB(String rid){
		String query="SELECT DISTINCT EquipmentID, EquipmentName, Total_Quantity, Remaining_Quantity FROM resource where EquipmentID='"+rid+"'";
		ResultSet result;
		try {
			result = getTrkconnect().getStmt().executeQuery(query);
			String equipid,name;
			int totalqty,remainqty;
			equipid=name="";
			totalqty=remainqty=0;
			while(result.next()){
				equipid = result.getString("EquipmentID");
				name = result.getString("EquipmentName");
				totalqty = Integer.parseInt(result.getString("Total_Quantity"));
				remainqty = Integer.parseInt(result.getString("Remaining_Quantity"));
			}
			return new Object[]{equipid, name, totalqty, remainqty};
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
	public String addEquipmentSchedule(String eventid, String location, String date, String s_time, String e_time, ArrayList<String[]> equipment_list){
			String response="";
			int query1 = addSchedulingDetails(eventid, location, date, s_time, e_time);
			if(query1 >0){
				String add_eqp_response=addEquipmentRequestsList(eventid,equipment_list);
				if(add_eqp_response.equals("")){
					response="success";
				}else{
					response="Error in Scheduling Equipment, Failure To Schedule equipment";
				}
			}else {
				response="Error in Scheduling Details, Failure To Schedule equipment";
			}
			return response;
	}
	
	
	private int addSchedulingDetails(String eventid, String location, String date, String s_time, String e_time){
		try {
			TrkDatabaseConnect trkconn=this.getTrkconnect();
			String query="INSERT INTO schedule (EventID,Location,Date,Start_Time,End_Time)VALUES (?, ?, ?, ?, ?)";
			PreparedStatement statement =trkconn.getDbconn().prepareStatement(query);
			statement.setString(1, eventid); 
			statement.setString(2, location); 
			statement.setString(3, date);
			statement.setString(4, s_time); statement.setString(5, e_time);
			return statement.executeUpdate();
		}catch(Exception ex){
			ex.printStackTrace();
			return -1;
		}
	}
	
	private String addEquipmentRequestsList(String eventid,ArrayList<String[]> equipment_list){
		String response="";
		try {
			TrkDatabaseConnect trkconn=this.getTrkconnect();
			for(String[] pair:equipment_list) {
				String query="INSERT INTO contains (EventID,EquipmentID,Quantity)VALUES (?, ?, ?)";
				PreparedStatement statement2 =trkconn.getDbconn().prepareStatement(query);
				String equipid=pair[0];
				int requested_quantity= Integer.parseInt(pair[1]);
				statement2.setString(1, eventid);
				statement2.setString(2, equipid);
				statement2.setInt(3, requested_quantity);
				int query2 = statement2.executeUpdate();
				if(query2 >0){
					int remaining_quantity=Integer.parseInt(getResourceDB(equipid)[3].toString());
					remaining_quantity=remaining_quantity-requested_quantity;
					query="UPDATE resource SET Remaining_Quantity='"+remaining_quantity+"' WHERE EquipmentID ='"+equipid+"'";
					trkconn.getStmt().executeUpdate(query);
				}
				else {
					response+="Fail to Schedule "+equipid+" for Event ID: "+eventid;
				}
			}
			return response;
		}catch (Exception ex) {
			ex.printStackTrace();
			return "Error in Scheduling Equipment, Failure To Schedule equipment";
		}
	}
	
	
	public int addEquipmentDetails(Resource resource){
		try {
			TrkDatabaseConnect trkconn=this.getTrkconnect();
			String query="INSERT INTO resource (EquipmentID,EquipmentName,Total_Quantity,Remaining_Quantity) VALUES (?, ?, ?, ?)";
			
			String id = resource.getID();
			String name = resource.getEname();
			String t_qty = "" + resource.getT_Qty();
			String r_qty = "" + resource.getR_Qty();
			
			
			PreparedStatement statement =trkconn.getDbconn().prepareStatement(query);
			statement.setString(1, id); 
			statement.setString(2, name); 
			statement.setString(3, t_qty);
			statement.setString(4, r_qty);
			return statement.executeUpdate();
		}catch(Exception ex){
			ex.printStackTrace();
			return -1;
		}
	}
	
	public int deleteEquipment(String equip_id){
		try {
			TrkDatabaseConnect trkconn=this.getTrkconnect();
			String query="DELETE FROM resource WHERE EquipmentID='" + equip_id + "'";
			
			PreparedStatement statement =trkconn.getDbconn().prepareStatement(query);
			
			return statement.executeUpdate();
		}catch(Exception ex){
			ex.printStackTrace();
			return -1;
		}
	}
	
	public ResultSet getAllEquipment(){
		try {
			TrkDatabaseConnect trkconn=this.getTrkconnect();
			
			String query = ("SELECT * FROM resource;");
			
			PreparedStatement statement =trkconn.getDbconn().prepareStatement(query);
			
			ResultSet rs = statement.executeQuery(query);
			
			return rs;
			
		}catch(Exception ex){
			ex.printStackTrace();
			return null;
		}
	}

	public ResultSet getAllSchedules(){
		try {
			TrkDatabaseConnect trkconn=this.getTrkconnect();
			
			String query = ("SELECT * FROM contains;");
			
			PreparedStatement statement =trkconn.getDbconn().prepareStatement(query);
			
			ResultSet rs = statement.executeQuery(query);
			
			return rs;
			
		}catch(Exception ex){
			ex.printStackTrace();
			return null;
		}
	}

	
}
