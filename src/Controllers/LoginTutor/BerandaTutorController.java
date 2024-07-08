package Controllers.LoginTutor;

import Views.ViewFactor;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

public class BerandaTutorController {
    
    ViewFactor m = new ViewFactor();

    @FXML
    private Button berandaButton;

    @FXML
    private AnchorPane berandaTutor;

    @FXML
    private Button materiButton;

    @FXML
    private Label namaTutorButton;

    @FXML
    private Button ujianButton;

    @FXML
    void berandaKeMateri(ActionEvent event) {
        m.menambahMateriTutor(berandaTutor);
    }

    @FXML
    void berandaKeSertifikat(ActionEvent event) {
        m.unggahSertifikatTutor(berandaTutor);
    }

    @FXML
    void berandaKeUjian(ActionEvent event) {
        m.buatUjianTutor(berandaButton);
    }

}
