package model.dao;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Truck;

public class TruckDao extends Dao {
	

	public Truck getTruck(Integer truck_id){
		Truck truck = null; 
		try {
			String sql= "select * from Trucks where truck_id = " + truck_id ;
			rs = executeFetchQuery(sql);
			if (rs.next()){	
				truck = new Truck();
				truck.setId(Integer.parseInt(rs.getString("truck_id")));
				truck.setMake(rs.getString("make"));
				truck.setYear(rs.getInt("year"));
				truck.setModel(rs.getString("model"));
				truck.setLicense_plate_no(rs.getInt("license_plate_no"));	
				truck.setEmployee_id(rs.getInt("employee_id"));
				truck.setColor(rs.getString("color"));
			}

		} 
		catch (SQLException e) {
			e.printStackTrace();
		}

		return truck;
	}

	public ArrayList<Truck> getAllTrucks(){	
		Truck truck = null;
		ArrayList <Truck> list = new ArrayList<Truck>();
		try {
			String sql= "select * from Trucks" ;
			rs = executeFetchQuery (sql);			

			while (rs.next()){	
				truck =  new Truck();
				truck.setId(Integer.parseInt(rs.getString("truck_id")));
				truck.setMake(rs.getString("make"));
				truck.setYear(rs.getInt("year"));
				truck.setModel(rs.getString("model"));
				truck.setLicense_plate_no(rs.getInt("license_plate_no"));	
				truck.setEmployee_id(rs.getInt("employee_id"));
				truck.setColor(rs.getString("color"));
				list.add(truck);
			}

		} 
		catch (SQLException e) {
			e.printStackTrace();
		}	
		return list;		
	}
}
	