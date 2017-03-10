package Controllers;

import java.io.IOException;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Optional;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import Models.Dbhandler;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * MainController java class contains all the controllers methods for the application.
 * It has code which is specific to Models and Views.
 * This class contains for addbook,add member, issue book and submit book method.
 * @author Jyoti Shukla
 *
 */

public class MainController implements Initializable {
	
Dbhandler dbhandler;
@FXML
private Text Bookname;

@FXML
private TextField bookidinput;

@FXML
private Text Bookauthor;

@FXML
private Text bookstatus;

@FXML
private TextField memberidin;

@FXML
private Text membermobile;

@FXML
private Text membername;

@FXML
private TextField Bookid;


@FXML
private ListView<String> issuedatallist;

Boolean isReadyForSubmission = false;

/*
 *  MainController implements initializable to call to the initialize a controller after its root element has been  processed 
 * @see javafx.fxml.Initializable#initialize(java.net.URL, java.util.ResourceBundle)
 */

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		// TODO Auto-generated method stub
		try {
			dbhandler = Dbhandler.getInstance();
		
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/*
	 * loadaddbook on action method: This method is called when any member wants to donate book to the library
	 */
	
	  @FXML
	  private void loadaddbook(ActionEvent event) {
	
		  loadwindow("views/addbook.fxml", "Add new Book");
	    }
	  /*
		 * loadaddmember on action method: This method is called when any member wants to refer any friends to the library
		 */

	    @FXML
	    private void loadaddmember(ActionEvent event) throws IOException {
	    	loadwindow("views/addmember.fxml", "Add new Member");
	    }

	    /*
		 * loadlistbook on action method: This method is called when any member wants to seee the entire list of the book in the library
		 */
	   
	    @FXML
	    private void loadlistbook(ActionEvent event) {
	    	loadwindow("views/booklist.fxml", "View Book List");
	    }
	    /*
		 * loadlistmember on action method: This method is called when any member wants to see the the list of member in the library
		 */

	    @FXML
	    private void loadlistmember(ActionEvent event) {
	    	loadwindow("views/listmember.fxml", "View Member List");
	    }
	    
	    /*
		 * loadbookinfo on action method: This method is called when any member wants to search for the
		 *  status of any book in the library thrpugh portal
		 */

	    @FXML
	    private void loadbookinfo(ActionEvent event) {
	    	clearbookcache();
	    	
	    	String id = bookidinput.getText();
	    	String qu = "SELECT * FROM BOOK_LMS WHERE id = '" + id + "'";
	        ResultSet rs = dbhandler.execQuery(qu);
	        Boolean flag = false;
	    
	    try {
            while (rs.next()) {
                String bName = rs.getString("title");
                String bAuthor = rs.getString("author");
                Boolean bStatus = rs.getBoolean("isAvail");

                Bookname.setText(bName);
                Bookauthor.setText(bAuthor);
                String status = (bStatus) ? "Available" : "Not Available";
                bookstatus.setText(status);

                flag = true;
            }

            if (!flag) {
                Bookname.setText("No Such Book Available");
            }

        } catch (SQLException ex) {
            Logger.getLogger(MainController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
	    /*
	     * Clear cache for seraching book or any member
	     */
	    
	    void clearbookcache(){
	    	Bookname.setText("");
	    	Bookauthor.setText("");
	    	bookstatus.setText("");
	    }
	    
	    void clearmembercache(){
	    	membername.setText("");
	    	membermobile.setText("");
	    }
	    
	    @FXML
	    void loadmemberinfo(ActionEvent event) {
	    	clearmembercache();
	    	
	    	String id = memberidin.getText();
	    	String qu = "SELECT * FROM MEMBER_LMS WHERE id = '" + id + "'";
	        ResultSet rs = dbhandler.execQuery(qu);
	        Boolean flag = false;
	    
	    try {
            while (rs.next()) {
                String mName = rs.getString("name");
                String mMobile = rs.getString("mobile");

                membername.setText(mName);
                membermobile.setText(mMobile);
            

                flag = true;
            }

            if (!flag) {
                membername.setText("No Such Member Available");
            }

        } catch (SQLException ex) {
            Logger.getLogger(MainController.class.getName()).log(Level.SEVERE, null, ex);
        }

	    }
	    
	    /*
		 * loadbookinfo2 on action method: This method is called when any member wants to issue any book
		 * then, the book is issued and updates the BOOK_LMS as well as ISSUE_LMS table in the database.
		 */
	    
	    @FXML
	    void loadbookinfo2(ActionEvent event) {
	    	 ObservableList<String> issueData = FXCollections.observableArrayList();
	        isReadyForSubmission = false;
	         String id = Bookid.getText();
	         String qu = "SELECT * FROM ISSUE_LMS WHERE bookID = '" + id + "'";
	         ResultSet rs = dbhandler.execQuery(qu);
	         try {
	             while (rs.next()) {
	                 String mBookID = id;
	                 String mMemberID = rs.getString("memberID");
	                 Timestamp mIssueTime = rs.getTimestamp("issueTime");
	                 int mRenewCount = rs.getInt("renew_count");

                 issueData.add("Issue Date and Time :" + mIssueTime.toGMTString());
                 issueData.add("Renew Count :" + mRenewCount);
                 issueData.add("Book Information:-");
	                 
	                 qu = "SELECT * FROM BOOK_LMS WHERE ID = '" + mBookID + "'";
	                 ResultSet r1 = dbhandler.execQuery(qu);

	                 while (r1.next()) {
	                     issueData.add("\tBook Name :" + r1.getString("title"));
	                     issueData.add("\tBook ID :" + r1.getString("id"));
	                     issueData.add("\tBook Author :" + r1.getString("author"));
	                     issueData.add("\tBook Publisher :" + r1.getString("publisher"));
	                 }
	                 qu = "SELECT * FROM MEMBER_LMS WHERE ID = '" + mMemberID + "'";
	                 r1 = dbhandler.execQuery(qu);
	                 issueData.add("Member Information:-");

	                 while (r1.next()) {
	                     issueData.add("\tName :" + r1.getString("name"));
	                     issueData.add("\tMobile :" + r1.getString("mobile"));
	                     issueData.add("\tEmail :" + r1.getString("email"));
	                 }

	                 isReadyForSubmission = true;
	             }
	         } catch (SQLException ex) {
	             Logger.getLogger(MainController.class.getName()).log(Level.SEVERE, null, ex);
	         }
	        issuedatallist.getItems().setAll(issueData);
	    }
	    
	    /*
		 * loadissue on action method: This method is called when any member wants to issue any book
		 * this method updated the ISSUE_LMS table with memberid and book id
		 */
	    
	    @FXML
	    private void loadissue(ActionEvent event) {
	    	String memberID = memberidin.getText();
	        String bookID = bookidinput.getText();

	        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
	        alert.setTitle("Confirm Issue Operation");
	        alert.setHeaderText(null);
	        alert.setContentText("Are you sure want to issue the book " + Bookname.getText() + "\n to " + membername.getText() + " ?");

	        Optional<ButtonType> response = alert.showAndWait();
	        if (response.get() == ButtonType.OK) {
	            String str = "INSERT INTO ISSUE_LMS(memberID,bookID) VALUES ("
	                    + "'" + memberID + "',"
	                    + "'" + bookID + "')";
	            String str2 = "UPDATE BOOK_LMS SET isAvail = false WHERE id = '" + bookID + "'";
	            System.out.println(str + " and " + str2);

	            if (dbhandler.execAction(str) && dbhandler.execAction(str2)) {
	                Alert alert1 = new Alert(Alert.AlertType.INFORMATION);
	                alert1.setTitle("Success");
	                alert1.setHeaderText(null);
	                alert1.setContentText("Book Issue Complete");

	                alert1.showAndWait();
	            } else {
	                Alert alert1 = new Alert(Alert.AlertType.ERROR);
	                alert1.setTitle("Failed");
	                alert1.setHeaderText(null);
	                alert1.setContentText("Issue Operation Failed");
	                alert1.showAndWait();
	            }
	        } else {
	            Alert alert1 = new Alert(Alert.AlertType.INFORMATION);
	            alert1.setTitle("Cancelled");
	            alert1.setHeaderText(null);
	            alert1.setContentText("Issue Operation cancelled");
	            alert1.showAndWait();
	        }
	    }

	    /*
		 * loadsubmit on action method: This method is called when any member wants to return book to the library.
		 * then, this methd will update the BOOK_LMS table and Issue_LMS table accordingly
		 */
	    
	    @FXML
	    private void loadsubmit(ActionEvent event) {
	    	 if (!isReadyForSubmission) {
	             Alert alert = new Alert(Alert.AlertType.ERROR);
	             alert.setTitle("Failed");
	             alert.setHeaderText(null);
	             alert.setContentText("Please select a book to submit");
	             alert.showAndWait();
	             return;
	         }

	         Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
	         alert.setTitle("Confirm Submission Operation");
	         alert.setHeaderText(null);
	         alert.setContentText("Are you sure want to return the book ?");

	         Optional<ButtonType> response = alert.showAndWait();
	         if (response.get() == ButtonType.OK) {
	             String id = Bookid.getText();
	             String ac1 = "DELETE FROM ISSUE_LMS WHERE BOOKID = '" + id + "'";
	             String ac2 = "UPDATE BOOK_LMS SET ISAVAIL = TRUE WHERE ID = '" + id + "'";

	             if (dbhandler.execAction(ac1) && dbhandler.execAction(ac2)) {
	                 Alert alert1 = new Alert(Alert.AlertType.INFORMATION);
	                 alert1.setTitle("Success");
	                 alert1.setHeaderText(null);
	                 alert1.setContentText("Book Has Been Submitted");
	                 alert1.showAndWait();
	             } else {
	                 Alert alert1 = new Alert(Alert.AlertType.ERROR);
	                 alert1.setTitle("Failed");
	                 alert1.setHeaderText(null);
	                 alert1.setContentText("Submission Has Been Failed");
	                 alert1.showAndWait();
	             }
	         } else {
	             Alert alert1 = new Alert(Alert.AlertType.INFORMATION);
	             alert1.setTitle("Cancelled");
	             alert1.setHeaderText(null);
	             alert1.setContentText("Submission Operation cancelled");
	             alert1.showAndWait();
	         }
	    }
	    
	    /*
		 * loadrenew on action method: This method is called when any member wants to reissue the same book again. 
		 * then this method will update the ISSUE_LMS table and increase the count of the book for the particular member by 1
		 */
	    

	    @FXML
	    private void loadrenew(ActionEvent event) {
	    	if (!isReadyForSubmission) {
	            Alert alert = new Alert(Alert.AlertType.ERROR);
	            alert.setTitle("Failed");
	            alert.setHeaderText(null);
	            alert.setContentText("Please select a book to renew");
	            alert.showAndWait();
	            return;
	        }

	        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
	        alert.setTitle("Confirm Renew Operation");
	        alert.setHeaderText(null);
	        alert.setContentText("Are you sure want to renew the book ?");

	        Optional<ButtonType> response = alert.showAndWait();
	        if (response.get() == ButtonType.OK) {
	            String ac = "UPDATE ISSUE_LMS SET issueTime = CURRENT_TIMESTAMP, renew_count = renew_count+1 WHERE BOOKID = '" + Bookid.getText() + "'";
	            System.out.println(ac);
	            if (dbhandler.execAction(ac)) {
	                Alert alert1 = new Alert(Alert.AlertType.INFORMATION);
	                alert1.setTitle("Success");
	                alert1.setHeaderText(null);
	                alert1.setContentText("Book Has Been Renewed");
	                alert1.showAndWait();
	            } else {
	                Alert alert1 = new Alert(Alert.AlertType.ERROR);
	                alert1.setTitle("Failed");
	                alert1.setHeaderText(null);
	                alert1.setContentText("Renew Has Been Failed");
	                alert1.showAndWait();
	            }
	        } else {
	            Alert alert1 = new Alert(Alert.AlertType.INFORMATION);
	            alert1.setTitle("Cancelled");
	            alert1.setHeaderText(null);
	            alert1.setContentText("Renew Operation cancelled");
	            alert1.showAndWait();
	        }
	    }
	    
	    /*
		 * loadwindow on action method: This method is called when any member wants to go to another window from main page
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
