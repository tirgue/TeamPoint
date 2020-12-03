package gui.view;

// Start of user code (user defined imports)
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

// End of user code

/**
 * Description of LoginView.
 * 
 *
 */
public class LoginView extends Application{
	// Start of user code (user defined attributes for LoginView)

	// End of user code

	/**
	 * The constructor.
	 */
	public LoginView() {
		// Start of user code constructor for LoginView)
		super();
		// End of user code
	}

	/**
	 * Description of the method start.
	 */
	public void start(Stage primaryStage) throws Exception{
		Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
		primaryStage.initStyle(StageStyle.UNDECORATED);
		primaryStage.setScene(new Scene(root, 450, 500));
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
