package Controllers;

import java.io.IOException;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import Models.Dbhandler;
import javafx.beans.property.SimpleBooleanProperty;
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
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import Controllers.Addbookcontroller;

/*
 * Listbookcontroller java class contains all the controllers methods to list all book into the library system..
 * This class contains for load data and initcol 
 * @author Jyoti Shukla
 */

public class Listbookcontroller implements Initializable {
	 ObservableList<Book> list = FXCollections.observableArrayList();
	
	 	@FXML
	    private AnchorPane rootpane;

	    @FXML
	    private TableView<Book> tableview;

	    @FXML
	    private TableColumn<Book, String> titlecol;

	    @FXML
	    private TableColumn<Book, String> idcol;

	    @FXML
	    private TableColumn<Book, String> publishercol;

	    @FXML
	    private TableColumn<Book, String> authorcol;

	    @FXML
	    private TableColumn<Book, Boolean> availablitycol;
	    
	    /*
	     * Listbookcontroller implements initializable to call to the initialize a controller after its root element has been  processed 
	     * @see javafx.fxml.Initializable#initialize(java.net.URL, java.util.ResourceBundle)
	     */
	    
	    public void initialize(URL url, ResourceBundle rb){
	    	initcol();	
	    	try {
				loadData();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
	    
	    /*
	     * loadData() method is used display all the data from BOOK_LMS table in the form of table in the portal
	     */
	    
	    private void loadData() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
	    	Dbhandler handler = Dbhandler.getInstance();
	    	String qu = "SELECT * FROM BOOK_LMS";
			ResultSet rs = handler.execQuery(qu);
			try{
				while (rs.next()) {
					String titlex = rs.getString("title");
	                String author = rs.getString("author");
	                String id = rs.getString("id");
	                String publisher = rs.getString("publisher");
	                Boolean avail = rs.getBoolean("isAvail");
	               
	                list.add(new Book(titlex, id, author, publisher, avail));
	               
				}
			}catch (SQLException ex) {
				// TODO: handle exception
				Logger.getLogger(Addbookcontroller.class.getName()).log(Level.SEVERE, null, ex);
			}
			 tableview.getItems().setAll(list);
		}

		private void initcol() {
			// TODO Auto-generated method stub
	    	titlecol.setCellValueFactory(new PropertyValueFactory<>("title"));
	        idcol.setCellValueFactory(new PropertyValueFactory<>("id"));
	        authorcol.setCellValueFactory(new PropertyValueFactory<>("author"));
	        publishercol.setCellValueFactory(new PropertyValueFactory<>("publisher"));
	        availablitycol.setCellValueFactory(new PropertyValueFactory<>("availabilty"));
		}

		public static class Book{
	    	private final SimpleStringProperty title;
	    	private final SimpleStringProperty id;
	    	private final SimpleStringProperty author;
	    	private final SimpleStringProperty publisher;
	    	private final SimpleBooleanProperty avaiabilty;
	    	
	    	Book(String title, String id, String author, String pub, Boolean avail){
	    		  this.title = new SimpleStringProperty(title);
	              this.id = new SimpleStringProperty(id);
	              this.author = new SimpleStringProperty(author);
	              this.publisher = new SimpleStringProperty(pub);
	              this.avaiabilty = new SimpleBooleanProperty(avail);
	    	}
	    	
	    	 public String getTitle() {
	             return title.get();
	         }
	    	 
	    	 public String getId() {
	             return id.get();
	         }

	         public String getAuthor() {
	             return author.get();
	         }

	         public String getPublisher() {
	             return publisher.get();
	         }

	         public Boolean getAvailabilty() {
	         
	         return avaiabilty.get();

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
