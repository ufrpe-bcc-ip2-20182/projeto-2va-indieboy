package br.ufrpe.bcc.ip2.projeto.gui;

import java.net.URL;
import java.util.ResourceBundle;

import br.ufrpe.bcc.ip2.projeto.classesBasicas.Jogo;
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

public class VerCatalogoController implements Initializable{

	private final ObservableList<Jogo> lista = FXCollections.observableArrayList(Fachada.getInstance().contJogo().getJogoArray());
	
    @FXML
    private Button btVoltar;

    @FXML
    private TableView<Jogo> tableViewCatalogo;

    @FXML
    private TableColumn<Jogo, String> tableColumnNome;

    @FXML
    private TableColumn<Jogo, String> tableColumnGenero;

    @FXML
    private TableColumn<Jogo, Double> tableColumnPreco;

    @FXML
    void handleVoltarButton(ActionEvent event) {
    	MainApp.trocaCena(2);
    }
    
    public void initialize(URL arg0, ResourceBundle arg1) {
    	
    	tableColumnNome.setCellValueFactory(new PropertyValueFactory<Jogo, String>("nome"));
		tableColumnGenero.setCellValueFactory(new PropertyValueFactory<Jogo, String>("genero"));
		tableColumnPreco.setCellValueFactory(new PropertyValueFactory<Jogo, Double>("preco"));
		tableViewCatalogo.setItems(lista);
    }

}

