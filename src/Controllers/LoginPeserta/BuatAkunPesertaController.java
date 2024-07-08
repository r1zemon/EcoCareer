package Controllers.LoginPeserta;

import java.io.IOException;

import Models.RegisterModel;
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

public class BuatAkunPesertaController {

    ViewFactor m = new ViewFactor();

    @FXML
    private AnchorPane akun;

    @FXML
    private HBox allHbox;

    @FXML
    private AnchorPane buatAkun;

    @FXML
    private Text buatAkunText;

    @FXML
    private TextField emailField;

    @FXML
    private Text emailText;

    @FXML
    private Pane kananPane;

    @FXML
    private TextField kataSandiField;

    @FXML
    private Text kataSandiText;

    @FXML
    private Pane kiriPane;

    @FXML
    private Button loginButton;

    @FXML
    private Button masukButton;

    @FXML
    private TextField namaPenggunaField;

    @FXML
    private Text namaPenggunText;

    @FXML
    private Text sdhPunyaAkunText;

    @FXML
    private HBox semuaHbox;


    @FXML
    void klikMasuk(ActionEvent event) {
        m.clickLoginPeserta(buatAkun);
    }

    @FXML
    void klikBuatAkunPeserta(ActionEvent event) {
        String namaPeserta = namaPenggunaField.getText();
        String emailPeserta = emailField.getText();
        String kataSandiPeserta = kataSandiField.getText();

        if (namaPeserta.isEmpty() || emailPeserta.isEmpty() || kataSandiPeserta.isEmpty()) {
            // Show alert if any field is empty
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Registration Failed");
            alert.setHeaderText(null);
            alert.setContentText("Semua kolom registrasi harus di-isi untuk membuat Akun");
            alert.showAndWait();
        } else {
            if (RegisterModel.insertData(0, namaPeserta, emailPeserta, kataSandiPeserta)) { // Assuming id is auto-incremented in DB
                // Show alert if registration is successful
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Registration Successful");
                alert.setHeaderText(null);
                alert.setContentText("Akun berhasil dibuat");
                alert.showAndWait();
                
                try {
                    Parent root = FXMLLoader.load(getClass().getResource("/Resource/fxml/LoginPeserta.fxml"));
                    Stage stage = (Stage) namaPenggunaField.getScene().getWindow();
                    stage.setScene(new Scene(root, 1500, 800));
                    stage.setTitle("Login Page");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else {
                // Show alert if registration fails
                Alert alert = new Alert(AlertType.ERROR);
                alert.setTitle("Registration Failed");
                alert.setHeaderText(null);
                alert.setContentText("Failed to create account. Please try again.");
                alert.showAndWait();
            }
        }
    }
}
