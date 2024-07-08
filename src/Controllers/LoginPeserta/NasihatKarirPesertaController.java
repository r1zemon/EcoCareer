// package Controllers.LoginPeserta;

// import Views.ViewFactor;
// import javafx.event.ActionEvent;
// import javafx.fxml.FXML;
// import javafx.scene.control.Button;
// import javafx.scene.layout.AnchorPane;

// public class NasihatKarirPesertaController {

//     ViewFactor m = new ViewFactor();

//     @FXML
//     private Button berandaButton;

//     @FXML
//     private Button kursusButton;

//     @FXML
//     private Button materiButton;

//     @FXML
//     private AnchorPane nasihatKarir;

//     @FXML
//     private Button pekerjaanButton;

//     @FXML
//     private Button riwayatButton;

//     @FXML
//     private Button sertifikatButton;

//     @FXML
//     private Button sukaButton;

//     @FXML
//     private Button ujianButton;

//     @FXML
//     void nasihatKeBeranda(ActionEvent event) {
//         m.berandaPeserta(nasihatKarir);
//     }

//     @FXML
//     void nasihatKeKursus(ActionEvent event) {
//         m.kursusPeserta(nasihatKarir);
//     }

//     @FXML
//     void nasihatKeMateri(ActionEvent event) {
//         m.materiPeserta(nasihatKarir);
//     }

//     @FXML
//     void nasihatKePekerjaan(ActionEvent event) {

//     }

//     @FXML
//     void nasihatKeRiwayat(ActionEvent event) {
        
//     }

//     @FXML
//     void nasihatKeSertifikat(ActionEvent event) {
//         m.sertifikatPeserta(nasihatKarir);
//     }

//     @FXML
//     void nasihatKeSuka(ActionEvent event) {
//         m.sukaMateri(nasihatKarir);
//     }

//     @FXML
//     void nasihatKeUjian(ActionEvent event) {

//     }

// }

package Controllers.LoginPeserta;

import Views.ViewFactor;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;

public class NasihatKarirPesertaController {

    ViewFactor m = new ViewFactor();

    @FXML
    private Button berandaButton;

    @FXML
    private Button kursusButton;

    @FXML
    private Button materiButton;

    @FXML
    private AnchorPane nasihatKarir;

    @FXML
    private Button pekerjaanButton;

    @FXML
    private Button riwayatButton;

    @FXML
    private Button sertifikatButton;

    @FXML
    private HBox sukaButton;

    @FXML
    private Button sukaMateriButton;

    @FXML
    private Button ujianButton;

    @FXML
    void nasihatKeBeranda(ActionEvent event) {
        m.berandaPeserta(nasihatKarir);
    }

    @FXML
    void nasihatKeKursus(ActionEvent event) {
        m.kursusPeserta(nasihatKarir);
    }

    @FXML
    void nasihatKeMateri(ActionEvent event) {
        m.materiPeserta(nasihatKarir);
    }

    @FXML
    void nasihatKePekerjaan(ActionEvent event) {
        m.pekerjaanPeserta(nasihatKarir);
    }

    @FXML
    void nasihatKeRiwayat(ActionEvent event) {
        m.riwayatMateri(nasihatKarir);
    }

    @FXML
    void nasihatKeSertifikat(ActionEvent event) {
        m.sertifikatPeserta(nasihatKarir);
    }

    @FXML
    void nasihatKeSuka(ActionEvent event) {
        m.sukaMateri(nasihatKarir);
    }

    @FXML
    void nasihatKeUjian(ActionEvent event) {
        m.ujianPeserta(nasihatKarir);
    }

}

