// package Controllers.LoginPeserta;

// import Views.ViewFactor;
// import javafx.event.ActionEvent;
// import javafx.fxml.FXML;
// import javafx.scene.control.Button;
// import javafx.scene.layout.AnchorPane;

// public class PekerjaanPesertaController {

//     ViewFactor m = new ViewFactor();

//     @FXML
//     private AnchorPane PekerjaaanPeserta;

//     @FXML
//     private Button berandaButton;

//     @FXML
//     private Button kursusButton;

//     @FXML
//     private Button materiButton;

//     @FXML
//     private Button nasihatButton;

//     @FXML
//     private Button riwayatButton;

//     @FXML
//     private Button sertifikatButton;

//     @FXML
//     private Button sukaButton;

//     @FXML
//     private Button ujianButton;

//     @FXML
//     void pekerjaanKeBeranda(ActionEvent event) {
//         m.berandaPeserta(PekerjaaanPeserta);
//     }

//     @FXML
//     void pekerjaanKeKursus(ActionEvent event) {
//         m.kursusPeserta(PekerjaaanPeserta);
//     }

//     @FXML
//     void pekerjaanKeMateri(ActionEvent event) {
//         m.materiPeserta(PekerjaaanPeserta);
//     }

//     @FXML
//     void pekerjaanKeNasihat(ActionEvent event) {
//         m.nasihatKarir(PekerjaaanPeserta);
//     }

//     @FXML
//     void pekerjaanKeRiwayat(ActionEvent event) {
//         m.riwayatMateri(PekerjaaanPeserta);
//     }

//     @FXML
//     void pekerjaanKeSertifikat(ActionEvent event) {
//         m.sertifikatPeserta(PekerjaaanPeserta);
//     }

//     @FXML
//     void pekerjaanKeSuka(ActionEvent event) {
//         m.sukaMateri(PekerjaaanPeserta);
//     }

//     @FXML
//     void pekerjaanKeUjian(ActionEvent event) {
//         m.ujianPeserta(PekerjaaanPeserta);
//     }

// }

package Controllers.LoginPeserta;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import Models.Menu.UjianModel;
import Views.ViewFactor;

import java.util.List;

public class PekerjaanPesertaController {

    ViewFactor m = new ViewFactor();

    @FXML
    private AnchorPane PekerjaaanPeserta;

    @FXML
    private BarChart<String, Number> barchat;

    @FXML
    private Button berandaButton;

    @FXML
    private Button kursusButton;

    @FXML
    private Button materiButton;

    @FXML
    private Button nasihatButton;

    @FXML
    private Button riwayatButton;

    @FXML
    private Button sertifikatButton;

    @FXML
    private Button sukaButton;

    @FXML
    private Button ujianButton;

    @FXML
    void initialize() {
        populateBarChart();
    }

    @FXML
    void pekerjaanKeBeranda(ActionEvent event) {
        m.berandaPeserta(PekerjaaanPeserta);
    }

    @FXML
    void pekerjaanKeKursus(ActionEvent event) {
        m.kursusPeserta(PekerjaaanPeserta);
    }

    @FXML
    void pekerjaanKeMateri(ActionEvent event) {
        m.materiPeserta(PekerjaaanPeserta);
    }

    @FXML
    void pekerjaanKeNasihat(ActionEvent event) {
        m.nasihatKarir(PekerjaaanPeserta);
    }

    @FXML
    void pekerjaanKeRiwayat(ActionEvent event) {
        m.riwayatMateri(PekerjaaanPeserta);
    }

    @FXML
    void pekerjaanKeSertifikat(ActionEvent event) {
        m.sertifikatPeserta(PekerjaaanPeserta);
    }

    @FXML
    void pekerjaanKeSuka(ActionEvent event) {
        m.sukaMateri(PekerjaaanPeserta);
    }

    @FXML
    void pekerjaanKeUjian(ActionEvent event) {
        m.ujianPeserta(PekerjaaanPeserta);
    }

    private void populateBarChart() {
        List<UjianModel.AnswerData> dataList = UjianModel.getAnswerData();

        XYChart.Series<String, Number> series = new XYChart.Series<>();
        series.setName("Answers");

        for (UjianModel.AnswerData data : dataList) {
            series.getData().add(new XYChart.Data<>(data.getAnswer(), data.getCount()));
        }

        barchat.getData().add(series);
    }

}
