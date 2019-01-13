package br.ufrpe.bcc.ip2.projeto.gui;

import br.ufrpe.bcc.ip2.projeto.classesBasicas.Desenvolvedor;
import br.ufrpe.bcc.ip2.projeto.classesBasicas.Jogo;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class VerBibliotecaController {

    @FXML
    private Button btVoltar;

    @FXML
    private TableColumn<Jogo, String> tableColumnNome;

    @FXML
    private TableView<Jogo> tableViewBiblioteca;

    @FXML
    private TableColumn<Desenvolvedor, String> tableColumnDesenvolvedor;

    @FXML
    void handleVoltarButton(ActionEvent event) {
    	MainApp.trocaCena(3);
    }

}

