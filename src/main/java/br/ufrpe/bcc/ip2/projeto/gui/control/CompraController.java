package br.ufrpe.bcc.ip2.projeto.gui.control;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class CompraController {

    @FXML
    private TableColumn<?, ?> tableColumnDev;

    @FXML
    private Button btVoltar;

    @FXML
    private TextField txtNumCartao;

    @FXML
    private TableView<?> tableViewJogo;

    @FXML
    private Label lbDescricao;

    @FXML
    private TableColumn<?, ?> tableColumnNome;

    @FXML
    private TableColumn<?, ?> tableColumnGenero;

    @FXML
    private Button btComprar;

    @FXML
    private TextField txtNumCartao1;

    @FXML
    private TableColumn<?, ?> tableColumnClass;

    @FXML
    private TableColumn<?, ?> tableColumnPreco;

    @FXML
    void handleVoltarButton(ActionEvent event) {

    }

    @FXML
    void handleComprarButton(ActionEvent event) {

    }

}
