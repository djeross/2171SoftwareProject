package business;

import java.sql.ResultSet;
import java.util.ArrayList;


public class TrkAPP {
	EquipmentManager equipmentmanager;
	ScheduleManager schedulemanager;
	ReportManager reportmanager;
	ArrayList<String> list_of_resource_ids;
	
	public TrkAPP(){
		this.reportmanager=new ReportManager(); 
		this.equipmentmanager=new EquipmentManager();
		this.schedulemanager=new ScheduleManager();
		this.list_of_resource_ids=loadIDs();
	}
	
	
	public ArrayList<String> loadIDs(){
		return equipmentmanager.getIdList();
	}

	


	/**
	 * Schedule an equipment for an event.
	 * @param schedule schedule object from which the attribute will be used to update database. 
	 */
	public String callScheduleEquipment(String eventid, String location, String date, String s_time, String e_time, ArrayList<String[]> list){
		return schedulemanager.scheduleEquipment(eventid, location, date, s_time, e_time, list);
	}
	
	public void callAddEquipment(String equip_id, String equip_name, int t_qty, int r_qty){
		equipmentmanager.addEquipment(equip_id, equip_name, t_qty, r_qty);
	}
	
	public void callDeleteEquipment(String equip_id){
		equipmentmanager.deleteEquipment(equip_id);
	}
			
	public ResultSet callGetAllEquipment() {
		return equipmentmanager.getAllEquipment();
	}
	
		
}

	
	
