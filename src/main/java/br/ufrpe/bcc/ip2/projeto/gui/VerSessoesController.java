package br.ufrpe.bcc.ip2.projeto.gui;

import java.time.LocalDate;
import java.time.LocalTime;

import br.ufrpe.bcc.ip2.projeto.classesBasicas.Sessao;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import br.ufrpe.bcc.ip2.projeto.classesBasicas.Cliente;

public class VerSessoesController {
	
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
    	MainApp.trocaCena(3);
    }

}
