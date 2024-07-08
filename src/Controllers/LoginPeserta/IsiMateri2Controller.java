package Controllers.LoginPeserta;

import Views.ViewFactor;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

public class IsiMateri2Controller {

    ViewFactor m = new ViewFactor();
    @FXML
    private Button materiButton;

    @FXML
    private AnchorPane isiMateri2;
    
    @FXML
    void kembaliKeMateriAwal(ActionEvent event) {
        m.materiPeserta(materiButton);
    }

}

