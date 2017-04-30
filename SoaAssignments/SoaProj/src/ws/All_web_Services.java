package ws;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import model.Customer;
import model.Employee;
import model.Order;
import model.Price;
import model.Transaction;
import model.Truck;
import model.dao.CustomerDao;
import model.dao.EmployeeDao;
import model.dao.OrderDao;
import model.dao.PriceDao;
import model.dao.TransactionDao;
import model.dao.TruckDao;

@WebService
public class All_web_Services {
	
	@WebMethod
	public Customer getCustomer(Integer customerId){
		CustomerDao cd = new CustomerDao();
		Customer customer = cd.getCustomer(customerId);
		return customer ;                                                             
	}
	
	@WebMethod
	public List<Customer> getCustomers(){
		CustomerDao cd = new CustomerDao();
		List<Customer> customers = cd.getAllCustomers();
		return customers ;                                                             
	}
	
	@WebMethod
	public List<Employee> getEmployee() {
		EmployeeDao ed = new EmployeeDao();
		List<Employee> tlist = ed.getAllEmployees();
		return tlist;
	}
	
	@WebMethod
	public Employee getEmployeeByName(String employeename) {
		EmployeeDao ed = new EmployeeDao();
		Employee emp = ed.getEmployeeByName(employeename);
		return emp;
	}
	
	@WebMethod
	public Order getOrder(Integer orderId){
		OrderDao orderdao = new OrderDao();
		Order order = orderdao.getOrder(orderId);
		TransactionDao transdoa = new TransactionDao();
		Transaction trans = transdoa.getTransaction(order.getOrder_id());
		CustomerDao cusdoa = new CustomerDao();
		Customer cust = cusdoa.getCustomer(order.getCustomer_id());
		order.setCustomer(cust);
		order.setTransaction(trans);
		return order;
	}
	
	@WebMethod
	public List<Order> getOrders(){
		OrderDao orderdao = new OrderDao();
		List<Order> orders = orderdao.getAllOrders();
		return orders;		
	}
	
	@WebMethod
	public Price getpricetofrom(Integer location_id_from, Integer location_id_to) {
		PriceDao pd = new PriceDao();
		Price price = pd.getpriceByToFrom(location_id_from, location_id_to);
		return price;
	}

	@WebMethod
	public List<Price> getpriceAll() {
		PriceDao pd = new PriceDao();
		List<Price> plist = pd.getAllPrices();
		return plist;
	}
	
	@WebMethod
	public Truck getTruck(Integer truckId){
		Truck truck = null;
		try{
			TruckDao td = new TruckDao();
			truck = td.getTruck(truckId);
			EmployeeDao empDao = new EmployeeDao();
			Employee emp = empDao.getEmployee(truck.getEmployee_id());
			truck.setEmployee(emp);			
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		return truck;
	}

	@WebMethod
	public List<Truck> getTrucks() {
		TruckDao td = new TruckDao();
		List<Truck> tlist = td.getAllTrucks();
		return tlist;
	}

}
