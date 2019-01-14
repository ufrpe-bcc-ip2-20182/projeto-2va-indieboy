package br.ufrpe.bcc.ip2.projeto.gui.control;

import java.net.URL;
import java.util.ResourceBundle;

import br.ufrpe.bcc.ip2.projeto.classesBasicas.Jogo;
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

public class VerCatalogoController implements Initializable{

	private ObservableList<Jogo> lista;
	
    @FXML
    private Button btVoltar;
    
    @FXML
    private Button btComprar;
    
    @FXML
    private TableView<Jogo> tableViewJogos;

    @FXML
    private TableColumn<Jogo, String> tableColumnNome;

    @FXML
    private TableColumn<Jogo, String> tableColumnGenero;

    @FXML
    private TableColumn<Jogo, Double> tablePreco;
    
    public void atualizarTable(){
    	lista = FXCollections.observableArrayList(Fachada.getInstance().contJogo().getJogoArray());
    	tableViewJogos.setItems(lista);
    }

    @FXML
    void handleVoltarButton(ActionEvent event) {
    	MainApp.trocaCena(2);
    }
    
    @FXML
    void handleComprarButton(ActionEvent event) {
    	//MainApp.trocaCena(18);
    	System.out.println("ok");
    }
    
    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
    	atualizarTable();
    	tableColumnNome.setCellValueFactory(new PropertyValueFactory<Jogo, String>("nome"));
		tableColumnGenero.setCellValueFactory(new PropertyValueFactory<Jogo, String>("genero"));
		tablePreco.setCellValueFactory(new PropertyValueFactory<Jogo, Double>("preco"));
		tableViewJogos.setItems(lista);
    }
}

