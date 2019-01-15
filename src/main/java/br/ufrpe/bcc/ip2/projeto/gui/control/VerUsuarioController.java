package br.ufrpe.bcc.ip2.projeto.gui.control;

import br.ufrpe.bcc.ip2.projeto.classesBasicas.Cliente;
import br.ufrpe.bcc.ip2.projeto.classesBasicas.Desenvolvedor;
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
	
	private ObservableList<Usuario> lista;
	
	@FXML
    private Button btVoltar;
	
	@FXML private TableView <Usuario> tableViewUsuario;
	
	@FXML private TableColumn <Usuario,String> login;
	
	@FXML private TableColumn <Usuario,String> senha;
	
	public void atualizarTable(){
    	lista = FXCollections.observableArrayList(Fachada.getInstance().contUsuario().getUsuarioArray());
    	tableViewUsuario.setItems(lista);
    }
	
	@FXML
    void handleVoltarButton(ActionEvent event) {
    	MainApp.trocaCena(1);
    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		atualizarTable();
		login.setCellValueFactory(new PropertyValueFactory<Usuario, String>("login"));
		senha.setCellValueFactory(new PropertyValueFactory<Usuario, String>("senha"));
	}
	
}

