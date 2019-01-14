package br.ufrpe.bcc.ip2.projeto.gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class MenuAdminController {

    @FXML
    private Button btVoltar;

    @FXML
    private Button btAddAdmin;

    @FXML
    private Button btClientes;

    @FXML
    private Button btSessoes;

    @FXML
    private Button btDesenvolvedores;

    @FXML
    void handleSessoesButton(ActionEvent event) {
    	//MainApp.trocaCena(15);
    }

    @FXML
    void handleAddAdminButton(ActionEvent event) {
    	MainApp.trocaCena(5);
    }

    @FXML
    void handleClientesButton(ActionEvent event) {
    	//MainApp.trocaCena(16);
    }

    @FXML
    void handleVoltarButton(ActionEvent event) {
    	MainApp.trocaCena(0);
    }

    @FXML
    void handleDesenvolvedoresButton(ActionEvent event) {
    	//MainApp.trocaCena(17);
    }

}

