package br.ufrpe.bcc.ip2.projeto.gui.control;

import java.net.URL;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ResourceBundle;

import br.ufrpe.bcc.ip2.projeto.classesBasicas.Sessao;
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
import br.ufrpe.bcc.ip2.projeto.classesBasicas.Cliente;

public class VerSessoesController implements Initializable {
	
	private ObservableList<Sessao> lista;
	
	@FXML
    private Button btVoltar;
	
	@FXML private TableView <Sessao> tableViewSessao;
	
	@FXML private TableColumn <Sessao,Integer> tableColumnNumero;
	
	@FXML private TableColumn <Sessao,LocalDate> tableColumnData;
	
	@FXML private TableColumn <Sessao,LocalTime> tableColumnInicio;
	
	@FXML private TableColumn <Sessao,LocalTime> tableColumnFinal;
	
	@FXML private TableColumn <Sessao,String> tableColumnCliente;
	
	@FXML private TableColumn <Sessao,String> tableColumnPagamento;
	
	public void atualizarTable(){
    	lista = FXCollections.observableArrayList(Fachada.getInstance().contSessao().getSessaoArray());
    	tableViewSessao.setItems(lista);
    }
	
	@FXML
    void handleVoltarButton(ActionEvent event) {
    	MainApp.trocaCena(1);
    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		atualizarTable();
		tableColumnCliente.setCellValueFactory(new PropertyValueFactory<Sessao, String>("nomeCliente"));
		tableColumnPagamento.setCellValueFactory(new PropertyValueFactory<Sessao, String>("pagamento"));
		tableColumnNumero.setCellValueFactory(new PropertyValueFactory<Sessao, Integer>("numSessao"));
		tableColumnData.setCellValueFactory(new PropertyValueFactory<Sessao, LocalDate>("data"));
		tableColumnInicio.setCellValueFactory(new PropertyValueFactory<Sessao, LocalTime>("horarioInicio"));
		tableColumnFinal.setCellValueFactory(new PropertyValueFactory<Sessao, LocalTime>("horarioFim"));

	}

}
