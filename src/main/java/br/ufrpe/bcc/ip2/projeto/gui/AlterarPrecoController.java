package br.ufrpe.bcc.ip2.projeto.gui;

import br.ufrpe.bcc.ip2.projeto.controladores.Fachada;
import br.ufrpe.bcc.ip2.projeto.exceptions.NaoExisteException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class AlterarPrecoController {

    @FXML
    private Button btOk;

    @FXML
    private Button btBack;

    @FXML
    private TextField txtNomeJogo;

    @FXML
    private TextField txtNovoPreco;

    @FXML
    void handleOkButton(ActionEvent event) {
    	String nome = txtNomeJogo.getText();
    	double novoPrevo = Double.parseDouble(txtNovoPreco.getText());
    	
    	try {
			Fachada.getInstance().contJogo().atualizarPreco(nome, novoPrevo);
			Alert alert = new Alert(AlertType.CONFIRMATION);
			alert.setTitle("Sucesso!");
			alert.setHeaderText(null);
			alert.setContentText("O preço foi atualizado.");
			alert.showAndWait();
			MainApp.trocaCena(3);
    	} catch (NaoExisteException e) {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("Jogo não encontrado.");
			alert.setHeaderText(null);
			alert.setContentText("Insira o nome correto do jogo.");
			alert.showAndWait();
		}
    	
    }

    @FXML
    void handleBackButton(ActionEvent event) {
    	MainApp.trocaCena(3);
    }

}

