package business;

import java.util.ArrayList;
import persistent.Resource;
import java.sql.ResultSet;

import DBControl.DatabaseManager;

public class EquipmentManager {
	DatabaseManager dbmanager;
	
	
	
	
	public EquipmentManager() {
		this.dbmanager = new DatabaseManager();
	}




	public ArrayList<String> getIdList(){
		return dbmanager.getReosurceIDs();
	}
	
	public void addEquipment(String equip_id, String equip_name, int t_qty, int r_qty){
		Resource resource = new Resource(equip_id, equip_name, t_qty, r_qty);
		dbmanager.addEquipmentDetails(resource);
		
	}
	
	public void deleteEquipment(String equip_id){
		
		dbmanager.deleteEquipment(equip_id);
		
	}
	
	public ResultSet getAllEquipment() {
		return dbmanager.getAllEquipment();
	}
	
	public ResultSet getEquipmentByID(String equip_id) {
		return dbmanager.getEquipmentByID(equip_id);
	}
	
	public ResultSet getEquipmentByName(String equip_name) {
		return dbmanager.getEquipmentByName(equip_name);
	}
	

}
