package br.ufrpe.bcc.ip2.projeto.gui;

import br.ufrpe.bcc.ip2.projeto.classesBasicas.Usuario;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import java.time.LocalDate;

public class VerUsuarioController {
	
	@FXML
    private Button btVoltar;
	
	@FXML private TableView <Usuario> tableViewUsuario;
	
	@FXML private TableColumn <Usuario,String> tableColumnLogin;
	
	@FXML private TableColumn <Usuario,String> tableColumnSenha;
	
	@FXML private TableColumn <Usuario,String> tableColumnNome;
	
	@FXML private TableColumn <Usuario,LocalDate> tableColumnNascimento;
	
	@FXML
    void handleVoltarButton(ActionEvent event) {
    	MainApp.trocaCena(3);
    }
	
}

