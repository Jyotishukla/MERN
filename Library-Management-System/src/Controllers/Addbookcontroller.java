package Controllers;

import java.io.IOException;
import java.net.URL;
import java.sql.ResultSet;
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
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/*
 * Addbookcontroller java class contains all the controllers methods to add any book into the library system..
 * This class contains for add book and check data 
 * @author Jyoti Shukla
 */
public class Addbookcontroller implements Initializable {
	@FXML
	private TextField title;

	@FXML
	private TextField id;

	@FXML
	private TextField author;

	@FXML
	private TextField publisher;

	@FXML
	private Button savebutton;

	@FXML
	private Button cancelbutton;
	
	 @FXML
	    private AnchorPane rootPane;

	Dbhandler Dbhandler;
	
	/*
	 *  Addbookcontroller implements initializable to call to the initialize a controller after its root element has been  processed 
	 * @see javafx.fxml.Initializable#initialize(java.net.URL, java.util.ResourceBundle)
	 */

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		// TODO Auto-generated method stub
		try {
			Dbhandler = Dbhandler.getInstance();
			checkdata();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	/*
	 * addbook method is called to insert the book into the BOOK_LMS table in the database
	 */

	@FXML
	private void addbook(ActionEvent event) {
		String bookID = id.getText();
		String bookauthor = author.getText();
		String booktitle = title.getText();
		String bookpublisher = publisher.getText();

		if (bookID.isEmpty() || bookauthor.isEmpty() || booktitle.isEmpty() || bookpublisher.isEmpty()) {
			Alert alert = new Alert(Alert.AlertType.ERROR);
			alert.setHeaderText(null);
			alert.setContentText("Please enter all fields!!");
			alert.showAndWait();
			return;

		}

		String qu = "INSERT INTO BOOK_LMS VALUES (" + "'" + bookID + "'," + "'" + bookauthor + "'," + "'" + booktitle + "',"
				+ "'" + bookpublisher + "'," + "" + "true" + "" + ")";
		System.out.println(qu);
		if (Dbhandler.execAction(qu)) {
			Alert alert = new Alert(Alert.AlertType.INFORMATION);
			alert.setHeaderText(null);
			alert.setContentText("Sucess");
			alert.showAndWait();
			
		} else {
			Alert alert = new Alert(Alert.AlertType.ERROR);
			alert.setHeaderText(null);
			alert.setContentText("Failed");
			alert.showAndWait();
			
		}
	}	

	/*
	 * checkdata method is called to check the book details in the portal using book id
	 */

	private void checkdata() {
		// TODO Auto-generated method stub
		String qu = "SELECT title FROM BOOK_LMS";
		ResultSet rs = Dbhandler.execQuery(qu);
		try{
			while (rs.next()) {
				String titlex = rs.getString("title");
				System.out.println(titlex);
				
			}
		}catch (SQLException ex) {
			// TODO: handle exception
			Logger.getLogger(Addbookcontroller.class.getName()).log(Level.SEVERE, null, ex);
		}
		
	}
	
	@FXML
	private void cancel(ActionEvent event) {
		Stage stage = (Stage) rootPane.getScene().getWindow();
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
