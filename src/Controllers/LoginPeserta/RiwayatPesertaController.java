package Controllers.LoginPeserta;

import Views.ViewFactor;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

public class RiwayatPesertaController {

    ViewFactor m = new ViewFactor();

    @FXML
    private AnchorPane RiwayatMateri;

    @FXML
    private Button berandaButton;

    @FXML
    private Button kursusButton;

    @FXML
    private Button materiButton;

    @FXML
    private Button nasihatButton;

    @FXML
    private Button pekerjaanButton;

    @FXML
    private Button sertifikatButton;

    @FXML
    private Button sukaButton;

    @FXML
    private Button ujianButton;

    @FXML
    void riwayatKeBeranda(ActionEvent event) {
        m.berandaPeserta(RiwayatMateri);
    }

    @FXML
    void riwayatKeKursus(ActionEvent event) {
        m.kursusPeserta(RiwayatMateri);
    }

    @FXML
    void riwayatKeMateri(ActionEvent event) {
        m.materiPeserta(RiwayatMateri);
    }

    @FXML
    void riwayatKeNasihat(ActionEvent event) {
        m.nasihatKarir(RiwayatMateri);
    }

    @FXML
    void riwayatKePekerjaan(ActionEvent event) {
        m.pekerjaanPeserta(RiwayatMateri);
    }

    @FXML
    void riwayatKeSertifikat(ActionEvent event) {
        m.sertifikatPeserta(RiwayatMateri);
    }

    @FXML
    void riwayatKeSuka(ActionEvent event) {
        m.sukaMateri(RiwayatMateri);
    }

    @FXML
    void riwayatKeUjian(ActionEvent event) {
        m.ujianPeserta(RiwayatMateri);
    }

}

