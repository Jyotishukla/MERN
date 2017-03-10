package Models;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * Dbhandler is a database handler file which create connection between the application and the database server
 * In this class all the table is created using prepared statement i.e. BOOK_LMS, ISSUE_LMS, MEMBER_LMS, NEWMEMBER_LMS
 */

public class Dbhandler {
	
	private static Dbhandler handler = null;;
	private static final String DB_URL="jdbc:mysql://www.papademas.net/fp?";
	private static final String user= "dbfp";
	private static final String password = "510";
	private static Connection conn = null;
	private static Statement stmt = null;
	
	/*
	 * Dbhandler constructor is used to call all the methods efficiently.
	 */
	public Dbhandler() throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException {
		createConnection();
		setupBookTable();
		setupmembertable();
		setupIssueTable();
		setupnewaccount();
	}
	
 /*
  * createconnection method is used to make connection between the application and the database server
  */

	void createConnection(){
    	try{
    		Class.forName("com.mysql.jdbc.Driver").newInstance();
        	conn= DriverManager.getConnection(DB_URL,user,password);
    	}catch (Exception e) {
    		e.printStackTrace();
		}
    }
	
	/*
	 * setupbookTable() method is used to create a table named BOOK_LMS in which all the books will store form the library
	 */
	
	void setupBookTable() {
        String TABLE_NAME = "BOOK_LMS";
        try {
            stmt = conn.createStatement();

            DatabaseMetaData dbm = conn.getMetaData();
            ResultSet tables = dbm.getTables(null, null, TABLE_NAME.toUpperCase(), null);

            if (tables.next()) {
                System.out.println("Table " + TABLE_NAME + "already exists. Ready for go!");
            } else {
                stmt.execute("CREATE TABLE " + TABLE_NAME + "("
                        + "	id varchar(200) primary key,\n"
                        + "	title varchar(200),\n"
                        + "	author varchar(200),\n"
                        + "	publisher varchar(100),\n"
                        + "	isAvail boolean default true"
                        + " )");
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage() + " --- setupDatabase");
        } 
    }

    //for inserting or updating the database and it will return the boolean value whether it works or nor
	
    public boolean execAction(String qu) {
        try {
            stmt = conn.createStatement();
            stmt.execute(qu);
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error:" + ex.getMessage(), "Error Occured", JOptionPane.ERROR_MESSAGE);
            System.out.println("Exception at execQuery:dataHandler" + ex.getLocalizedMessage());
            return false;
        } finally {
        }
    }	
		
    public static Dbhandler getInstance() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException
    {
        if(handler==null)
        {
            handler = new Dbhandler();
        }
        return handler;
    }
    
	/*
	 * setupmemberTable() method is used to create a table named MEMBER_LMS in which all the member details will store form the library
	 */
	
    
     void setupmembertable() {
    	 String TABLE_NAME = "MEMBER_LMS";
         try {
             stmt = conn.createStatement();

             DatabaseMetaData dbm = conn.getMetaData();
             ResultSet tables = dbm.getTables(null, null, TABLE_NAME.toUpperCase(), null);

             if (tables.next()) {
                 System.out.println("Table " + TABLE_NAME + "already exists. Ready for go!");
             } else {
                 stmt.execute("CREATE TABLE " + TABLE_NAME + "("
                         + "	id varchar(200) primary key,\n"
                         + "	name varchar(200),\n"
                         + "	mobile varchar(20),\n"
                         + "	email varchar(100)"
                        
                         + " )");
    
                 
             }
         } catch (SQLException e) {
             System.err.println(e.getMessage() + " --- setupDatabase");
         } finally {
         }
 		
 	}
     
     /*
 	 * setupissueTable() method is used to create a table named MEMBER_LMS in which all the member details will store form the library
 	 */
 	 
     void setupIssueTable() {
         String TABLE_NAME = "ISSUE_LMS";
         try {
             
             stmt = conn.createStatement();
             DatabaseMetaData dbm = conn.getMetaData();
             
             ResultSet tables = dbm.getTables(null, null, TABLE_NAME.toUpperCase(), null);
             if (tables.next()) {
                 System.out.println("Table " + TABLE_NAME + " already exists. Ready for go!");
             } 
             else {
                 stmt.execute("CREATE TABLE " + TABLE_NAME + "("
                         + "     bookID varchar(200) primary key,\n"
                         + "	memberID varchar(200),\n"
                         + "	issueTime timestamp default CURRENT_TIMESTAMP,\n"
                         + "	renew_count integer default 0,\n"
                         + "	FOREIGN KEY (bookID) REFERENCES BOOK_LMS(id),\n"
                         + "	FOREIGN KEY (memberID) REFERENCES MEMBER_LMS(id)"
                         + " )");
             }
         } catch (SQLException e) {
             System.err.println(e.getMessage() + " --- setupDatabase");
         } finally {
         }
     }
     
     /*
  	 * setupnewaccountTable() method is used to create a table named NEWMEMBER_LMS in which all the member details will store form the library
  	 * and helped member to login to the portal
  	 */
     
 	void setupnewaccount() {
        String TABLE_NAME = "NEWMEMBER_LMS";
        try {
            stmt = conn.createStatement();

            DatabaseMetaData dbm = conn.getMetaData();
            ResultSet tables = dbm.getTables(null, null, TABLE_NAME.toUpperCase(), null);

            if (tables.next()) {
                System.out.println("Table " + TABLE_NAME + "already exists. Ready for go!");
            } else {
                stmt.execute("CREATE TABLE " + TABLE_NAME + "("
                        + "	password varchar(200),\n"
                        + "	name varchar(200),\n"
                        + "	mobile int,\n"
                        + "	email varchar(100)"
                        + " )");
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage() + " --- setupDatabase");
        } 
 	}
    
 	
 	public ResultSet execQuery(String query) {
         ResultSet result;
         try {
             stmt = conn.createStatement();
             result = stmt.executeQuery(query);
         } catch (SQLException ex) {
             System.out.println("Exception at execQuery:dataHandler" + ex.getLocalizedMessage());
             return null;
         } finally {
         }
         return result;
     }

    }
