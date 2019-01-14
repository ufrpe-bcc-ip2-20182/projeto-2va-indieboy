package br.ufrpe.bcc.ip2.projeto.gui.control;

import br.ufrpe.bcc.ip2.projeto.classesBasicas.Cliente;
import br.ufrpe.bcc.ip2.projeto.classesBasicas.Jogo;
import br.ufrpe.bcc.ip2.projeto.classesBasicas.Usuario;
import br.ufrpe.bcc.ip2.projeto.controladores.Fachada;
import br.ufrpe.bcc.ip2.projeto.gui.MainApp;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class VerUsuarioController implements Initializable{
	
	private final ObservableList<Cliente> lista = FXCollections.observableArrayList(Fachada.getInstance().contUsuario().getClienteArray());
	
	@FXML
    private Button btVoltar;
	
	@FXML private TableView <Cliente> tableViewUsuario;
	
	@FXML private TableColumn <Cliente,String> tableColumnLogin;
	
	@FXML private TableColumn <Cliente,String> tableColumnSenha;
	
	@FXML private TableColumn <Cliente,String> tableColumnNome;
	
	@FXML private TableColumn <Cliente,LocalDate> tableColumnNascimento;
	
	@FXML
    void handleVoltarButton(ActionEvent event) {
    	MainApp.trocaCena(1);
    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		/*tableColumnLogin.setCellValueFactory(new PropertyValueFactory<Cliente, String>("login"));
		tableColumnSenha.setCellValueFactory(new PropertyValueFactory<Cliente, String>("senha"));
		tableColumnNome.setCellValueFactory(new PropertyValueFactory<Cliente, String>("nome"));
		tableViewUsuario.setItems(lista);*/
		
	}
	
}

