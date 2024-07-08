package Controllers.LoginPeserta;

import java.sql.SQLException;

import Models.Menu.SertifikasiModel;
import Models.Menu.Sertifikat;
import Models.Menu.UjianModel;
import Views.ViewFactor;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.AnchorPane;

public class UjianPesertaController {
    ViewFactor m = new ViewFactor();

    @FXML
    private Button berandaButton;

    @FXML
    private RadioButton duaA;

    @FXML
    private RadioButton duaB;

    @FXML
    private RadioButton duaC;

    @FXML
    private Button kirim;

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
    private RadioButton satuA;

    @FXML
    private RadioButton satuB;

    @FXML
    private RadioButton satuC;

    @FXML
    private RadioButton empatA;

    @FXML
    private RadioButton empatB;

    @FXML
    private RadioButton empatC;

    @FXML
    private RadioButton limaA;

    @FXML
    private RadioButton limaB;

    @FXML
    private RadioButton limaC;

    @FXML
    private RadioButton enamA;

    @FXML
    private RadioButton enamB;

    @FXML
    private RadioButton enamC;

    @FXML
    private RadioButton tujuhA;

    @FXML
    private RadioButton tujuhB;

    @FXML
    private RadioButton tujuhC;

    @FXML
    private RadioButton delapanA;

    @FXML
    private RadioButton delapanB;

    @FXML
    private RadioButton delapanC;

    @FXML
    private RadioButton sembilanA;

    @FXML
    private RadioButton sembilanB;

    @FXML
    private RadioButton sembilanC;

    @FXML
    private Button resetButton;

    @FXML
    private RadioButton sepuluhA;

    @FXML
    private RadioButton sepuluhB;

    @FXML
    private RadioButton sepuluhC;

    @FXML
    private Button sertifikatButton;

    @FXML
    private Button sukaButton;

    @FXML
    private RadioButton tigaA;

    @FXML
    private RadioButton tigaB;

    @FXML
    private RadioButton tigaC;

    @FXML
    private AnchorPane ujianPeserta;

    @FXML
    void bersihkanJawabanUjian(ActionEvent event) {

    }

    private final String defaultImagePath = "/Resource/Images/sertifikat.jpg";

    private void insertAnswer(String answer) {
        boolean success = UjianModel.insertPilihan(answer);
        if (success) {
            System.out.println("Data inserted successfully: " + answer);
        } else {
            System.out.println("Failed to insert data: " + answer);
        }
    }

    @FXML
    void clickDuaA(ActionEvent event) {
        duaA.getText();
        insertAnswer("Manajer");  
    }

    @FXML
    void clickDuaB(ActionEvent event) {
        duaB.getText();
        insertAnswer("Teknisi");
    }

    @FXML
    void clickDuaC(ActionEvent event) {
        duaC.getText();
        insertAnswer("Pekerja Lapangan");
    }

    @FXML
    void clickKirim(ActionEvent event) {
        SertifikasiModel sertifikasiModel = new SertifikasiModel(defaultImagePath);
        Sertifikat sertifikatModel = new Sertifikat();

        try {
            sertifikatModel.save(sertifikasiModel);
            System.out.println("Saved certification to database.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void clickSatuA(ActionEvent event) {
        satuA.getText();
        insertAnswer("Manajer");
    }

    @FXML
    void clickSatuB(ActionEvent event) {
        satuB.getText();
        insertAnswer("Teknisi");
    }

    @FXML
    void clickSatuC(ActionEvent event) {
        satuC.getText();
        insertAnswer("Pekerja Lapangan");
    }

    @FXML
    void clickTigaA(ActionEvent event) {
        tigaA.getText();
        insertAnswer("Teknisi");
    }

    @FXML
    void clickTigaB(ActionEvent event) {
        tigaB.getText();
        insertAnswer("Manajer");
    }

    @FXML
    void clickTigaC(ActionEvent event) {
        tigaC.getText();
        insertAnswer("Pekerja Lapangan");
    }

    @FXML
    void clickEmpatA(ActionEvent event) {
        tigaA.getText();
        insertAnswer("Teknisi");
    }

    @FXML
    void clickEmpatB(ActionEvent event) {
        tigaB.getText();
        insertAnswer("Manajer");
    }

    @FXML
    void clickEmpatC(ActionEvent event) {
        tigaC.getText();
        insertAnswer("Pekerja Lapangan");
    }

    @FXML
    void clickLimaA(ActionEvent event) {
        tigaA.getText();
        insertAnswer("Manajer");
    }

    @FXML
    void clickLimaB(ActionEvent event) {
        tigaB.getText();
        insertAnswer("Teknisi");
    }

    @FXML
    void clickLimaC(ActionEvent event) {
        tigaC.getText();
        insertAnswer("Pekerja Lapangan");
    }

    @FXML
    void clickEnamA(ActionEvent event) {
        tigaA.getText();
        insertAnswer("Pekerja Lapangan");
    }

    @FXML
    void clickEnamB(ActionEvent event) {
        tigaB.getText();
        insertAnswer("Manajer");
    }

    @FXML
    void clickEnamC(ActionEvent event) {
        tigaC.getText();
        insertAnswer("Teknisi");
    }

    @FXML
    void clickTujuhA(ActionEvent event) {
        tigaA.getText();
        insertAnswer("Manajer");
    }

    @FXML
    void clickTujuhB(ActionEvent event) {
        tigaB.getText();
        insertAnswer("Pekerja Lapangan");
    }

    @FXML
    void clickTujuhC(ActionEvent event) {
        tigaC.getText();
        insertAnswer("Teknisi");
    }

    @FXML
    void clickDelapanA(ActionEvent event) {
        tigaA.getText();
        insertAnswer("Teknisi");
    }

    @FXML
    void clickDelapanB(ActionEvent event) {
        tigaB.getText();
        insertAnswer("Manajer");
    }

    @FXML
    void clickDelapanC(ActionEvent event) {
        tigaC.getText();
        insertAnswer("Pekerja Lapangan");
    }

    @FXML
    void clickSembilanA(ActionEvent event) {
        tigaA.getText();
        insertAnswer("Teknisi");
    }

    @FXML
    void clickSembilanB(ActionEvent event) {
        tigaB.getText();
        insertAnswer("Pekerja Lapangan");
    }

    @FXML
    void clickSembilanC(ActionEvent event) {
        tigaC.getText();
        insertAnswer("Manajer");
    }

    @FXML
    void clickSepuluhA(ActionEvent event) {
        tigaA.getText();
        insertAnswer("Teknisi");
    }

    @FXML
    void clickSepuluhB(ActionEvent event) {
        tigaB.getText();
        insertAnswer("Pekerja Lapangan");
    }

    @FXML
    void clickSepuluhC(ActionEvent event) {
        tigaC.getText();
        insertAnswer("Manajer");
    }

    @FXML
    void ujianKeBeranda(ActionEvent event) {
        m.berandaPeserta(ujianPeserta);
    }

    @FXML
    void ujianKeKursus(ActionEvent event) {
        m.kursusPeserta(ujianPeserta);
    }

    @FXML
    void ujianKeMateri(ActionEvent event) {
        m.materiPeserta(ujianPeserta);
    }

    @FXML
    void ujianKeNasihat(ActionEvent event) {
        m.nasihatKarir(ujianPeserta);
    }

    @FXML
    void ujianKePekerjaan(ActionEvent event) {
        m.pekerjaanPeserta(ujianPeserta);
    }

    @FXML
    void ujianKeRiwayat(ActionEvent event) {
        m.riwayatMateri(ujianPeserta);
    }

    @FXML
    void ujianKeSertifikat(ActionEvent event) {
        m.sertifikatPeserta(ujianPeserta);
    }

    @FXML
    void ujianKeSuka(ActionEvent event) {
        m.sukaMateri(ujianPeserta);
    }
}

