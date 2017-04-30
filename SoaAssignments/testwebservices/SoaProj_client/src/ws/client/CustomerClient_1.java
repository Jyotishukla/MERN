package ws.client;

import javax.swing.JOptionPane;

import ws.Customer;
import ws.CustomerWS;
import ws.CustomerWSServiceLocator;

public class CustomerClient_1 {

	private static void main(String[] args) {
		CustomerWSServiceLocator locator = new CustomerWSServiceLocator();
		try{
		CustomerWS customerws = (CustomerWS) locator.getCustomerWSPort();
		String customername = JOptionPane.showInputDialog("Enter the customer name");
		Customer[] customer = customerws.getCustomers();
		JOptionPane.showMessageDialog(null, "the name is" + customer);
		}catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "unable to reach the service" + e.getMessage());
		}
	}
}
