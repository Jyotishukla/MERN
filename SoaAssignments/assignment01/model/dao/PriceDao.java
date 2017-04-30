package model.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import model.Price;

public class PriceDao extends Dao{
	public Price getPrice(Integer price_id){
		Price price = null; 
		try {
			String sql= "select * from employees where user_Id = " + price_id ;
			rs = executeFetchQuery(sql); 
			if (rs.next()){ 
				price = new Price();
				price.setPrice_id(rs.getInt("price_id"));
				price.setLocation_id_from(rs.getInt("location_id_from"));
				price.setLocation_id_to(rs.getInt("location_id_to"));
				price.setLocation_id(rs.getInt("location_id"));
				price.setPrice(rs.getString("price"));
				price.setLocation_code_from(rs.getString("location_code_from"));
				price.setLocation_code_to(rs.getString("location_code_to"));

			}	   
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		return price;
	}		 
	public ArrayList<Price> getAllPrices(){ 
		Price price = null;
		ArrayList <Price> list = new ArrayList<Price>();
		try {
			String sql= "select * from Prices" ;
			rs = executeFetchQuery (sql);   

			while (rs.next()){ 
				price = new Price();
				price.setPrice_id(rs.getInt("price_id"));
				price.setLocation_id_from(rs.getInt("location_id_from"));
				price.setLocation_id_to(rs.getInt("location_id_to"));
				price.setLocation_id(rs.getInt("location_id"));
				price.setPrice(rs.getString("price"));
				price.setLocation_code_from(rs.getString("location_code_from"));
				price.setLocation_code_to(rs.getString("location_code_to"));    
			}
		} 
		catch (SQLException e) {
			e.printStackTrace();
		} 
		return list;  
	}	 
}


