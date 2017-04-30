package model;

public class Price {
	private int price_id;
	private int location_id_from;
	private int location_id_to;
	private int location_id;
	private String price;
	private String location_code_from;
	private String location_code_to;
	public int getPrice_id() {
		return price_id;
	}
	public void setPrice_id(int price_id) {
		this.price_id = price_id;
	}
	public int getLocation_id_from() {
		return location_id_from;
	}
	public void setLocation_id_from(int location_id_from) {
		this.location_id_from = location_id_from;
	}
	public int getLocation_id_to() {
		return location_id_to;
	}
	public void setLocation_id_to(int location_id_to) {
		this.location_id_to = location_id_to;
	}
	public int getLocation_id() {
		return location_id;
	}
	public void setLocation_id(int location_id) {
		this.location_id = location_id;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getLocation_code_from() {
		return location_code_from;
	}
	public void setLocation_code_from(String location_code_from) {
		this.location_code_from = location_code_from;
	}
	public String getLocation_code_to() {
		return location_code_to;
	}
	public void setLocation_code_to(String location_code_to) {
		this.location_code_to = location_code_to;
	}
	
}