package Controllers.LoginPeserta;

import Views.ViewFactor;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

public class KursusPesertaController {

    ViewFactor m = new ViewFactor();

    @FXML
    private Button berandaPesertaButton;

    @FXML
    private AnchorPane kursusPeserta;

    @FXML
    private Button materiButton;

    @FXML
    private Button nasihatKarirButton;

    @FXML
    private Button pekerjaanButton;

    @FXML
    private Button riwayatButton;

    @FXML
    private Button sertifikatButton;

    @FXML
    private Button sukaButton;

    @FXML
    private Button ujianButton;

    @FXML
    void kursusKeBeranda(ActionEvent event) {
        m.berandaPeserta(kursusPeserta);
    }

    @FXML
    void kursusKeMateri(ActionEvent event) {
        m.materiPeserta(kursusPeserta);
    }

    @FXML
    void kursusKeNasihat(ActionEvent event) {
        m.nasihatKarir(kursusPeserta);
    }

    @FXML
    void kursusKePekerjaan(ActionEvent event) {
        m.pekerjaanPeserta(kursusPeserta);
    }

    @FXML
    void kursusKeRiwayat(ActionEvent event) {
        m.riwayatMateri(kursusPeserta);
    }

    @FXML
    void kursusKeSertifikatPeserta(ActionEvent event) {
        m.sertifikatPeserta(kursusPeserta);
    }

    @FXML
    void kursusKeSuka(ActionEvent event) {
        m.sukaMateri(kursusPeserta);
    }

    @FXML
    void kursusKeUjian(ActionEvent event) {
        m.ujianPeserta(kursusPeserta);
    }

}
