package Controllers.LoginPeserta;

import Views.ViewFactor;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;

public class BerandaPesertaController {

    ViewFactor m = new ViewFactor();
    
    @FXML
    private AnchorPane berandaPeserta;

    @FXML
    private Button kursusButton;

    @FXML
    private Button materiButton;

    @FXML
    private Button nasihatKarirButton;

    @FXML
    private Button pekerjaanButton;

    @FXML
    private Button riwayatButton;

    @FXML
    private Button namaPesertaButton;

    @FXML
    private Button sertifikatButton;

    @FXML
    private Button sukaButton;

    @FXML
    private Button ujianButton;

    @FXML
    void berandaKeKursusPeserta(ActionEvent event) {
        m.kursusPeserta(berandaPeserta);
    }

    @FXML
    void berandaKeMateriPeserta(ActionEvent event) {
        m.materiPeserta(berandaPeserta);
    }

    @FXML
    void berandaKeNasihatPeserta(ActionEvent event) {
        m.nasihatKarir(berandaPeserta);
    }

    @FXML
    void berandaKePekerjaanPeserta(ActionEvent event) {
        m.pekerjaanPeserta(berandaPeserta);
    }

    @FXML
    void berandaKeRiwayatPeserta(ActionEvent event) {
        m.riwayatMateri(berandaPeserta);
    }

    @FXML
    void berandaKeSertifikatPeserta(ActionEvent event) {
        m.sertifikatPeserta(berandaPeserta);

    }

    @FXML
    void berandaKeSukaMateri(ActionEvent event) {
        m.sukaMateri(berandaPeserta);
    }

    @FXML
    void berandaKeUjianPeserta(ActionEvent event) {
        m.ujianPeserta(berandaPeserta);
    }

    @FXML
    void klikKeBerandaPeserta(MouseEvent event) {

    }

    @FXML
    void berandaKeProfilPeserta(ActionEvent event) {
        m.profilPeserta(berandaPeserta);
    }

    

}
