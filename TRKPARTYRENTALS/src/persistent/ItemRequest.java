package persistent;

public class ItemRequest {
	private Resource resource;
	private String resourceid;
	private int quantity;
	
	public ItemRequest(String resourceid, int quantity) {
		this.resourceid = resourceid;
		this.quantity = quantity;
	}

	public String getResourceid() {
		return resourceid;
	}


	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	
	
	
	
	
	
}
