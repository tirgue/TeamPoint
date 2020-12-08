package gui.controller;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

import javax.swing.text.html.ImageView;
import business_logic.UserFacade;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.stage.Stage;


// Start of user code (user defined imports)

// End of user code

/**
 * Description of LoginController.
 * 
 *
 */
public class LoginController implements Initializable{
	/**
	 * Description of the property userFacade.
	 */
	private UserFacade userFacade;

	@FXML
	private Label authentificationIncorrecte;

	@FXML
	private Button fermerButton;

	@FXML
	private ImageView logoImage;

	@FXML
	private TextField emailTextField;

	@FXML
	private PasswordField motDePassePasswordField;


	/**
	 * The constructor.
	 */
	public LoginController() {
		userFacade = UserFacade.getUserFacadeInstance();
	}


	/**
	 * When i click the red button, my window is closed
	 */
	public void fermerButtonOnAction(){
		Stage stage = (Stage) fermerButton.getScene().getWindow();
		stage.close();
	}

	@FXML
	public void seConnecterButtonOnAction(ActionEvent event){
		if(emailTextField.getText().isBlank() || motDePassePasswordField.getText().isBlank() || !userFacade.login(emailTextField.getText(),motDePassePasswordField.getText())){
			authIncorrecte();
		}else{
			//CHANGEMENT DE VUE
		}
	}

	@FXML
	public void authIncorrecte(){
		authentificationIncorrecte.setText("Email ou mot de passe incorrect");
	}

	@Override
	public void initialize(URL url, ResourceBundle resourceBundle) {
		File brandingFile = new File("images/teampoint.png");
		Image brandingImage = new Image(brandingFile.toURI().toString());
		//logoImage.setImage(brandingImage);
		// TODO : fix ImageView
	}
}
