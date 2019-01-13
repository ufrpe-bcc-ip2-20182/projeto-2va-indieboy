package br.ufrpe.bcc.ip2.projeto.gui;
import br.ufrpe.bcc.ip2.projeto.controladores.Fachada;
import br.ufrpe.bcc.ip2.projeto.classesBasicas.Usuario;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import java.time.LocalDate;

public class VerUsuarioController {
	@FXML private TableView <Usuario> tableView;
	@FXML private TableColumn <Usuario,String> login;
	@FXML private TableColumn <Usuario,String> senha;
	@FXML private TableColumn <Usuario,String> nome;
	@FXML private TableColumn <Usuario,LocalDate> nascimento;
	
}
