package br.ufrpe.bcc.ip2.projeto.gui.control;

import br.ufrpe.bcc.ip2.projeto.classesBasicas.Admin;
import br.ufrpe.bcc.ip2.projeto.classesBasicas.Usuario;
import br.ufrpe.bcc.ip2.projeto.controladores.Fachada;
import br.ufrpe.bcc.ip2.projeto.exceptions.CadastroInvalidoException;
import br.ufrpe.bcc.ip2.projeto.exceptions.JaExisteException;
import br.ufrpe.bcc.ip2.projeto.gui.MainApp;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class CadastroAdminController {

    @FXML
    private TextField txtLogin;

    @FXML
    private Button btOk;

    @FXML
    private Button btVoltar;

    @FXML
    private PasswordField txtSenha;

    @FXML
    void handleOkButton(ActionEvent event) {
    	String login = txtLogin.getText();
    	String senha = txtSenha.getText();
    	
    	Usuario admin = new Admin(login, senha);
    	try {
			Fachada.getInstance().contUsuario().adicionarUsuario(admin);
			Alert alert = new Alert(AlertType.CONFIRMATION);
			alert.setTitle("Admin Cadastrado.");
			alert.setHeaderText(null);
			alert.setContentText("Cadastro efetuado com sucesso.");
			alert.showAndWait();
			MainApp.trocaCena(1);
		} catch (CadastroInvalidoException e) {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("Erro no cadastro");
			alert.setHeaderText("Faltam informações.");
			alert.setContentText("Preencha todos os campos.");
			alert.showAndWait();
		} catch (JaExisteException e) {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("Erro no cadastro.");
			alert.setHeaderText("Esse login já está sendo usado.");
			alert.setContentText("Por favor escolha outro login");
			alert.showAndWait();
		}
    }

    @FXML
    void handleVoltarButton(ActionEvent event) {
    	MainApp.trocaCena(1);
    }

}
