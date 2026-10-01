package illarion.client.mod;

import javafx.event.ActionEvent;
import javafx.scene.input.MouseEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;

public class MODLoaderController {

    @FXML
    public ListView list_operacoes;

    @FXML
    public ListView list_comandos;

    @FXML
    private void onSalvar(ActionEvent event) {
        System.out.println("onSalvar apertado!");
    }

    @FXML
    private void onExecutar(ActionEvent event) {
        System.out.println("onExecutar apertado!");
    }

    @FXML
    public void onSelectedOperation(MouseEvent event) {
        System.out.println("onSelectedOperation apertado!");
    }
    
    @FXML
    public void onGravar(ActionEvent event) {
        System.out.println("onGravar apertado!");
    }
}
