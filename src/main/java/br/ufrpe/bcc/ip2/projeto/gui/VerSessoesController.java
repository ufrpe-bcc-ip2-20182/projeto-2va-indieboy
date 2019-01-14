package br.ufrpe.bcc.ip2.projeto.gui;

import java.net.URL;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ResourceBundle;

import br.ufrpe.bcc.ip2.projeto.classesBasicas.Sessao;
import br.ufrpe.bcc.ip2.projeto.controladores.Fachada;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import br.ufrpe.bcc.ip2.projeto.classesBasicas.Cliente;

public class VerSessoesController implements Initializable {
	
	private final ObservableList<Sessao> lista = FXCollections.observableArrayList(Fachada.getInstance().contSessao().getSessaoArray());
	
	@FXML
    private Button btVoltar;
	
	@FXML private TableView <Sessao> tableViewSessao;
	
	@FXML private TableColumn <Sessao,String> tableColumnNumero;
	
	@FXML private TableColumn <Sessao,LocalDate> tableColumnData;
	
	@FXML private TableColumn <Sessao,LocalTime> tableColumnInicio;
	
	@FXML private TableColumn <Sessao,LocalTime> tableColumnFinal;
	
	@FXML private TableColumn <Cliente,String> tableColumnCliente;
	
	@FXML private TableColumn <Sessao,String> tableColumnPagamento;
	
	@FXML
    void handleVoltarButton(ActionEvent event) {
    	MainApp.trocaCena(1);
    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		tableColumnCliente.setCellValueFactory(new PropertyValueFactory<Cliente, String>("nome"));
		tableColumnPagamento.setCellValueFactory(new PropertyValueFactory<Sessao, String>("pagamento"));
		tableColumnNumero.setCellValueFactory(new PropertyValueFactory<Sessao, String>("nome"));
		tableViewSessao.setItems(lista);
		
	}

}
