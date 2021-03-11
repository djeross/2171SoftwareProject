package business;

import java.util.ArrayList;
import DBManager.DatabaseFacade;


public class TrkAPP {
	DatabaseFacade dbfacade;
	public TrkAPP(){
		this.dbfacade = new DatabaseFacade();
	}
	
	
	
	public DatabaseFacade getDbfacade() {
		return dbfacade;
	}



	/**
	 * Schedule an equipment for an event.
	 * @param schedule schedule object from which the attribute will be used to update database. 
	 */
	public String equipmentScheduler(String eventid, String location, String date, String s_time, String e_time, ArrayList<String[]> list){
		System.out.println(eventid+" "+location+" "+date+s_time+" "+e_time+" "+list);
		return this.getDbfacade().Schedule_Equipment(eventid, location, date, s_time, e_time, list);
	}
			

	
		
}
