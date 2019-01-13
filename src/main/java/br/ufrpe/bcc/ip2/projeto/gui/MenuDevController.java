package br.ufrpe.bcc.ip2.projeto.gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class MenuDevController {

    @FXML
    private Button btVoltar;

    @FXML
    private Button btAddJogo;

    @FXML
    private Button btEditarPreco;

    @FXML
    private Button btVerJogos;

    @FXML
    private Button btAlterarSenha;

    @FXML
    void handleAddJogoButton(ActionEvent event) {
    	MainApp.trocaCena(8);
    }

    @FXML
    void handleAlterarSenhaButton(ActionEvent event) {
    	MainApp.trocaCena(13);
    }

    @FXML
    void handleVerJogosButton(ActionEvent event) {

    }

    @FXML
    void handleVoltarButton(ActionEvent event) {
    	MainApp.trocaCena(0);
    }

    @FXML
    void handleEditarPrecoButton(ActionEvent event) {
    	MainApp.trocaCena(10);
    }
    
}
