package Controllers.LoginPeserta;

import Views.ViewFactor;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

public class MateriPesertaController {

    ViewFactor m = new ViewFactor();

    @FXML
    private Button isiMateri2;

    @FXML
    private Button berandaButton;

    @FXML
    private Button judulMateriButton;

    @FXML
    private Button kursusButton;

    @FXML
    private AnchorPane materiPeserta;

    @FXML
    private Button nasihatButton;

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
    void materiKeBeranda(ActionEvent event) {
        m.berandaPeserta(materiPeserta);
    }

    @FXML
    void materiKeIsiMateri(ActionEvent event) {
        m.isiMateri(materiPeserta);
    }

    @FXML
    void materiKeKursus(ActionEvent event) {
        m.kursusPeserta(materiPeserta);
    }

    @FXML
    void materiKeNasihat(ActionEvent event) {
        m.nasihatKarir(materiPeserta);
    }

    @FXML
    void materiKePekerjaan(ActionEvent event) {
        m.pekerjaanPeserta(materiPeserta);
    }

    @FXML
    void materiKeRiwayat(ActionEvent event) {
        m.riwayatMateri(materiPeserta);
    }

    @FXML
    void materiKeSertifikat(ActionEvent event) {
        m.sertifikatPeserta(materiPeserta);
    }

    @FXML
    void materiKeSuka(ActionEvent event) {
        m.sukaMateri(materiPeserta);
    }

    @FXML
    void materiKeUjian(ActionEvent event) {
        m.ujianPeserta(materiPeserta);
    }

    @FXML
    void materiKeIsiMateri2(ActionEvent event) {
        m.isiMateri2(materiPeserta);
    }

}
