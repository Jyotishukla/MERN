package model;

import java.util.Date;

public class Transaction {
	private int transaction_id;
	private int order_id;
	private int price_id;
	private int employee_id;
	private Date transaction_date;
	private String transaction_description;
	private double transaction_amount;
	private String make;
	private String model;
	private int year;
	private int truck_id;
	private double discount;
	private String quality;
	private double unit_price;
	private double driver_price;
	private String vin;
	private String run_number;
	private String special;
	private double rate;
	private double surcharge;
	public int getTransaction_id() {
		return transaction_id;
	}
	public void setTransaction_id(int transaction_id) {
		this.transaction_id = transaction_id;
	}
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public int getPrice_id() {
		return price_id;
	}
	public void setPrice_id(int price_id) {
		this.price_id = price_id;
	}
	public int getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}
	public Date getTransaction_date() {
		return transaction_date;
	}
	public void setTransaction_date(Date transaction_date) {
		this.transaction_date = transaction_date;
	}
	public String getTransaction_description() {
		return transaction_description;
	}
	public void setTransaction_description(String transaction_description) {
		this.transaction_description = transaction_description;
	}
	public double getTransaction_amount() {
		return transaction_amount;
	}
	public void setTransaction_amount(double transaction_amount) {
		this.transaction_amount = transaction_amount;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getTruck_id() {
		return truck_id;
	}
	public void setTruck_id(int truck_id) {
		this.truck_id = truck_id;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public String getQuality() {
		return quality;
	}
	public void setQuality(String quality) {
		this.quality = quality;
	}
	public double getUnit_price() {
		return unit_price;
	}
	public void setUnit_price(double unit_price) {
		this.unit_price = unit_price;
	}
	public double getDriver_price() {
		return driver_price;
	}
	public void setDriver_price(double driver_price) {
		this.driver_price = driver_price;
	}
	public String getVin() {
		return vin;
	}
	public void setVin(String vin) {
		this.vin = vin;
	}
	public String getRun_number() {
		return run_number;
	}
	public void setRun_number(String run_number) {
		this.run_number = run_number;
	}
	public String getSpecial() {
		return special;
	}
	public void setSpecial(String special) {
		this.special = special;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	public double getSurcharge() {
		return surcharge;
	}
	public void setSurcharge(double surcharge) {
		this.surcharge = surcharge;
	}


}
