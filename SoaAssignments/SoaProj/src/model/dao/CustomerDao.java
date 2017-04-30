package model.dao;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Customer;

public class CustomerDao extends Dao {
	
	 public Customer getCustomer(Integer customer_id){
		  Customer customer = null; 
		  try {
		   String sql= "select * from customers where customer_id = " + customer_id ;
		   rs = executeFetchQuery(sql);   

		   if (rs.next()){ 
		    customer = new Customer();
		    customer.setCustomer_id(rs.getInt("customer_id"));
		    customer.setCustomer_title(rs.getString("customer_title"));
		    customer.setBuisness_name(rs.getString("buisness_name"));
		    customer.setBilling_address(rs.getString("billing_address"));
		    customer.setPhone_no(rs.getInt("phone_no"));
		    customer.setAddress_id(rs.getInt("address_id"));
		    customer.setCell_number(rs.getInt("cell_number"));
		    customer.setOther_number(rs.getInt("other_number"));
		    customer.setFax_number(rs.getInt("fax_number"));
		    customer.setEmail_address(rs.getString("email_address"));
		    customer.setCustomer_type(rs.getString("customer_type"));
		    customer.setCompany_name(rs.getString("company_name"));
		    customer.setContact_name(rs.getString("contact_name"));
		    customer.setAlternate_contactname(rs.getString("alternate_contactname"));  
		    customer.setDate_entered(rs.getDate("date_entered"));
	
		   }
		   
		  } 
		  catch (SQLException e) {
		   e.printStackTrace();
		  }
		  return customer;
}
	 public ArrayList<Customer> getAllCustomers(){ 
		  Customer customer = null;
		  ArrayList <Customer> list = new ArrayList<Customer>();
		  try {
		   String sql= "select * from customers" ;
		   rs = executeFetchQuery (sql);   

		   while (rs.next()){ 
		    customer = new Customer();
		    customer.setCustomer_id(rs.getInt("customer_id"));
		    customer.setCustomer_title(rs.getString("customer_title"));
		    customer.setBuisness_name(rs.getString("buisness_name"));
		    customer.setBilling_address(rs.getString("billing_address"));
		    customer.setPhone_no(rs.getInt("phone_no"));
		    customer.setAddress_id(rs.getInt("address_id"));
		    customer.setCell_number(rs.getInt("cell_number"));
		    customer.setOther_number(rs.getInt("other_number"));
		    customer.setFax_number(rs.getInt("fax_number"));
		    customer.setEmail_address(rs.getString("email_address"));
		    customer.setCustomer_type(rs.getString("customer_type"));
		    customer.setCompany_name(rs.getString("company_name"));
		    customer.setContact_name(rs.getString("contact_name"));
		    customer.setAlternate_contactname(rs.getString("alternate_contactname"));  
		    customer.setDate_entered(rs.getDate("date_entered"));
		    list.add(customer);
		   }

		  } 
		  catch (SQLException e) {
		   e.printStackTrace();
		  } 
		  return list;  
		 }

		 
		}