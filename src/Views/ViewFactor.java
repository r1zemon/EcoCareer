package Views;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ViewFactor {

    public void clickLoginPeserta(Node node) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Resource/fxml/LoginPeserta.fxml"));
            Parent nextPage = loader.load();

            Stage stage = (Stage) node.getScene().getWindow();
            Scene scene = new Scene(nextPage);
            stage.setScene(scene);

        } catch (Exception e) {
            System.out.println("Error in clickLoginPeserta: " + e.getMessage());
            e.printStackTrace();
        }
    }


        public void ClickBuatAkun(Node node) {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/Resource/fxml/BuatAkunPeserta.fxml"));
                Parent nextPage = loader.load();
    
                Stage stage = (Stage) node.getScene().getWindow();
                Scene scene = new Scene(nextPage);
                stage.setScene(scene);
    
            } catch (Exception e) {
                System.out.println("Error in clickLoginPeserta: " + e.getMessage());
                e.printStackTrace(); 
        }
    }

    public void ClickLoginTutor(Node node) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Resource/fxml/LoginTutor.fxml"));
            Parent nextPage = loader.load();

            Stage stage = (Stage) node.getScene().getWindow();
            Scene scene = new Scene(nextPage);
            stage.setScene(scene);

        } catch (Exception e) {
            System.out.println("Error in clickLoginPeserta: " + e.getMessage());
            e.printStackTrace(); 
    }
}

public void klikBuatAkunTutor(Node node) {
    try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Resource/fxml/BuatAkunTutor.fxml"));
        Parent nextPage = loader.load();

        Stage stage = (Stage) node.getScene().getWindow();
        Scene scene = new Scene(nextPage);
        stage.setScene(scene);

    } catch (Exception e) {
        System.out.println("Error in clickLoginPeserta: " + e.getMessage());
        e.printStackTrace(); 
}
}
public void klikLoginKonselor(Node node) {
    try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Resource/fxml/LoginKonselor.fxml"));
        Parent nextPage = loader.load();

        Stage stage = (Stage) node.getScene().getWindow();
        Scene scene = new Scene(nextPage);
        stage.setScene(scene);

    } catch (Exception e) {
        System.out.println("Error in clickLoginPeserta: " + e.getMessage());
        e.printStackTrace(); 
}
}

public void klikBuatAkunKonselor(Node node) {
    try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Resource/fxml/BuatAkunKonselor.fxml"));
        Parent nextPage = loader.load();

        Stage stage = (Stage) node.getScene().getWindow();
        Scene scene = new Scene(nextPage);
        stage.setScene(scene);

    } catch (Exception e) {
        System.out.println("Error in clickLoginPeserta: " + e.getMessage());
        e.printStackTrace(); 
}
}

public void klikKembaliLoginPertama(Node node) {
    try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Resource/fxml/LoginPertama.fxml"));
        Parent nextPage = loader.load();

        Stage stage = (Stage) node.getScene().getWindow();
        Scene scene = new Scene(nextPage);
        stage.setScene(scene);

    } catch (Exception e) {
        System.out.println("Error in clickLoginPeserta: " + e.getMessage());
        e.printStackTrace(); 
}
}

public void kursusPeserta(Node node) {
    try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Resource/fxml/KursusPeserta.fxml"));
        Parent nextPage = loader.load();

        Stage stage = (Stage) node.getScene().getWindow();
        Scene scene = new Scene(nextPage);
        stage.setScene(scene);

    } catch (Exception e) {
        System.out.println("Error in clickLoginPeserta: " + e.getMessage());
        e.printStackTrace(); 
}
}

public void berandaPeserta(Node node) {
    try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Resource/fxml/BerandaPeserta.fxml"));
        Parent nextPage = loader.load();

        Stage stage = (Stage) node.getScene().getWindow();
        Scene scene = new Scene(nextPage);
        stage.setScene(scene);

    } catch (Exception e) {
        System.out.println("Error in clickLoginPeserta: " + e.getMessage());
        e.printStackTrace(); 
}
}

public void materiPeserta(Node node) {
    try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Resource/fxml/MateriPeserta.fxml"));
        Parent nextPage = loader.load();

        Stage stage = (Stage) node.getScene().getWindow();
        Scene scene = new Scene(nextPage);
        stage.setScene(scene);

    } catch (Exception e) {
        System.out.println("Error in clickLoginPeserta: " + e.getMessage());
        e.printStackTrace(); 
}
}

public void sertifikatPeserta(Node node) {
    try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Resource/fxml/SertifikatPeserta.fxml"));
        Parent nextPage = loader.load();

        Stage stage = (Stage) node.getScene().getWindow();
        Scene scene = new Scene(nextPage);
        stage.setScene(scene);

    } catch (Exception e) {
        System.out.println("Error in clickLoginPeserta: " + e.getMessage());
        e.printStackTrace(); 
}
}

public void sukaMateri(Node node) {
    try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Resource/fxml/SukaMateri.fxml"));
        Parent nextPage = loader.load();

        Stage stage = (Stage) node.getScene().getWindow();
        Scene scene = new Scene(nextPage);
        stage.setScene(scene);

    } catch (Exception e) {
        System.out.println("Error in clickLoginPeserta: " + e.getMessage());
        e.printStackTrace(); 
}
}

public void nasihatKarir(Node node) {
    try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Resource/fxml/NasihatKarirPeserta.fxml"));
        Parent nextPage = loader.load();

        Stage stage = (Stage) node.getScene().getWindow();
        Scene scene = new Scene(nextPage);
        stage.setScene(scene);

    } catch (Exception e) {
        System.out.println("Error in clickLoginPeserta: " + e.getMessage());
        e.printStackTrace(); 
}
}

public void ujianPeserta(Node node) {
    try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Resource/fxml/UjianPeserta.fxml"));
        Parent nextPage = loader.load();

        Stage stage = (Stage) node.getScene().getWindow();
        Scene scene = new Scene(nextPage);
        stage.setScene(scene);

    } catch (Exception e) {
        System.out.println("Error in clickLoginPeserta: " + e.getMessage());
        e.printStackTrace(); 
}
}

public void pekerjaanPeserta(Node node) {
    try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Resource/fxml/PekerjaanPeserta.fxml"));
        Parent nextPage = loader.load();

        Stage stage = (Stage) node.getScene().getWindow();
        Scene scene = new Scene(nextPage);
        stage.setScene(scene);

    } catch (Exception e) {
        System.out.println("Error in clickLoginPeserta: " + e.getMessage());
        e.printStackTrace(); 
}
}

public void riwayatMateri(Node node) {
    try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Resource/fxml/RiwayatMateri.fxml"));
        Parent nextPage = loader.load();

        Stage stage = (Stage) node.getScene().getWindow();
        Scene scene = new Scene(nextPage);
        stage.setScene(scene);

    } catch (Exception e) {
        System.out.println("Error in clickLoginPeserta: " + e.getMessage());
        e.printStackTrace(); 
}
}

public void berandaTutor(Node node) {
    try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Resource/fxml/BerandaTutor.fxml"));
        Parent nextPage = loader.load();

        Stage stage = (Stage) node.getScene().getWindow();
        Scene scene = new Scene(nextPage);
        stage.setScene(scene);

    } catch (Exception e) {
        System.out.println("Error in clickLoginPeserta: " + e.getMessage());
        e.printStackTrace(); 
}
}

public void menambahMateriTutor(Node node) {
    try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Resource/fxml/menambahMateriTutor.fxml"));
        Parent nextPage = loader.load();

        Stage stage = (Stage) node.getScene().getWindow();
        Scene scene = new Scene(nextPage);
        stage.setScene(scene);

    } catch (Exception e) {
        System.out.println("Error in clickLoginPeserta: " + e.getMessage());
        e.printStackTrace(); 
}
}

public void unggahSertifikatTutor(Node node) {
    try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Resource/fxml/unggahSertifikatTutor.fxml"));
        Parent nextPage = loader.load();

        Stage stage = (Stage) node.getScene().getWindow();
        Scene scene = new Scene(nextPage);
        stage.setScene(scene);

    } catch (Exception e) {
        System.out.println("Error in clickLoginPeserta: " + e.getMessage());
        e.printStackTrace(); 
}
}

public void buatUjianTutor(Node node) {
    try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Resource/fxml/buatUjianTutor.fxml"));
        Parent nextPage = loader.load();

        Stage stage = (Stage) node.getScene().getWindow();
        Scene scene = new Scene(nextPage);
        stage.setScene(scene);

    } catch (Exception e) {
        System.out.println("Error in clickLoginPeserta: " + e.getMessage());
        e.printStackTrace(); 
}
}

public void isiMateri(Node node) {
    try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Resource/fxml/isiMateri.fxml"));
        Parent nextPage = loader.load();

        Stage stage = (Stage) node.getScene().getWindow();
        Scene scene = new Scene(nextPage);
        stage.setScene(scene);

    } catch (Exception e) {
        System.out.println("Error in clickLoginPeserta: " + e.getMessage());
        e.printStackTrace(); 
}
}

public void isiMateri2(Node node) {
    try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Resource/fxml/isiMateri2.fxml"));
        Parent nextPage = loader.load();

        Stage stage = (Stage) node.getScene().getWindow();
        Scene scene = new Scene(nextPage);
        stage.setScene(scene);

    } catch (Exception e) {
        System.out.println("Error in clickLoginPeserta: " + e.getMessage());
        e.printStackTrace(); 
}
}


public void kembaliMateriAwalPeserta(Node node) {
    try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Resource/fxml/MateriPeserta.fxml"));
        Parent nextPage = loader.load();

        Stage stage = (Stage) node.getScene().getWindow();
        Scene scene = new Scene(nextPage);
        stage.setScene(scene);

    } catch (Exception e) {
        System.out.println("Error in clickLoginPeserta: " + e.getMessage());
        e.printStackTrace(); 
}
}

public void BuatAkunKonselor(Node node) {
    try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Resource/fxml/BuatAkunKonselor.fxml"));
        Parent nextPage = loader.load();

        Stage stage = (Stage) node.getScene().getWindow();
        Scene scene = new Scene(nextPage);
        stage.setScene(scene);

    } catch (Exception e) {
        System.out.println("Error in clickLoginPeserta: " + e.getMessage());
        e.printStackTrace(); 
}
}

public void loginKonselor(Node node) {
    try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Resource/fxml/LoginKonselor.fxml"));
        Parent nextPage = loader.load();

        Stage stage = (Stage) node.getScene().getWindow();
        Scene scene = new Scene(nextPage);
        stage.setScene(scene);

    } catch (Exception e) {
        System.out.println("Error in clickLoginPeserta: " + e.getMessage());
        e.printStackTrace(); 
}
}

public void profilPeserta(Node node) {
    try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Resource/fxml/ProfilPeserta.fxml"));
        Parent nextPage = loader.load();

        Stage stage = (Stage) node.getScene().getWindow();
        Scene scene = new Scene(nextPage);
        stage.setScene(scene);

    } catch (Exception e) {
        System.out.println("Error in clickLoginPeserta: " + e.getMessage());
        e.printStackTrace(); 
}
}
    }

