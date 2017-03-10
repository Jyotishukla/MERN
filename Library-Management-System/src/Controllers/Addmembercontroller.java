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

/*
 * Addmembercontroler java class contains all the controllers methods to add any member into the library system..
 * This class contains method for add member
 * @author Jyoti Shukla
 */
public class Addmembercontroller implements Initializable {
	
	Dbhandler handler;
	
	@FXML
    private TextField name;

    @FXML
    private TextField id;

    @FXML
    private TextField mobile;

    @FXML
    private TextField email;

    @FXML
    private Button savebutton;

    @FXML
    private Button cancelbutton;

	/*
	 *  Addmembercontroller implements initializable to call to the initialize a controller after its root element has been  processed 
	 * @see javafx.fxml.Initializable#initialize(java.net.URL, java.util.ResourceBundle)
	 */
	@Override
	public void initialize(URL location, ResourceBundle resources)  {
		// TODO Auto-generated method stub
		try {
			handler = Dbhandler.getInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/*
	 * addmember method is called to insert the member detaisl into the MEMBER_LMS table in the database
	 */


    @FXML
   private void addmember(ActionEvent event) {
    	String mName = name.getText();
    	String mID = id.getText();
    	String mMobile = mobile.getText();
    	String mEmail = email.getText();
    	
    	Boolean flag = mName.isEmpty()||mID.isEmpty()||mMobile.isEmpty()||mEmail.isEmpty();
    	
    	if(flag){    	
    	Alert alert = new Alert(Alert.AlertType.ERROR);
		alert.setHeaderText(null);
		alert.setContentText("Failed");
		alert.showAndWait();
		return;
    	}
    	
    	  String st = "INSERT INTO MEMBER_LMS VALUES ("
                  + "'" + mID + "',"
                  + "'" + mName + "',"
                  + "'" + mMobile + "',"
                  + "'" + mEmail + "'"
                  + ")";
    	  System.out.println(st);
    	  if(handler.execAction(st)){
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
    @FXML
    void back(ActionEvent event) {
    	loadwindow("views/main.fxml", "View Book List");
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

