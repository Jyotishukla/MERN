package Views;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/*
 * This class is UI for the Listbookcontroller class and it allows the user to enter commands which will
 * change the model's state.
 * 
 */
public class Listbookloader extends Application{

	@Override
	public void start(Stage stage) throws Exception {
  Parent root = FXMLLoader.load(getClass().getResource("booklist.fxml"));      
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
	}
}
