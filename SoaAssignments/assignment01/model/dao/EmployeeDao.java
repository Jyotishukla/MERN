package model.dao;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Employee;

public class EmployeeDao extends Dao {
	 public Employee getEmployee(Integer employee_id){
		 Employee employee = null; 
		 try {
			   String sql= "select * from employees where user_Id = " + employee_id ;
			   rs = executeFetchQuery(sql);   
			   
			   if (rs.next()){ 
				   	employee = new Employee();
				   	employee.setEmployee_id(rs.getInt("employee_id"));
					employee.setFirst_name(rs.getString("first_name"));
					employee.setLast_name(rs.getString("last_name"));
					employee.setEmail(rs.getString("email"));
					employee.setExtension(rs.getString("extension"));
					employee.setHome_phone(rs.getString("home_phone"));	
					employee.setCell_phone(rs.getString("cell_phone"));
					employee.setJobtitle(rs.getString("jobtitle"));
					employee.setSsn(rs.getInt("ssn"));	
					employee.setDriver_license_number(rs.getString("driver_license_number"));
					employee.setAddress_id(rs.getInt("address_id"));
					employee.setBirth_date(rs.getDate("birth_date"));
					employee.setDate_hired(rs.getDate("date_hired"));
					employee.setSalary(rs.getDouble("salary"));
					employee.setNotes(rs.getString("notes"));
			    
			   }
			   
		  } 
		  catch (SQLException e) {
		   e.printStackTrace();
		  }
		  return employee;
}		 
	 
	 
	 public ArrayList<Employee> getAllEmployees(){ 
		 Employee employee = null;
		  ArrayList <Employee> list = new ArrayList<Employee>();
		  try {
		   String sql= "select * from Employees" ;
		   rs = executeFetchQuery (sql);   

		   while (rs.next()){ 
			   employee = new Employee();
			   	employee.setEmployee_id(rs.getInt("employee_id"));
				employee.setFirst_name(rs.getString("first_name"));
				employee.setLast_name(rs.getString("last_name"));
				employee.setEmail(rs.getString("email"));
				employee.setExtension(rs.getString("extension"));
				employee.setHome_phone(rs.getString("home_phone"));	
				employee.setCell_phone(rs.getString("cell_phone"));
				employee.setJobtitle(rs.getString("jobtitle"));
				employee.setSsn(rs.getInt("ssn"));	
				employee.setDriver_license_number(rs.getString("driver_license_number"));
				employee.setAddress_id(rs.getInt("address_id"));
				employee.setBirth_date(rs.getDate("birth_date"));
				employee.setDate_hired(rs.getDate("date_hired"));
				employee.setSalary(rs.getDouble("salary"));
				employee.setNotes(rs.getString("notes"));
		   }
		  } 
		  catch (SQLException e) {
		   e.printStackTrace();
		  } 
		  return list;  
		 } 
		}

