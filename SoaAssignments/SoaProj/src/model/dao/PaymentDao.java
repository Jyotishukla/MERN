package model.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import model.Payment;

public class PaymentDao extends Dao{
	public Payment getPayment(Integer payment_id){
		Payment payment = null; 
		try {
			String sql= "select * from employees where user_Id = " + payment_id ;
			rs = executeFetchQuery(sql);
			if (rs.next()){ 
				payment = new Payment();
				payment.setPayment_id(rs.getInt("payment_id"));
				payment.setOrder_id(rs.getInt("order_id"));
				payment.setPayment_method_id(rs.getInt("payment_method_id"));
				payment.setPayment_amount(rs.getDouble("payment_amount"));
				payment.setPayment_date(rs.getDate("payment_date"));
				payment.setCheck_number(rs.getString("check_number"));
				payment.setCredit_card(rs.getString("credit_card"));
				payment.setCredit_card_number(rs.getInt("credit_card_number"));
				payment.setCard_holder_name(rs.getString("card_holder_name"));
				payment.setCreditcard_exp_date(rs.getDate("creditcard_exp_date"));
				payment.setCreditcard_auth_num(rs.getString("creditcard_auth_num"));
			}
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		return payment;
	}
		public ArrayList<Payment> getAllPayments(){ 
			Payment payment = null;
			ArrayList <Payment> list = new ArrayList<Payment>();
			try {
				String sql= "select * from Payments" ;
				rs = executeFetchQuery (sql);   

				while (rs.next()){ 
					payment = new Payment();
					payment.setPayment_id(rs.getInt("payment_id"));
					payment.setOrder_id(rs.getInt("order_id"));
					payment.setPayment_method_id(rs.getInt("payment_method_id"));
					payment.setPayment_amount(rs.getDouble("payment_amount"));
					payment.setPayment_date(rs.getDate("payment_date"));
					payment.setCheck_number(rs.getString("check_number"));
					payment.setCredit_card(rs.getString("credit_card"));
					payment.setCredit_card_number(rs.getInt("credit_card_number"));
					payment.setCard_holder_name(rs.getString("card_holder_name"));
					payment.setCreditcard_exp_date(rs.getDate("creditcard_exp_date"));
					payment.setCreditcard_auth_num(rs.getString("creaditcard_auth_num"));
				}
			}
			catch (SQLException e) {
				e.printStackTrace();
			} 
			return list;  
		}
	}



