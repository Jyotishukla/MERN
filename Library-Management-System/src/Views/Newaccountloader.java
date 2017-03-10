package Views;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/*
 * This class is UI for the Newaccountcontroller class and it allows the user to enter commands which will
 * change the model's state and create new account for them.
 * 
 */
public class Newaccountloader extends Application {
	@Override
	public void start(Stage stage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("newaccount.fxml"));
		stage.setTitle("Create New Account!!");
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();	
	}
	
}
