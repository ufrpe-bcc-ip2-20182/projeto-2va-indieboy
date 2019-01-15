package br.ufrpe.bcc.ip2.projeto.gui.control;

import java.net.URL;
import java.util.ResourceBundle;

import br.ufrpe.bcc.ip2.projeto.classesBasicas.Cliente;
import br.ufrpe.bcc.ip2.projeto.classesBasicas.Desenvolvedor;
import br.ufrpe.bcc.ip2.projeto.classesBasicas.Jogo;
import br.ufrpe.bcc.ip2.projeto.controladores.Fachada;
import br.ufrpe.bcc.ip2.projeto.gui.MainApp;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class VerCatalogoController implements Initializable{

	private ObservableList<Jogo> lista;
	
    @FXML
    private Button btVoltar;
    
    @FXML
    private TextField txtNumCartao;
    
    @FXML
    private Button btComprar;
    
    @FXML
    private TableView<Jogo> tableViewJogos;
    
    @FXML
    private Label lbDescricao;

    @FXML
    private TableColumn<Jogo, String> tableColumnNome;

    @FXML
    private TableColumn<Jogo, String> tableColumnGenero;
    
    @FXML
    private TableColumn<Desenvolvedor, String> tableDev;

    @FXML
    private TextField txtSenhaCartao;

    @FXML
    private TableColumn<Jogo, Integer> tableColumnClass;

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
    	if(this.tableViewJogos.getSelectionModel().getSelectedItem()!=null) {
    		Cliente cliente = TelaInicialController.getCliente();
    		String numCartao = txtNumCartao.getText();
    		int senhaCartao = Integer.parseInt(txtSenhaCartao.getText());
    		
    		if(numCartao != null && senhaCartao != 0){
    			//TODO regra de negocio para cartao
    			Fachada.getInstance().contUsuario().addJogoComprado(cliente.getLogin(), this.tableViewJogos.getSelectionModel().getSelectedItem());
    			Alert alertE = new Alert(AlertType.CONFIRMATION);
				alertE.setTitle("Compra concluida");
				alertE.setHeaderText(null);
				alertE.setContentText("Jogo Comprado");
				alertE.showAndWait();
				MainApp.trocaCena(2);
    		}else{
    			Alert alertE = new Alert(AlertType.INFORMATION);
				alertE.setTitle("Erro");
				alertE.setHeaderText(null);
				alertE.setContentText("Problema na compra.");
				alertE.showAndWait();
    		}
    	}else{
    		Alert alertE = new Alert(AlertType.INFORMATION);
			alertE.setTitle("Erro");
			alertE.setHeaderText(null);
			alertE.setContentText("Selecione o que deseja comprar");
			alertE.showAndWait();
    	}
    }
    
    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
    	atualizarTable();
    	tableColumnNome.setCellValueFactory(new PropertyValueFactory<Jogo, String>("nome"));
		tableColumnGenero.setCellValueFactory(new PropertyValueFactory<Jogo, String>("genero"));
		tablePreco.setCellValueFactory(new PropertyValueFactory<Jogo, Double>("preco"));
		tableDev.setCellValueFactory(new PropertyValueFactory<Desenvolvedor, String>("nome"));//Arrumar
		tableColumnClass.setCellValueFactory(new PropertyValueFactory<Jogo, Integer>("classificacaoEtaria"));
		//tableViewJogos.setItems(lista);
    }
}

