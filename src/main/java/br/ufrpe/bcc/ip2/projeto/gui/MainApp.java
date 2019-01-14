package br.ufrpe.bcc.ip2.projeto.gui;

import javafx.application.Application;
import java.util.ArrayList;
import br.ufrpe.bcc.ip2.projeto.classesBasicas.Admin;
import br.ufrpe.bcc.ip2.projeto.classesBasicas.Desenvolvedor;
import br.ufrpe.bcc.ip2.projeto.classesBasicas.Sessao;
import br.ufrpe.bcc.ip2.projeto.classesBasicas.Usuario;
import br.ufrpe.bcc.ip2.projeto.controladores.Fachada;
import br.ufrpe.bcc.ip2.projeto.exceptions.CadastroInvalidoException;
import br.ufrpe.bcc.ip2.projeto.exceptions.JaExisteException;
import br.ufrpe.bcc.ip2.projeto.exceptions.NaoExisteException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApp extends Application{

	private static ArrayList<Scene> cenas = new ArrayList<Scene>();
	private static Stage stage;
	
	public  void criaCena(String doc) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource(doc));
        Scene scene = new Scene(root);
        cenas.add(scene);
	}
	
	public static void trocaCena(int i) {
        stage.setScene(cenas.get(i));
	}
	
	 public static Stage getStage() {
		return stage;
	}
	 
	public static void setStage(Stage stage) {
		MainApp.stage = stage;
	}
	
	public void start(Stage stagePrimare) throws Exception {
		stage = stagePrimare;
	    criaCena("TelaInicial.fxml");              //0
	    criaCena("MenuAdmin.fxml");                //1
	    criaCena("MenuCliente.fxml");              //2
	    criaCena("MenuDev.fxml");                  //3
	    criaCena("EscolhaCadastro.fxml");          //4
	    criaCena("CadastroAdmin.fxml");            //5
	    criaCena("CadastroCliente.fxml");          //6
	    criaCena("CadastroDev.fxml");              //7
	    criaCena("AdicionarJogo.fxml");            //8  
	    criaCena("AlterarPreco.fxml");             //9
	    criaCena("AlterarSenha.fxml");             //10
	    criaCena("VerBiblioteca.fxml");            //11
	    criaCena("VerCatalogo.fxml");              //12
	    criaCena("AlterarSenhaDesenvolvedor.fxml");//13
	    criaCena("VerJogosDev.fxml");			   //14
	    criaCena("VerSessoes.fxml");               //15
	    criaCena("VerUsuario.fxml");               //16
	    criaCena("VerDev.fxml");				   //17
	    criaCena("Compra.fxml");				   //18
	        
	    stage.setScene(cenas.get(0));
	    stage.setTitle("IndieBoy");
	    stage.show();
	    setStage(stage);
	}
	
    public static void main(String[] args) {
    	Usuario admin = new Admin("adm", "123");
    	try {
			Fachada.getInstance().contUsuario().adicionarUsuario(admin);
		} catch (CadastroInvalidoException | JaExisteException e) {
			e.printStackTrace();
		}
    	
    	Usuario dev = new Desenvolvedor("dev", "123", "dev");
    	try {
			Fachada.getInstance().contUsuario().adicionarUsuario(dev);
		} catch (CadastroInvalidoException | JaExisteException e) {
			e.printStackTrace();
		}
    	
    	/*Sessao sessao = new Sessao(1, null, 4);
    	try {
			Fachada.getInstance().contSessao().adicionarSessao(sessao);
		} catch (NaoExisteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
    	launch(args);
    }
}
