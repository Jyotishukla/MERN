package Controllers;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

import Models.Dbhandler;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * Newaccountcontroller java class contains all the controllers methods to craete a new account.
 * It has code which is specific to Models and Views.
 * This class contains add member method
 * @author Jyoti Shukla
 *
 */

public class Newaccountcontroller implements Initializable {
	
		Dbhandler dbhandler;
	
	  @FXML
	    private TextField name;

	    @FXML
	    private TextField pass;

	    @FXML
	    private TextField mobile;

	    @FXML
	    private TextField email;

	    @FXML
	    private Button savebutton;

	    @FXML
	    private Button cancelbutton;

	    @FXML
	    private void addmember(ActionEvent event) {
	    	String mName = name.getText();
	    	String mpass = pass.getText();
	    	String mMobile = mobile.getText();
	    	String mEmail = email.getText();
	    	
	    	Boolean flag = mName.isEmpty()||mpass.isEmpty()||mMobile.isEmpty()||mEmail.isEmpty();
	    	
	    	if(flag){    	
	    	Alert alert = new Alert(Alert.AlertType.ERROR);
			alert.setHeaderText(null);
			alert.setContentText("Enter all fields!");
			alert.showAndWait();
			return;
	    	}
	    	
	    	  String st = "INSERT INTO NEWMEMBER_LMS VALUES ("
	                  + "'" + mpass + "',"
	                  + "'" + mName + "',"
	                  + "'" + mMobile + "',"
	                  + "'" + mEmail + "'"
	                  + ")";
	    	  System.out.println(st);
	    	  if(dbhandler.execAction(st)){
	    		  Alert alert = new Alert(Alert.AlertType.INFORMATION);
	              alert.setHeaderText(null);
	              alert.setContentText("Saved");
	              alert.showAndWait();
	          } else {
	              Alert alert = new Alert(Alert.AlertType.ERROR);
	              alert.setHeaderText(null);
	              alert.setContentText("Error Occured");
	              alert.showAndWait();
	          }
	    	  }    	
	    

	    @FXML
	   private void cancel(ActionEvent event) {
	    	Stage stage = (Stage) cancelbutton.getScene().getWindow();
			stage.close();
	    }
	    
		@Override
		public void initialize(URL location, ResourceBundle resources)  {
			// TODO Auto-generated method stub
			try {
				dbhandler = Dbhandler.getInstance();
			} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		 @FXML
		    void back(ActionEvent event) {
		    	loadwindow("views/login.fxml", "Welcome To IIT Library Management System");
		    }
		    
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
