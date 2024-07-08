package Controllers.LoginTutor;

import Views.ViewFactor;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

import java.sql.SQLException;

import Models.Menu.SertifikasiModel;

public class UnggahSertifikatTutorController {

    ViewFactor m = new ViewFactor();

    @FXML
    private Button berandaButton;

    @FXML
    private Button materiButton;

    @FXML
    private ImageView imageView;

    @FXML
    private Button ujianButton;

    @FXML
    private Button unggahSertifikatButton;

    @FXML
    private AnchorPane unggahSertifikatTutor;

private SertifikasiModel sertifikasiModel;

@FXML
public void initialize() {
    sertifikasiModel = new SertifikasiModel();

    int idSertifikasi = 1;
    String imagePath = getCertificationImagePath(idSertifikasi);
    
    if (imagePath != null) {
        Image image = new Image(getClass().getResourceAsStream(imagePath));
        imageView.setImage(image);
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
        m.berandaTutor(unggahSertifikatTutor);
    }

    @FXML
    void sertifikatKeMateri(ActionEvent event) {
        m.menambahMateriTutor(unggahSertifikatTutor);
    }

    @FXML
    void sertifikatKeUjian(ActionEvent event) {
        m.buatUjianTutor(unggahSertifikatTutor);
    }

    @FXML
    void unggahSertifikat(ActionEvent event) {

    }
}
