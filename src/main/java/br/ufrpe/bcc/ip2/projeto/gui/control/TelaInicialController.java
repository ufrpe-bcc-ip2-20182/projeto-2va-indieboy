package br.ufrpe.bcc.ip2.projeto.gui.control;

import java.io.IOException;

import br.ufrpe.bcc.ip2.projeto.classesBasicas.Admin;
import br.ufrpe.bcc.ip2.projeto.classesBasicas.Cliente;
import br.ufrpe.bcc.ip2.projeto.classesBasicas.Desenvolvedor;
import br.ufrpe.bcc.ip2.projeto.classesBasicas.Usuario;
import br.ufrpe.bcc.ip2.projeto.controladores.Fachada;
import br.ufrpe.bcc.ip2.projeto.exceptions.CamposInvalidosException;
import br.ufrpe.bcc.ip2.projeto.exceptions.NaoExisteException;
import br.ufrpe.bcc.ip2.projeto.gui.MainApp;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class TelaInicialController {

	private static Cliente clienteLogado;
	private static Admin adminLogado;
	private static Desenvolvedor devLogado;
	
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
			if(usuario instanceof Cliente == true){
				clienteLogado = (Cliente)usuario;
				MainApp.trocaCena(2);
			}
			if(usuario instanceof Desenvolvedor == true){
				devLogado = (Desenvolvedor) usuario;
				MainApp.trocaCena(3);
			}
			if(usuario instanceof Admin == true){
				adminLogado = (Admin) usuario;
				MainApp.trocaCena(1);
			}
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
    	try {
			Fachada.getInstance().contJogo().salvarDados();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	try {
			Fachada.getInstance().contSessao().salvarDados();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	try {
			Fachada.getInstance().contUsuario().salvarDados();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	System.exit(0);
    }

    @FXML
    void handleCadastrarButton(ActionEvent event) {
    	MainApp.trocaCena(4);
    }
    
    public static Cliente getCliente(){
    	return clienteLogado;
    }
    
    public static Admin getAdmin(){
    	return adminLogado;
    }

    public static Desenvolvedor getDev(){
    	return devLogado;
    }
}