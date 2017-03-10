package Views;

import java.io.IOException;
import java.util.logging.*;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import Controllers.MainController;
import Controllers.Logincontroller;

/** Manages control flow for logins */
public class LoginManager {
  private Scene scene;

  public LoginManager(Scene scene) {
    this.scene = scene;
  }

  /**
   * Callback method invoked to notify that a user has been authenticated.
   * Will show the main application screen.
   */ 


  /**
   * Callback method invoked to notify that a user has logged out of the main application.
   * Will show the login application screen.
   */ 
 public void showLoginScreen() {
    try {
      FXMLLoader loader = new FXMLLoader(
        getClass().getResource("login.fxml")
      );
      scene.setRoot((Parent) loader.load());
      Logincontroller controller = 
        loader.<Logincontroller>getController();
      //controller.initManager(this);
    } catch (IOException ex) {
      Logger.getLogger(LoginManager.class.getName()).log(Level.SEVERE, null, ex);
    }
  }

}
