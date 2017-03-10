package Controllers;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import Controllers.MainController;
import Models.Dbhandler;

/*
 * Logincontroller java class contains all the controllers methods to Login to the library management system portal
 * In this java class we connected our application to the www.papademas.net/fp server database and 
 * fetched the login credentials from MEMBER_LMS table
 * This class contains for load data and initcol 
 * @author Jyoti Shukla
 */


public class Logincontroller{
	Dbhandler db;
	
	 String DB_URL="jdbc:mysql://www.papademas.net/fp?";
		private static final String user= "dbfp";
		private static final String password = "510";
	PreparedStatement pst = null;
	ResultSet rs = null;
	
	@FXML
    private TextField usernamein;

    @FXML
    private PasswordField passwordin;
    
    @FXML
    private Button login;
    
    @FXML
    private Label invalidlogin;

/*
 * loadcreatenewaccount() is an action event. This will led to Create New account portal from Login portal
 */
    @FXML
    void loadcreatenewaccount(ActionEvent event) {
    	loadwindow("views/newaccount.fxml", "Create New Account");
    }
    
    /*
     * loadlogin() action event helps member to login to the Lubrary system and it will fetch the login 
     * credentials from MEMBER_LMS table
     */

    @FXML
    void loadlogin(ActionEvent event) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
    	String qu = "select * from NEWMEMBER_LMS where name = ? and password = ?";
    	try(Connection conn = DriverManager.getConnection(DB_URL,user,password);
    			PreparedStatement prpstmt = conn.prepareStatement(qu); )
    			{
    			prpstmt.setString(1, usernamein.getText());
    			prpstmt.setString(2, passwordin.getText());
    			rs = prpstmt.executeQuery();
    			
    			
    			if(rs.next()){
    				invalidlogin.setText("Login Sucessfull!!");
    				loadwindow("views/main.fxml", "Welcome to Library Management System");
    			}else {
    				invalidlogin.setText("Login Failed!!!");
    			}
    			pst.close();
    			rs.close();
    	}catch(Exception e){
    		System.err.println(e);
    	}
   }

/*
 * loadwindow is method used to jump from one window to another just by using the address of that fxml file.
 */
    void loadwindow(String loc, String title){
    	try{
    		Parent parent = FXMLLoader.load(getClass().getClassLoader().getResource(loc));
    		Stage stage = new Stage(StageStyle.DECORATED);
    		stage.setTitle(title);
    		stage.setScene(new Scene(parent));
    		stage.show();
    		  	}catch (IOException e) {
					// TODO: handle exception
    		  		Logger.getLogger(MainController.class.getName()).log(Level.SEVERE, null, e);
				}
    }
	

}
