package Controllers.LoginTutor;

import java.io.IOException;

import Models.LoginModelTutor;
import Views.ViewFactor;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class LoginTutorController {

    ViewFactor m = new ViewFactor();

    @FXML
    private AnchorPane LoginTutor;

    @FXML
    private HBox allHbox;

    @FXML
    private Text belumPunyaAkunText;

    @FXML
    private Button buatAkun;

    @FXML
    private Text emailTutorText;

    @FXML
    private Pane kananPane;

    @FXML
    private Text kataSandiText;

    @FXML
    private TextField kataSandiTutorField;

    @FXML
    private Button loginButton;

    @FXML
    private Text masukText;

    @FXML
    private TextField emailTutorField;

    @FXML
    private Pane paneKiri;

    @FXML
    private HBox semuaHbox;

    @FXML
    private Button kembaliTutorButton;

    @FXML
    void kembaliKePertama(ActionEvent event) {
        m.klikKembaliLoginPertama(LoginTutor);
    }

    @FXML
    void buatAkunTutor(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/Resource/fxml/BuatAkunTutor.fxml"));
            Stage stage = (Stage) emailTutorField.getScene().getWindow();
            stage.setScene(new Scene(root, 1540, 800));
            stage.setTitle("Register");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @FXML
    void masukKeBerandaTutor(ActionEvent event) {
        String username = emailTutorField.getText();
        String password = kataSandiTutorField.getText();
        
        if (LoginModelTutor.login(username, password)) {
            try {
                Parent root = FXMLLoader.load(getClass().getResource("/Resource/fxml/BerandaTutor.fxml"));
                Stage stage = (Stage) emailTutorField.getScene().getWindow();
                stage.setScene(new Scene(root, 1540, 800));
                stage.setTitle("Home Page");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            // Show alert if login fails
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Login Failed");
            alert.setHeaderText(null);
            alert.setContentText("Email atau Password yang anda masukkan salah");
            alert.showAndWait();
    }
    

}
}