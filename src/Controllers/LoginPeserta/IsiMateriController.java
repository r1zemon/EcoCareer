package Controllers.LoginPeserta;

import Views.ViewFactor;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

public class IsiMateriController {

    ViewFactor m = new ViewFactor();

    @FXML
    private AnchorPane isiMateri;

    @FXML
    private Button materiButton;

    @FXML
    void kembaliKeMateriAwal(ActionEvent event) {
        m.materiPeserta(isiMateri);
    }

}

