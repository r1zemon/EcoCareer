package Controllers.LoginKonselor;

import java.io.IOException;

import Models.LoginModelKonselor;
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
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class LoginKonselorController {

    ViewFactor m = new ViewFactor();

    @FXML
    private AnchorPane LoginKonselor;

    @FXML
    private Text belumPunyaAkunText;

    @FXML
    private Button buatAkunKonselorButton;

    @FXML
    private TextField emailKonselorField;

    @FXML
    private TextField kataSandiKonselorField;

    @FXML
    private Text kataSandiText;

    @FXML
    private Button kembaliKonselorButton;

    @FXML
    private Button masukKonselorButton;

    @FXML
    void keBuatAkunKonselor(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/Resource/fxml/BuatAkunKonselor.fxml"));
            Stage stage = (Stage) emailKonselorField.getScene().getWindow();
            stage.setScene(new Scene(root, 1540, 800));
            stage.setTitle("Register");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void kembaliKePertama(ActionEvent event) {
        m.klikKembaliLoginPertama(LoginKonselor);
    }

    @FXML
    void masukKeBerandaKonselor(ActionEvent event) {
        String username = emailKonselorField.getText();
        String password = kataSandiKonselorField.getText();
        
        if (LoginModelKonselor.login(username, password)) {
            try {
                Parent root = FXMLLoader.load(getClass().getResource("/Resource/fxml/BerandaKonselor.fxml"));
                Stage stage = (Stage) emailKonselorField.getScene().getWindow();
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


