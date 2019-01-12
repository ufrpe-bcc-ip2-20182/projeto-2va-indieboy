package br.ufrpe.bcc.ip2.projeto.gui;

import br.ufrpe.bcc.ip2.projeto.classesBasicas.Admin;
import br.ufrpe.bcc.ip2.projeto.classesBasicas.Cliente;
import br.ufrpe.bcc.ip2.projeto.classesBasicas.Desenvolvedor;
import br.ufrpe.bcc.ip2.projeto.classesBasicas.Usuario;
import br.ufrpe.bcc.ip2.projeto.controladores.Fachada;
import br.ufrpe.bcc.ip2.projeto.exceptions.CamposInvalidosException;
import br.ufrpe.bcc.ip2.projeto.exceptions.NaoExisteException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class TelaInicialController {

    @FXML
    private TextField txtLogin;

    @FXML
    private PasswordField txtSenha;

    @FXML
    private Button btEntrar;

    @FXML
    private Button btCadastrar;

    @FXML
    private Button btSair;

    @FXML
    void handleEntrarButton(ActionEvent event) {
    	
    	String login = txtLogin.getText();
    	String senha = txtSenha.getText();
		
		try {
			Usuario usuario = Fachada.getInstance().contLogin().verificarLogin(login, senha);
			if(usuario instanceof Cliente == true) 
				MainApp.trocaCena(2);
			if(usuario instanceof Desenvolvedor == true)
				MainApp.trocaCena(3);
			if(usuario instanceof Admin == true)
				MainApp.trocaCena(1);
		} catch (NaoExisteException | CamposInvalidosException e) {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("Erro no login");
			alert.setHeaderText("Informações inválidas.");
			alert.setContentText("Login ou senha estão incorretas.");
			alert.showAndWait();
		}
		
    }

    @FXML
    void handleSairButton(ActionEvent event) {
    	System.exit(0);
    }

    @FXML
    void handleCadastrarButton(ActionEvent event) {
    	MainApp.trocaCena(4);
    }

}