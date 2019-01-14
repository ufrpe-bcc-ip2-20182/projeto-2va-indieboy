package br.ufrpe.bcc.ip2.projeto.gui;

import br.ufrpe.bcc.ip2.projeto.classesBasicas.Jogo;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class VerJogosDevController {
	@FXML
    private Button btVoltar;
	
	@FXML
    private Button btAlterarPreco;

    @FXML
    private TableView<Jogo> tableViewJogos;
	
	@FXML
    private TableColumn<Jogo, String> tableColumnNome;
	
	@FXML
    private TableColumn<Jogo, String> tableColumnGenero;
	
	@FXML
    private TableColumn<Jogo, String> tablePreco;
	
	@FXML
    void handleVoltarButton(ActionEvent event) {
    	MainApp.trocaCena(3);
    }
	
	@FXML
    void handleAlterarPrecoButton(ActionEvent event) {
    	MainApp.trocaCena(9);
    }


}
