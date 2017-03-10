package Controllers;

import java.io.IOException;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import Models.Dbhandler;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import Controllers.Addbookcontroller;

/*
 * Listmembercontroller java class contains all the controllers methods to list all member's dtails from the library system..
 * This class contains for load data and initcol 
 * @author Jyoti Shukla
 */

public class Listmembercontroller implements Initializable {
	
	 ObservableList<Member> list = FXCollections.observableArrayList();

	
	@FXML
    private TableView<Member> tableview;

    @FXML
    private TableColumn<Member, String> namecol;

    @FXML
    private TableColumn<Member, String> idcol;

    @FXML
    private TableColumn<Member, String> mobilecol;

    @FXML
    private TableColumn<Member, String> emailcol;

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		initcol();
		
		try {
			loadData();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
	}
	
	/*
	 * initcol() method is used to create a column of all the details of members in a table
	 */
	
	private void initcol() {
    	namecol.setCellValueFactory(new PropertyValueFactory<>("name"));
        idcol.setCellValueFactory(new PropertyValueFactory<>("id"));
        mobilecol.setCellValueFactory(new PropertyValueFactory<>("mobile"));
        emailcol.setCellValueFactory(new PropertyValueFactory<>("email"));
      
	}
	
	  /*
     * loadData() method is used display all the member details from MEMBER_LMS table in the form of table in the portal
     */
	
    private void loadData() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
        Dbhandler handler = Dbhandler.getInstance();
        String qu = "SELECT * FROM MEMBER_LMS";
        ResultSet rs = handler.execQuery(qu);
        try {
            while (rs.next()) {
                String name = rs.getString("name");
                String mobile = rs.getString("mobile");
                String id = rs.getString("id");
                String email = rs.getString("email");
               
                list.add(new Member(name, id, mobile, email));
               
            }
        } catch (SQLException ex) {
            Logger.getLogger(Addbookcontroller.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        tableview.getItems().setAll(list);
    }

	public static class Member{
    	private final SimpleStringProperty name;
    	private final SimpleStringProperty id;
    	private final SimpleStringProperty mobile;
    	private final SimpleStringProperty email;
    	
    	Member(String name, String id, String mobile, String email){
    		  this.name = new SimpleStringProperty(name);
              this.id = new SimpleStringProperty(id);
              this.mobile = new SimpleStringProperty(mobile);
              this.email = new SimpleStringProperty(email);
    	}
    	
    	
    	 public String getName() {
             return name.get();
         }
    	 
    	 public String getId() {
             return id.get();
         }

         public String getMobile() {
             return mobile.get();
         }

         public String getEmail() {
             return email.get();
         }    	
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
