package persistent;

//import java.sql.Connection;
import java.util.ArrayList;

import database.TrkDatabaseConnect;

public class Schedule {
	private String eventid;
	private String location;
	private String date;
	private String s_time;
	private String e_time;
	private Resource resource;
	public ArrayList<String[]> equipment_list = new ArrayList<String[]>();

	public Schedule(String eventid, String location, String date, String s_time, String e_time,ArrayList<String[]> equipment_list) {
		this.eventid = eventid;
		this.location = location;
		this.date = date;
		this.s_time = s_time;
		this.e_time = e_time;
		this.equipment_list = equipment_list;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getS_time() {
		return s_time;
	}

	public void setS_time(String s_time) {
		this.s_time = s_time;
	}

	public String getE_time() {
		return e_time;
	}

	public void setE_time(String e_time) {
		this.e_time = e_time;
	}

	public Resource getResource() {
		return resource;
	}

	public void setResource(Resource resource) {
		this.resource = resource;
	}

	public String getEventid() {
		return eventid;
	}

	public void setEventid(String eventid) {
		this.eventid = eventid;
	}


}
