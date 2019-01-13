package br.ufrpe.bcc.ip2.projeto.gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class MenuClienteController {

    @FXML
    private Button btVoltar;

    @FXML
    private Button btBiblioteca;

    @FXML
    private Button btCatalogo;

    @FXML
    private Button btAlterarSenha;

    @FXML
    void handleBibliotecaButton(ActionEvent event) {
    	MainApp.trocaCena(11);
    }

    @FXML
    void handleCatalogoButton(ActionEvent event) {
    	MainApp.trocaCena(12);
    }

    @FXML
    void handleAlterarSenhaButton(ActionEvent event) {
    	MainApp.trocaCena(10);
    }

    @FXML
    void handleVoltarButton(ActionEvent event) {
    	MainApp.trocaCena(0);
    }

}