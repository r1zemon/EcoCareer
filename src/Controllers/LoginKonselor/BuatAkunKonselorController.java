package Controllers.LoginKonselor;

import java.io.IOException;

import Models.RegisterModelKonselor;
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

public class BuatAkunKonselorController {

    ViewFactor m = new ViewFactor();

    @FXML
    private AnchorPane buatAkunKonselor;

    @FXML
    private Button buatAkunKonselorButton;

    @FXML
    private TextField emailKonselorField;

    @FXML
    private Text emailKonselorText;

    @FXML
    private TextField kataSandiKonselorField;

    @FXML
    private Text kataSandiKonselorText;

    @FXML
    private Button masukKonselorButton;

    @FXML
    private TextField namaKonselorField;

    @FXML
    private Text namaPenggunaKonselorText;

    @FXML
    void buatAkunKeMasukKonselor(ActionEvent event) {
        m.loginKonselor(buatAkunKonselor);
    }

    @FXML
    void klikMasukKonselor(ActionEvent event) {
        String namaKonselor = namaKonselorField.getText();
        String emailKonselor = emailKonselorField.getText();
        String kataSandiKonselor = kataSandiKonselorField.getText();

        if (namaKonselor.isEmpty() || emailKonselor.isEmpty() || kataSandiKonselor.isEmpty()) {
            // Show alert if any field is empty
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Registration Failed");
            alert.setHeaderText(null);
            alert.setContentText("Semua kolom registrasi harus di-isi untuk membuat Akun");
            alert.showAndWait();
        } else {
            if (RegisterModelKonselor.insertData(0, namaKonselor, emailKonselor, kataSandiKonselor)) { // Assuming id is auto-incremented in DB
                // Show alert if registration is successful
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Registration Successful");
                alert.setHeaderText(null);
                alert.setContentText("Akun berhasil dibuat");
                alert.showAndWait();
                
                try {
                    Parent root = FXMLLoader.load(getClass().getResource("/Resource/fxml/LoginKonselor.fxml"));
                    Stage stage = (Stage) namaKonselorField.getScene().getWindow();
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
