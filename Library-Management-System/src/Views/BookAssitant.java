package Views;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/*
 * This class is UI for the addbookcontroller class and it allows the user to enter commands which will
 * change the model's state.
 * 
 */
public class BookAssitant extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		Parent root = FXMLLoader.load(getClass().getResource("addbook.fxml"));
		      
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
		
	}
}
