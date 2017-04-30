package model.dao;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Order;

public class OrderDao extends Dao {
	public Order getOrder(Integer order_id){
		Order order = null;
		try {
			String sql= "select * from employees where user_Id = " + order_id ;
			rs = executeFetchQuery(sql);   
			if (rs.next()){ 
				order = new Order();
				order.setOrder_id(rs.getInt("order_id"));
				order.setOrder_date(rs.getDate("order_date"));
				order.setCustomer_id(rs.getInt("customer_id"));
				order.setEmployee_id(rs.getInt("employee_id"));
				order.setTruck_id(rs.getInt("truck_id"));
				order.setIs_special(rs.getString("is_special"));
				order.setPurchase_order_number(rs.getString("purchase_order_number"));
				order.setOrder_total_amount(rs.getString("order_total_amount"));

			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return order;
	}		 

	public ArrayList<Order> getAllOrders(){ 
		Order order = null;
		ArrayList <Order> list = new ArrayList<Order>();
		try {
			String sql= "select * from Orders" ;
			rs = executeFetchQuery (sql);   

			while (rs.next()){ 
				order = new Order();
				order.setOrder_id(rs.getInt("order_id"));
				order.setOrder_date(rs.getDate("order_date"));
				order.setCustomer_id(rs.getInt("customer_id"));
				order.setEmployee_id(rs.getInt("employee_id"));
				order.setTruck_id(rs.getInt("truck_id"));
				order.setIs_special(rs.getString("is_special"));
				order.setPurchase_order_number(rs.getString("purchase_order_number"));
				order.setOrder_total_amount(rs.getString("order_total_amount"));    
			}

		} 
		catch (SQLException e) {
			e.printStackTrace();
		} 
		return list;  
	}


}

