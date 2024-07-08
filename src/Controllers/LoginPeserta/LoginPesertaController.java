package Controllers.LoginPeserta;

import java.io.IOException;

import Models.LoginModel;
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

public class LoginPesertaController {
    ViewFactor m = new ViewFactor();

    @FXML
    private AnchorPane akun;
    
    @FXML
    private AnchorPane LoginPertama;

    @FXML
    private HBox allHbox;

    @FXML
    private Text blmPunyaAkunText;

    @FXML
    private Button buatAkunButton;

    @FXML
    private Pane kananPane;

    @FXML
    private Text kataSandi;

    @FXML
    private TextField kataSandiField;

    @FXML
    private Pane kiriPane;

    @FXML
    private Button kembaliButton;

    @FXML
    private Button masukPesertaButton;

    @FXML
    private Text masukText;

    @FXML
    private TextField namaPenggunaField;

    @FXML
    private Text namaPenggunaText;

    @FXML
    private HBox semuaHbox;

    // @FXML
    // void clickBuatAkun(ActionEvent event) {
    //     m.ClickBuatAkun(akun);
    // }

    @FXML
    void kembaliKePertama(ActionEvent event) {
        m.klikKembaliLoginPertama(akun);
    }

    @FXML
    void klikPesertaKeBeranda(ActionEvent event) {
        String username = namaPenggunaField.getText();
        String password = kataSandiField.getText();
        
        if (LoginModel.login(username, password)) {
            try {
                Parent root = FXMLLoader.load(getClass().getResource("/Resource/fxml/BerandaPeserta.fxml"));
                Stage stage = (Stage) namaPenggunaField.getScene().getWindow();
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

    @FXML
    void clickBuatAkun(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/Resource/fxml/BuatAkunPeserta.fxml"));
            Stage stage = (Stage) namaPenggunaField.getScene().getWindow();
            stage.setScene(new Scene(root, 1540, 800));
            stage.setTitle("Register");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
