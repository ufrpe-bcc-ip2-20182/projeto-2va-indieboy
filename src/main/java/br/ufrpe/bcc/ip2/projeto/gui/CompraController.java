package br.ufrpe.bcc.ip2.projeto.gui;

import br.ufrpe.bcc.ip2.projeto.classesBasicas.Jogo;
import br.ufrpe.bcc.ip2.projeto.classesBasicas.Cartao;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class CompraController {
	@FXML
    private Button btVoltar;

	@FXML
    private TableView<Jogo> tableViewJogo;
	
	@FXML
    private TableColumn<Jogo, String> tableColumnNome;

	@FXML
    private TableColumn<Jogo, String> tableColumnPreco;

    @FXML
    void handleVoltarButton(ActionEvent event) {
    	MainApp.trocaCena(2);
    }

}
