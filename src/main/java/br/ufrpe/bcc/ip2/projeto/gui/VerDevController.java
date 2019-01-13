package br.ufrpe.bcc.ip2.projeto.gui;

import br.ufrpe.bcc.ip2.projeto.classesBasicas.Desenvolvedor;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;


public class VerDevController {
	
	@FXML
    private Button btVoltar;
	
	@FXML private TableView <Desenvolvedor> tableView;
	
	@FXML private TableColumn <Desenvolvedor,String> tableColumnLogin;
	
	@FXML private TableColumn <Desenvolvedor,String> tableColumnSenha;
	
	@FXML private TableColumn <Desenvolvedor,String> tableColumnNome;
	
	@FXML
    void handleVoltarButton(ActionEvent event) {
    	MainApp.trocaCena(3);
    }
	
}
