package Controllers.LoginTutor;

import Views.ViewFactor;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;

import java.io.File;

public class MenambahMateriController {

    ViewFactor m = new ViewFactor();

    @FXML
    private Button berandaButton;

    @FXML
    private AnchorPane menambahMateriTutor;

    @FXML
    private Button sertifikatButton;

    @FXML
    private Button ujianButton;

    @FXML
    private TextField deskripsiMateriButton;

    @FXML
    private ImageView gambarMateriImgView;

    @FXML
    private Button isiMateriButton;

    @FXML
    private TextField judulMateriButton;

    @FXML
    private Button kirimMateriButton;

    @FXML
    private Button unggahGambarButton;

    @FXML
    void materiKeBeranda(ActionEvent event) {
        m.berandaTutor(menambahMateriTutor);
    }

    @FXML
    void materiKeSertifikat(ActionEvent event) {
        m.unggahSertifikatTutor(menambahMateriTutor);
    }

    @FXML
    void materiKeUjian(ActionEvent event) {
        m.buatUjianTutor(menambahMateriTutor);
    }

    @FXML
    void unggahGambarMateri(ActionEvent event) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Pilih Gambar Materi");
        
        // Set filter ekstensi file yang diizinkan
        fileChooser.getExtensionFilters().addAll(
            new FileChooser.ExtensionFilter("Image Files", "*.png", "*.jpg", "*.jpeg")
        );

        File selectedFile = fileChooser.showOpenDialog(menambahMateriTutor.getScene().getWindow());

        if (selectedFile != null) {
            Image image = new Image(selectedFile.toURI().toString());
            gambarMateriImgView.setImage(image);
        }
    }
}
