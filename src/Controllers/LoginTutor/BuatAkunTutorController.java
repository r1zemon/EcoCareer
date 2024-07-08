package Controllers.LoginTutor;

import java.io.IOException;

import Models.RegisterModelTutor;
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

public class BuatAkunTutorController {

    ViewFactor m = new ViewFactor();

    @FXML
    private HBox allPane;

    @FXML
    private Text buatAkunText;

    @FXML
    private AnchorPane buatAkunTutor;

    @FXML
    private Button buatAkunTutorButton;

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
    private Button masukTutorButton;

    @FXML
    private TextField namaPenggunaField;

    @FXML
    private Text namaPenggunaText;

    @FXML
    private HBox semuaPane;

    @FXML
    private Text sudahPunyaAkunTutor;

    @FXML
    void klikMasukAkun(ActionEvent event) {
        String namaTutor = namaPenggunaField.getText();
        String emailTutor = emailField.getText();
        String kataSandiTutor = kataSandiField.getText();

        if (namaTutor.isEmpty() || emailTutor.isEmpty() || kataSandiTutor.isEmpty()) {
            // Show alert if any field is empty
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Registration Failed");
            alert.setHeaderText(null);
            alert.setContentText("Semua kolom registrasi harus di-isi untuk membuat Akun");
            alert.showAndWait();
        } else {
            if (RegisterModelTutor.insertData(0, namaTutor, emailTutor, kataSandiTutor)) { // Assuming id is auto-incremented in DB
                // Show alert if registration is successful
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Registration Successful");
                alert.setHeaderText(null);
                alert.setContentText("Akun berhasil dibuat");
                alert.showAndWait();
                
                try {
                    Parent root = FXMLLoader.load(getClass().getResource("/Resource/fxml/LoginTutor.fxml"));
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
    

    @FXML
    void klikMasukTutor(ActionEvent event) {
        m.ClickLoginTutor(buatAkunTutor);
    }

}
