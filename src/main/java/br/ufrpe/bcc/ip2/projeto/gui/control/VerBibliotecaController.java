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
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class VerBibliotecaController {

	private ObservableList<Jogo> lista; //falta resolver esse repositorio..
	
    private Button btVoltar;

    @FXML
    private TableColumn<Jogo, String> tableColumnNome;

    @FXML
    private TableView<Jogo> tableViewBiblioteca;

    @FXML
    private TableColumn<Jogo, String> tableColumnGenero;

    public void initialize() {
		tableColumnNome.setCellValueFactory(new PropertyValueFactory<>("nome"));
		tableColumnGenero.setCellValueFactory(new PropertyValueFactory<>("genero"));
		tableViewBiblioteca.setItems(lista);
		//this.tableViewBiblioteca.getSelectionModel().selectedItemProperty().addListener(
			//	(observable, oldValue, newValue) -> showPersonDetails(this.tableViewBiblioteca.getSelectionModel().getSelectedItem()));
    }
    
    @FXML
    void handleVoltarButton(ActionEvent event) {
    	MainApp.trocaCena(2);
    }
}

