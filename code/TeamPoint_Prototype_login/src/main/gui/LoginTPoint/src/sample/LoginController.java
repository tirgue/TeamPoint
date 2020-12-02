package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.event.ActionEvent;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {

    @FXML
    private Label authentificationIncorrecte;

    @FXML
    private ImageView logoImage;

    @FXML
    private TextField emailTextField;

    @FXML
    private PasswordField motDePassePasswordField;

    @FXML
    public void seConnecterButtonOnAction(ActionEvent event){
        if(emailTextField.getText().isBlank() == false && motDePassePasswordField.getText().isBlank() == false){
            validerConnexion();
        }else{
            authentificationIncorrecte.setText("Veuillez saisir votre email et mot de passe");
        }
    }

    @FXML
    public void validerConnexion(){
        authentificationIncorrecte.setText("TEST VOUS VOUS CONNECTER LA");
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        File brandingFile = new File("images/teampoint.png");
        Image brandingImage = new Image(brandingFile.toURI().toString());
        logoImage.setImage(brandingImage);
    }
}
