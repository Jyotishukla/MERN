package Views;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/*
 * This class is UI for the Listmembercontroller class and it allows the user to enter commands which will
 * change the model's state.
 * 
 */
public class Listmemberloader extends Application {
	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		Parent root = FXMLLoader.load(getClass().getResource("listmember.fxml"));
		
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
		
	}
	
}
