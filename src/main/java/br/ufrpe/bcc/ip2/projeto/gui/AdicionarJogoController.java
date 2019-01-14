package br.ufrpe.bcc.ip2.projeto.gui;

import br.ufrpe.bcc.ip2.projeto.classesBasicas.Desenvolvedor;
import br.ufrpe.bcc.ip2.projeto.classesBasicas.Genero;
import br.ufrpe.bcc.ip2.projeto.classesBasicas.Jogo;
import br.ufrpe.bcc.ip2.projeto.classesBasicas.Usuario;
import br.ufrpe.bcc.ip2.projeto.controladores.Fachada;
import br.ufrpe.bcc.ip2.projeto.exceptions.CadastroInvalidoException;
import br.ufrpe.bcc.ip2.projeto.exceptions.JaExisteException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class AdicionarJogoController {

    @FXML
    private RadioButton btEsporte;

    @FXML
    private Button btOk;

    @FXML
    private TextField txtClass;

    @FXML
    private RadioButton btPuzzle;

    @FXML
    private RadioButton btRTS;

    @FXML
    private RadioButton btOutros;

    @FXML
    private RadioButton btTerror;

    @FXML
    private TextField txtNome;

    @FXML
    private TextArea txtDescricao;

    @FXML
    private RadioButton btPlataforma;

    @FXML
    private RadioButton btFPS;

    @FXML
    private Button btVoltar;
    
    @FXML
    private TextField txtloginDev;

    @FXML
    private TextField txtPreco;

    @FXML
    private RadioButton btAcao;

    @FXML
    void handleOkButton(ActionEvent event) {
    	String nome = txtNome.getText();
    	double preco = Double.parseDouble(txtPreco.getText());
    	int classificacao = Integer.parseInt(txtClass.getText());
    	String descricao = txtDescricao.getText();
    	String loginDev = txtloginDev.getText();
    	
    	Usuario usuario = Fachada.getInstance().contUsuario().procurarUsuario(loginDev);
    	Jogo jogo;
    	if(usuario != null && (usuario instanceof Desenvolvedor)){
    		Desenvolvedor desenvolvedor = (Desenvolvedor) usuario;
    		if(btAcao.isSelected()){
        		jogo = new Jogo(nome, Genero.Acao, classificacao, desenvolvedor, preco, descricao);
    		}else{
    			if(btTerror.isSelected()) {
    				jogo = new Jogo(nome, Genero.Terror, classificacao, desenvolvedor, preco, descricao);
    			}else{
    				if(btEsporte.isSelected()){
    					jogo = new Jogo(nome, Genero.Esporte, classificacao, desenvolvedor, preco, descricao);
    				}else{
    					if(btPlataforma.isSelected()){
    						jogo = new Jogo(nome, Genero.Plataforma, classificacao, desenvolvedor, preco, descricao);
    					}else{
    						if(btFPS.isSelected()){
    							jogo = new Jogo(nome, Genero.FPS, classificacao, desenvolvedor, preco, descricao);
    						}else{
    							if(btRTS.isSelected()){
    								jogo = new Jogo(nome, Genero.RTS, classificacao, desenvolvedor, preco, descricao);
    							}else{
    								if(btPuzzle.isSelected()){
    									jogo = new Jogo(nome, Genero.Puzzle, classificacao, desenvolvedor, preco, descricao);
    								}else{
    									jogo = new Jogo(nome, Genero.Outros, classificacao, desenvolvedor, preco, descricao);
    								}
    							}
    						}
    					}
    				}
    			}
    		}
    		
    		try {
				Fachada.getInstance().contJogo().adicionarProduto(jogo);
				desenvolvedor.addJogo(jogo);
				Alert alert = new Alert(AlertType.CONFIRMATION);
				alert.setTitle("Jogo Cadastrado.");
				alert.setHeaderText(null);
				alert.setContentText("Cadastro efetuado com sucesso.");
				alert.showAndWait();
				MainApp.trocaCena(3);
			} catch (CadastroInvalidoException e) {
				Alert alert = new Alert(AlertType.ERROR);
				alert.setTitle("Erro no cadastro");
				alert.setHeaderText("Faltam informações.");
				alert.setContentText("Preencha todos os campos.");
				alert.showAndWait();
			} catch (JaExisteException e) {
				Alert alert = new Alert(AlertType.ERROR);
				alert.setTitle("Erro no cadastro.");
				alert.setHeaderText("Esse jogo já existe.");
				alert.setContentText("Por favor escolha outro nome.");
				alert.showAndWait();
			}
    	}else{
    		Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("Erro no cadastro.");
			alert.setHeaderText(null);
			alert.setContentText("Informe o seu login.");
			alert.showAndWait();
    	}
    }

    @FXML
    void handleVoltarButton(ActionEvent event) {
    	MainApp.trocaCena(3);
    }

}

