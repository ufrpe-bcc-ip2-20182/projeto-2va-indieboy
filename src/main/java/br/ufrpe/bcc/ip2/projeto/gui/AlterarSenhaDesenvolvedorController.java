package br.ufrpe.bcc.ip2.projeto.gui;

import br.ufrpe.bcc.ip2.projeto.controladores.Fachada;
import br.ufrpe.bcc.ip2.projeto.exceptions.NaoExisteException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class AlterarSenhaDesenvolvedorController {

    @FXML
    private TextField txtLogin;

    @FXML
    private Button btOk;

    @FXML
    private Button btVoltar;

    @FXML
    private PasswordField txtNovaSenha;

    @FXML
    void handleOkButton(ActionEvent event) {
    	String login = txtLogin.getText();
    	String novaSenha = txtNovaSenha.getText();
    	
    	try {
			Fachada.getInstance().contUsuario().atualizarSenha(login, novaSenha);
			Alert alert = new Alert(AlertType.CONFIRMATION);
			alert.setTitle("Sucesso!");
			alert.setHeaderText(null);
			alert.setContentText("Sua senha foi atualizada.");
			alert.showAndWait();
			MainApp.trocaCena(3);
    	} catch (NaoExisteException e) {
    		Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("Erro no login");
			alert.setHeaderText("Informações inválidas.");
			alert.setContentText("Login está incorreto.");
			alert.showAndWait();
		}
    }

    @FXML
    void handleVoltarButton(ActionEvent event) {
    	MainApp.trocaCena(3);
    }

}

