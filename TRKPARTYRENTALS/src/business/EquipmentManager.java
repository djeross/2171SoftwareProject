package business;

import java.util.ArrayList;

import DBControl.DatabaseManager;

public class EquipmentManager {
	DatabaseManager dbmanager;
	
	
	
	
	public EquipmentManager() {
		this.dbmanager = new DatabaseManager();
	}




	public ArrayList<String> getIdList(){
		return dbmanager.getReosurceIDs();
	}
	
	
	

}
