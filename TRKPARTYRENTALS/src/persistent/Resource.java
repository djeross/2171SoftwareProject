package persistent;


public class Resource {
	private String Ename;
	private String ID;
	private int T_Qty;
	private int R_Qty;

	
	public Resource(String iD,String ename, int t_Qty) {
		this.Ename = ename;
		this.ID = iD;
		this.T_Qty = t_Qty;
		this.R_Qty = t_Qty;
	}
	
	public Resource(String iD, int t_Qty, int r_Qty) {
		this.ID = iD;
		this.R_Qty = r_Qty;
	}

	public String getEname() {
		return Ename;
	}

	public void setEname(String ename) {
		this.Ename = ename;
	}

	public String getID() {
		return ID;
	}

	public int getT_Qty() {
		return T_Qty;
	}

	public void setT_Qty(int t_Qty) {
		this.T_Qty = t_Qty;
	}

	public int getR_Qty() {
		return R_Qty;
	}

	public void setR_Qty(int r_Qty) {
		this.R_Qty = r_Qty;
	}

	
	
	
}