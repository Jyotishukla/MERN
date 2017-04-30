package model.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import model.Transaction;

public class TransactionDao extends Dao {
	public Transaction getTransaction(Integer transaction_id){
		Transaction transaction = null; 
		try {
			   String sql= "select * from transaction where user_Id = " + transaction_id ;
			   rs = executeFetchQuery(sql);   
			   if (rs.next()){ 
				   transaction = new Transaction();
				   transaction.setTransaction_id(rs.getInt("transaction_id"));
				   transaction.setOrder_id(rs.getInt("order_id"));
				   transaction.setPrice_id(rs.getInt("price_id"));
				   transaction.setEmployee_id(rs.getInt("employee_id"));
				   transaction.setTransaction_date(rs.getDate("transaction_date"));
				   transaction.setTransaction_description(rs.getString("transaction_description"));
				   transaction.setTransaction_amount(rs.getDouble("transaction_amount"));
				   transaction.setMake(rs.getString("make"));
				   transaction.setModel(rs.getString("model"));
				   transaction.setYear(rs.getInt("year"));
				   transaction.setTruck_id(rs.getInt("truck_id"));
				   transaction.setDiscount(rs.getDouble("discount"));
				   transaction.setQuality(rs.getString("quality"));
				   transaction.setUnit_price(rs.getDouble("unit_price"));
				   transaction.setDriver_price(rs.getDouble("driver_price"));
				   transaction.setVin(rs.getString("vin"));
				   transaction.setRun_number(rs.getString("run_number"));
				   transaction.setSpecial(rs.getString("special"));
				   transaction.setRate(rs.getDouble("rate"));
				   transaction.setSurcharge(rs.getDouble("surcharge"));
				   
			   }
			   
		  } 
		  catch (SQLException e) {
		   e.printStackTrace();
		  }
		  return transaction;
}		 
	public ArrayList<Transaction> getAllTransactions(){ 
		Transaction transaction = null;
		  ArrayList <Transaction> list = new ArrayList<Transaction>();
		  try {
		   String sql= "select * from Transactions" ;
		   rs = executeFetchQuery (sql);   

		   while (rs.next()){ 
			   transaction = new Transaction();
			   transaction.setTransaction_id(rs.getInt("transaction_id"));
			   transaction.setOrder_id(rs.getInt("order_id"));
			   transaction.setPrice_id(rs.getInt("price_id"));
			   transaction.setEmployee_id(rs.getInt("employee_id"));
			   transaction.setTransaction_date(rs.getDate("transaction_date"));
			   transaction.setTransaction_description(rs.getString("transaction_description"));
			   transaction.setTransaction_amount(rs.getDouble("transaction_amount"));
			   transaction.setMake(rs.getString("make"));
			   transaction.setModel(rs.getString("model"));
			   transaction.setYear(rs.getInt("year"));
			   transaction.setTruck_id(rs.getInt("truck_id"));
			   transaction.setDiscount(rs.getDouble("discount"));
			   transaction.setQuality(rs.getString("quality"));
			   transaction.setUnit_price(rs.getDouble("unit_price"));
			   transaction.setDriver_price(rs.getDouble("driver_price"));
			   transaction.setVin(rs.getString("vin"));
			   transaction.setRun_number(rs.getString("run_number"));
			   transaction.setSpecial(rs.getString("special"));
			   transaction.setRate(rs.getDouble("rate"));
			   transaction.setSurcharge(rs.getDouble("surcharge"));
		   }
		  } 
		  catch (SQLException e) {
		   e.printStackTrace();
		  } 
		  return list;  
		 } 
		}


				   
