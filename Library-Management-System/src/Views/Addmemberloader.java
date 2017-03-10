package Views;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/*
 * This class is UI for the addmembercontroller class and it allows the user to enter commands which will
 * change the model's state.
 * 
 */

public class Addmemberloader extends Application{
	@Override
	public void start(Stage stage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("addmember.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();	
	}
}
