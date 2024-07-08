package Controllers.LoginPeserta;

import java.sql.SQLException;

import Models.Menu.SertifikasiModel;
import Views.ViewFactor;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class SertifikatPesertaController {

    ViewFactor m = new ViewFactor();

    @FXML
    private AnchorPane SertifikatPeserta;

    @FXML
    private Button berandaButton;

    @FXML
    private ImageView image;

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
    private Button sukaButton;

    @FXML
    private Button ujianButton;

    private SertifikasiModel sertifikasiModel;

@FXML
public void initialize() {
    sertifikasiModel = new SertifikasiModel();

    int idSertifikasi = 1;
    String imagePath = getCertificationImagePath(idSertifikasi);
    
    if (imagePath != null) {
        Image m = new Image(getClass().getResourceAsStream(imagePath));
        image.setImage(m);
    } else {
        System.out.println("Gambar sertifikasi tidak ditemukan.");
    }
}

public String getCertificationImagePath(int id) {
    String imagePath = null;
    try {
        SertifikasiModel sertifikasi = sertifikasiModel.load(id);
        if (sertifikasi != null) {
            imagePath = sertifikasi.getImagePath();
        } else {
            System.out.println("Sertifikasi dengan ID " + id + " tidak ditemukan.");
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return imagePath;
}

    @FXML
    void sertifikatKeBeranda(ActionEvent event) {
        m.berandaPeserta(SertifikatPeserta);
    }

    @FXML
    void sertifikatKeKursus(ActionEvent event) {
        m.kursusPeserta(SertifikatPeserta);
    }

    @FXML
    void sertifikatKeMateri(ActionEvent event) {
        m.materiPeserta(SertifikatPeserta);
    }

    @FXML
    void sertifikatKeNasihat(ActionEvent event) {
        m.nasihatKarir(SertifikatPeserta);
    }

    @FXML
    void sertifikatKePekerjaan(ActionEvent event) {
        m.pekerjaanPeserta(SertifikatPeserta);
    }

    @FXML
    void sertifikatKeRiwayat(ActionEvent event) {
        m.riwayatMateri(SertifikatPeserta);
    }

    @FXML
    void sertifikatKeSuka(ActionEvent event) {
        m.sukaMateri(SertifikatPeserta);

    }

    @FXML
    void sertifikatKeUjian(ActionEvent event) {
        m.ujianPeserta(SertifikatPeserta);
    }

}
