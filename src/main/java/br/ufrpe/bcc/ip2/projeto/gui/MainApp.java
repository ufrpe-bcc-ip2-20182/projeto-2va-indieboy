package br.ufrpe.bcc.ip2.projeto.gui;

import java.util.ArrayList;

import br.ufrpe.bcc.ip2.projeto.classesBasicas.Admin;
import br.ufrpe.bcc.ip2.projeto.classesBasicas.Cliente;
import br.ufrpe.bcc.ip2.projeto.classesBasicas.Desenvolvedor;
import br.ufrpe.bcc.ip2.projeto.classesBasicas.Usuario;
import br.ufrpe.bcc.ip2.projeto.controladores.Fachada;
import br.ufrpe.bcc.ip2.projeto.exceptions.CadastroInvalidoException;
import br.ufrpe.bcc.ip2.projeto.exceptions.JaExisteException;
import br.ufrpe.bcc.ip2.projeto.gui.control.VerCatalogoController;
import br.ufrpe.bcc.ip2.projeto.gui.control.VerSessoesController;
import br.ufrpe.bcc.ip2.projeto.gui.control.VerUsuarioController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApp extends Application{
	
	private static FXMLLoader verCatalogo;
	private static FXMLLoader verUsuario;
	private static FXMLLoader verSessao;
	private static VerCatalogoController controllerCatalogo;
	private static VerUsuarioController controllerUsuario;
	private static VerSessoesController controllerSessao;
	private static ArrayList<Scene> cenas = new ArrayList<Scene>();
	private static Stage stage;
	
	public  void criaCena(String doc) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource(doc));
        Scene scene = new Scene(root);
        cenas.add(scene);
	}
	
	public static void trocaCena(int i) {
		if(i == 12){
			MainApp.controllerCatalogo.atualizarTable();
			stage.setScene(cenas.get(i));
		}else{
			if(i == 16){
				MainApp.controllerUsuario.atualizarTable();
				stage.setScene(cenas.get(i));
			}else{
				if(i == 15){
					MainApp.controllerSessao.atualizarTable();
					stage.setScene(cenas.get(i));
				}else{
					stage.setScene(cenas.get(i));
				}
			}
		}
			
	}
	
	 public static Stage getStage() {
		return stage;
	}
	
	public void start(Stage stagePrimare) throws Exception {
		stage = stagePrimare;
	    criaCena("model/TelaInicial.fxml");              //0
	    criaCena("model/MenuAdmin.fxml");                //1
	    criaCena("model/MenuCliente.fxml");              //2
	    criaCena("model/MenuDev.fxml");                  //3
	    criaCena("model/EscolhaCadastro.fxml");          //4
	    criaCena("model/CadastroAdmin.fxml");            //5
	    criaCena("model/CadastroCliente.fxml");          //6
	    criaCena("model/CadastroDev.fxml");              //7
	    criaCena("model/AdicionarJogo.fxml");            //8  
	    criaCena("model/AlterarPreco.fxml");             //9
	    criaCena("model/AlterarSenha.fxml");             //10
	    criaCena("model/VerBiblioteca.fxml");            //11
	 // criaCena("model/VerCatalogo.fxml");              //12
	    verCatalogo = new FXMLLoader(getClass().getResource("model/VerCatalogo.fxml"));
	    Scene sceneCatalogo = new Scene(verCatalogo.load());
	    controllerCatalogo = verCatalogo.getController();
	    cenas.add(sceneCatalogo);
	    
	    criaCena("model/AlterarSenhaDesenvolvedor.fxml");//13
	    criaCena("model/VerJogosDev.fxml");			   //14
	    //criaCena("model/VerSessoes.fxml");               //15
	    verSessao = new FXMLLoader(getClass().getResource("model/VerSessoes.fxml"));
	    Scene sceneSessao = new Scene(verSessao.load());
	    controllerSessao = verSessao.getController();
	    cenas.add(sceneSessao);
	    
	    //criaCena("model/VerUsuario.fxml");               //16
	    verUsuario = new FXMLLoader(getClass().getResource("model/VerUsuario.fxml"));
	    Scene sceneUsuario = new Scene(verUsuario.load());
	    controllerUsuario = verUsuario.getController();
	    cenas.add(sceneUsuario);
	        
	    stage.setScene(cenas.get(0));
	    stage.setTitle("IndieBoy");
	    stage.show();
	}
	
    public static void main(String[] args) {
    	Usuario admin = new Admin("adm", "123");
    	try {
			Fachada.getInstance().contUsuario().adicionarUsuario(admin);
		} catch (CadastroInvalidoException | JaExisteException e) {
			e.printStackTrace();
		}
    	
    	/*Usuario dev = new Desenvolvedor("dev", "123", "dev");
    	try {
			Fachada.getInstance().contUsuario().adicionarUsuario(dev);
		} catch (CadastroInvalidoException | JaExisteException e) {
			e.printStackTrace();
		}
    	
    	Cliente cliente = new Cliente("u", "123", "Ulisses");
    	try {
			Fachada.getInstance().contUsuario().adicionarUsuario(cliente);
		} catch (CadastroInvalidoException | JaExisteException e) {
			// TODO Auto-generated catch block
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
