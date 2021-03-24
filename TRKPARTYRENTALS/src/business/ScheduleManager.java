package business;

import java.sql.ResultSet;
import java.util.ArrayList;

import DBControl.DatabaseManager;

public class ScheduleManager {
	DatabaseManager dbmanager=new DatabaseManager();
	
	public ScheduleManager() {
		this.dbmanager = new DatabaseManager();
	}
	
	
	
	
	public String scheduleEquipment(String eventid, String location, String date, String s_time, String e_time, ArrayList<String[]>list){
		String response=areValidSelections(list);
		if (response.isBlank()){
			response=dbmanager.addEquipmentSchedule(eventid, location, date, s_time, e_time, list);
			return response;
		}else {
			return response;
		}
	}
	
	
	private String areValidSelections(ArrayList<String[]>list){
		String response="";
		for(String[] request: list) {
			String resourceid= request[0];
			int requestedamount= Integer.parseInt(request[1]);
			int remainingquantity=Integer.parseInt(dbmanager.getResourceDB(resourceid)[3].toString());
			if(requestedamount>remainingquantity) {
				response+=resourceid;
			}	
		}
		return response;
	}
	
	public ResultSet viewAllSchedules(){
		return dbmanager.getAllSchedules();
	}


}
