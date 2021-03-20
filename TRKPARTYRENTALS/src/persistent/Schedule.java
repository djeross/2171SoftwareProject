package persistent;

//import java.sql.Connection;
import java.util.ArrayList;


public class Schedule {
	private String eventid;
	private String location;
	private String date;
	private String s_time;
	private String e_time;
	//private ItemRequest IRQ;
	public ArrayList<ItemRequest> equipment_list = new ArrayList<ItemRequest>();

	public Schedule(String eventid, String location, String date, String s_time, String e_time,ArrayList<ItemRequest> equipment_list) {
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

	public void updateLocation(String location) {
		this.location = location;
	}

	public String getDate() {
		return date;
	}

	public void updateDate(String date) {
		this.date = date;
	}

	public String getS_time() {
		return s_time;
	}

	public void updateStartTime(String s_time) {
		this.s_time = s_time;
	}

	public ArrayList<ItemRequest> getEquipment_list() {
		return equipment_list;
	}

	public void setEquipment_list(ArrayList<ItemRequest> equipment_list) {
		this.equipment_list = equipment_list;
	}

	public String getE_time() {
		return e_time;
	}

	public void setE_time(String e_time) {
		this.e_time = e_time;
	}

	public String getEventid() {
		return eventid;
	}
	
	



}
