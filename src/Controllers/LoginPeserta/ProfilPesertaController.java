package Controllers.LoginPeserta;

import Views.ViewFactor;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

public class ProfilPesertaController {

    ViewFactor m = new ViewFactor();

    @FXML
    private Button berandaButton;
    
    @FXML
    private Button keluarButton;

    @FXML
    private AnchorPane profilPeserta;

    @FXML
    void profilKeBeranda(ActionEvent event) {
        m.berandaPeserta(profilPeserta);
    }

    @FXML
    void profilPesertaKePertama(ActionEvent event) {
        m.klikKembaliLoginPertama(profilPeserta);
    }

}
