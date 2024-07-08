package Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import Views.ViewFactor;

public class LoginPertamaController {

    ViewFactor m = new ViewFactor();

    @FXML
    private AnchorPane LoginPertama;

    @FXML
    private HBox fullHbox;

    @FXML
    private Pane kananPane;

    @FXML
    private Pane kiriPane;

    @FXML
    private Button masukSebagaiKonselorButton;

    @FXML
    private Button masukSebagaiPesertaButton;

    @FXML
    private Button masukSebagaiTutorButton;

    @FXML
    private HBox semuaHbox;  

    @FXML
    void klikPeserta(ActionEvent event) {
        m.clickLoginPeserta(LoginPertama);
    }

    @FXML
    void klikTutor(ActionEvent event) {
        m.ClickLoginTutor(LoginPertama);
    }

    @FXML
    void klikKonselor(ActionEvent event) {
        m.klikLoginKonselor(LoginPertama);
    }

}
