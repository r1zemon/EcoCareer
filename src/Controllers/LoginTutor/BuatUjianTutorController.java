package Controllers.LoginTutor;

import Views.ViewFactor;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.AnchorPane;

public class BuatUjianTutorController {

    ViewFactor m = new ViewFactor();

    @FXML
    private Button berandaButton;

    @FXML
    private AnchorPane buatUjianTutor;

    @FXML
    private RadioButton delapanA;

    @FXML
    private RadioButton delapanB;

    @FXML
    private RadioButton delapanC;

    @FXML
    private RadioButton duaA;

    @FXML
    private RadioButton duaB;

    @FXML
    private RadioButton duaC;

    @FXML
    private RadioButton empatA;

    @FXML
    private RadioButton empatB;

    @FXML
    private RadioButton empatC;

    @FXML
    private RadioButton enamA;

    @FXML
    private RadioButton enamB;

    @FXML
    private RadioButton enamC;

    @FXML
    private RadioButton limaA;

    @FXML
    private RadioButton limaB;

    @FXML
    private RadioButton limaC;

    @FXML
    private Button materiButton;

    @FXML
    private RadioButton satuA;

    @FXML
    private RadioButton satuB;

    @FXML
    private RadioButton satuC;

    @FXML
    private RadioButton sembilanA;

    @FXML
    private RadioButton sembilanB;

    @FXML
    private RadioButton sembilanC;

    @FXML
    private RadioButton sepuluhA;

    @FXML
    private RadioButton sepuluhB;

    @FXML
    private RadioButton sepuluhC;

    @FXML
    private Button sertifikatButton;

    @FXML
    private RadioButton tigaA;

    @FXML
    private RadioButton tigaB;

    @FXML
    private RadioButton tigaC;

    @FXML
    private RadioButton tujuhA;

    @FXML
    private RadioButton tujuhB;

    @FXML
    private RadioButton tujuhC;

    @FXML
    void clickDelapanA(ActionEvent event) {

    }

    @FXML
    void clickDelapanB(ActionEvent event) {

    }

    @FXML
    void clickDelapanC(ActionEvent event) {

    }

    @FXML
    void clickDuaA(ActionEvent event) {

    }

    @FXML
    void clickDuaB(ActionEvent event) {

    }

    @FXML
    void clickDuaC(ActionEvent event) {

    }

    @FXML
    void clickEmpatA(ActionEvent event) {

    }

    @FXML
    void clickEmpatB(ActionEvent event) {

    }

    @FXML
    void clickEmpatC(ActionEvent event) {

    }

    @FXML
    void clickEnamA(ActionEvent event) {

    }

    @FXML
    void clickEnamB(ActionEvent event) {

    }

    @FXML
    void clickEnamC(ActionEvent event) {

    }

    @FXML
    void clickLimaA(ActionEvent event) {

    }

    @FXML
    void clickLimaB(ActionEvent event) {

    }

    @FXML
    void clickLimaC(ActionEvent event) {

    }

    @FXML
    void clickSatuA(ActionEvent event) {

    }

    @FXML
    void clickSatuB(ActionEvent event) {

    }

    @FXML
    void clickSatuC(ActionEvent event) {

    }

    @FXML
    void clickSembilanA(ActionEvent event) {

    }

    @FXML
    void clickSembilanB(ActionEvent event) {

    }

    @FXML
    void clickSembilanC(ActionEvent event) {

    }

    @FXML
    void clickSepuluhA(ActionEvent event) {

    }

    @FXML
    void clickSepuluhB(ActionEvent event) {

    }

    @FXML
    void clickSepuluhC(ActionEvent event) {

    }

    @FXML
    void clickTigaA(ActionEvent event) {

    }

    @FXML
    void clickTigaB(ActionEvent event) {

    }

    @FXML
    void clickTigaC(ActionEvent event) {

    }

    @FXML
    void clickTujuhA(ActionEvent event) {

    }

    @FXML
    void clickTujuhB(ActionEvent event) {

    }

    @FXML
    void clickTujuhC(ActionEvent event) {

    }

    @FXML
    void ujianKeBeranda(ActionEvent event) {
        m.berandaTutor(buatUjianTutor);
    }

    @FXML
    void ujianKeMateri(ActionEvent event) {
        m.menambahMateriTutor(buatUjianTutor);
    }

    @FXML
    void ujianKeSertifikat(ActionEvent event) {
        m.unggahSertifikatTutor(buatUjianTutor);
    }

}
