package br.ufrpe.bcc.ip2.projeto.gui.control;

import java.time.LocalTime;
import br.ufrpe.bcc.ip2.projeto.classesBasicas.Cliente;
import br.ufrpe.bcc.ip2.projeto.classesBasicas.Sessao;
import br.ufrpe.bcc.ip2.projeto.controladores.Fachada;
import br.ufrpe.bcc.ip2.projeto.exceptions.NaoExisteException;
import br.ufrpe.bcc.ip2.projeto.gui.MainApp;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class MenuClienteController {

	private LocalTime horarioInicio = LocalTime.now();
	private static int contadorDeSessoes = 0;
    
	@FXML
    private Button btVoltar;

    @FXML
    private Button btBiblioteca;

    @FXML
    private Button btCatalogo;

    @FXML
    private Button btAlterarSenha;

    @FXML
    void handleBibliotecaButton(ActionEvent event) {
    	MainApp.trocaCena(11);
    }

    @FXML
    void handleCatalogoButton(ActionEvent event) {
    	MainApp.trocaCena(12);
    }

    @FXML
    void handleAlterarSenhaButton(ActionEvent event) {
    	MainApp.trocaCena(10);
    }

    @FXML
    void handleVoltarButton(ActionEvent event) {
    	Sessao sessao = new Sessao(contador(), TelaInicialController.getCliente());
    	sessao.setHorarioInicio(horarioInicio);
    	try {
			Fachada.getInstance().contSessao().adicionarSessao(sessao);
		} catch (NaoExisteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	MainApp.trocaCena(0);
    }
    
    public static int contador(){
		return contadorDeSessoes + 1;
	}

}