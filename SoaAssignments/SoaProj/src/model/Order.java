package model;

import java.util.Date;

public class Order {
	private int order_id;
	private Date order_date;
	private int customer_id;
	private int employee_id;
	private int truck_id;
	private String is_special;
	private String purchase_order_number;
	private String order_total_amount;
	private Customer customer;
	private Transaction transaction;
	
	public Transaction getTransaction() {
		return transaction;
	}
	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public Date getOrder_date() {
		return order_date;
	}
	public void setOrder_date(Date order_date) {
		this.order_date = order_date;
	}
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public int getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}
	public int getTruck_id() {
		return truck_id;
	}
	public void setTruck_id(int truck_id) {
		this.truck_id = truck_id;
	}
	public String getIs_special() {
		return is_special;
	}
	public void setIs_special(String is_special) {
		this.is_special = is_special;
	}
	public String getPurchase_order_number() {
		return purchase_order_number;
	}
	public void setPurchase_order_number(String purchase_order_number) {
		this.purchase_order_number = purchase_order_number;
	}
	public String getOrder_total_amount() {
		return order_total_amount;
	}
	public void setOrder_total_amount(String order_total_amount) {
		this.order_total_amount = order_total_amount;
	}
	

}

