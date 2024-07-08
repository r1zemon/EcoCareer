package Controllers.LoginPeserta;

import Views.ViewFactor;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

public class SukaMateriController {

    ViewFactor m = new ViewFactor();

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
    private Button riwayatButton;

     @FXML
    private AnchorPane sukaMateri;

    @FXML
    private Button sertifikatButton;

    @FXML
    private Button ujianButton;

    @FXML
    void sukaKeBeranda(ActionEvent event) {
        m.berandaPeserta(sukaMateri);

    }

    @FXML
    void sukaKeKursus(ActionEvent event) {
        m.kursusPeserta(sukaMateri);
    }

    @FXML
    void sukaKeMateri(ActionEvent event) {
        m.materiPeserta(sukaMateri);
    }

    @FXML
    void sukaKeNasihat(ActionEvent event) {
        m.nasihatKarir(sukaMateri);
    }

    @FXML
    void sukaKePekerjaan(ActionEvent event) {
        m.pekerjaanPeserta(sukaMateri);
    }

    @FXML
    void sukaKeRiwayat(ActionEvent event) {
        m.riwayatMateri(sukaMateri);
    }

    @FXML
    void sukaKeSertifikat(ActionEvent event) {
        m.sertifikatPeserta(sukaMateri);
    }

    @FXML
    void sukaKeUjian(ActionEvent event) {
        m.ujianPeserta(sukaMateri);
    }

}
