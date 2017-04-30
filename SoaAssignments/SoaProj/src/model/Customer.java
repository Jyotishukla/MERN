package model;

import java.util.Date;

public class Customer {
	private int customer_id;
	private String customer_title;
	private String buisness_name;
	private String billing_address;
	private int phone_no;
	private int address_id;
	private int cell_number;
	private int other_number;
	private int fax_number;
	private String email_address;
	private String customer_type;
	private String company_name;
	private String contact_name;
	private String alternate_contactname;
	private Date date_entered;
	
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public String getCustomer_title() {
		return customer_title;
	}
	public void setCustomer_title(String customer_title) {
		this.customer_title = customer_title;
	}
	public String getBuisness_name() {
		return buisness_name;
	}
	public void setBuisness_name(String buisness_name) {
		this.buisness_name = buisness_name;
	}
	public String getBilling_address() {
		return billing_address;
	}
	public void setBilling_address(String billing_address) {
		this.billing_address = billing_address;
	}
	public int getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(int phone_no) {
		this.phone_no = phone_no;
	}
	public int getAddress_id() {
		return address_id;
	}
	public void setAddress_id(int address_id) {
		this.address_id = address_id;
	}
	public int getCell_number() {
		return cell_number;
	}
	public void setCell_number(int cell_number) {
		this.cell_number = cell_number;
	}
	public int getOther_number() {
		return other_number;
	}
	public void setOther_number(int other_number) {
		this.other_number = other_number;
	}
	public int getFax_number() {
		return fax_number;
	}
	public void setFax_number(int fax_number) {
		this.fax_number = fax_number;
	}
	public String getEmail_address() {
		return email_address;
	}
	public void setEmail_address(String email_address) {
		this.email_address = email_address;
	}
	public String getCustomer_type() {
		return customer_type;
	}
	public void setCustomer_type(String customer_type) {
		this.customer_type = customer_type;
	}
	public String getCompany_name() {
		return company_name;
	}
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}
	public String getContact_name() {
		return contact_name;
	}
	public void setContact_name(String contact_name) {
		this.contact_name = contact_name;
	}
	public String getAlternate_contactname() {
		return alternate_contactname;
	}
	public void setAlternate_contactname(String alternate_contactname) {
		this.alternate_contactname = alternate_contactname;
	}
	public Date getDate_entered() {
		return date_entered;
	}
	public void setDate_entered(Date date_entered) {
		this.date_entered = date_entered;
	}
	

	
}