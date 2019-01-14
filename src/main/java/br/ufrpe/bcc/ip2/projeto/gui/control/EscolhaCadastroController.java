package br.ufrpe.bcc.ip2.projeto.gui.control;

import br.ufrpe.bcc.ip2.projeto.gui.MainApp;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class EscolhaCadastroController {

    @FXML
    private Button btVoltar;

    @FXML
    private Button btUsuario;

    @FXML
    private Button btDev;

    @FXML
    void handleUsuarioButton(ActionEvent event) {
    	MainApp.trocaCena(6);
    }

    @FXML
    void handleVoltarButton(ActionEvent event) {
    	MainApp.trocaCena(0);
    }

    @FXML
    void handleDevButton(ActionEvent event) {
    	MainApp.trocaCena(7);
    }

}

