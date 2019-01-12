package br.ufrpe.bcc.ip2.projeto.gui;

import javafx.application.Application;
import java.util.ArrayList;
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
	    criaCena("TelaInicial.fxml");         //0
	    criaCena("MenuAdmin.fxml");           //1
	    criaCena("MenuCliente.fxml");         //2
	    criaCena("MenuDev.fxml");             //3
	    criaCena("EscolhaCadastro.fxml");     //4
	    criaCena("CadastroAdmin.fxml");       //5
	    criaCena("CadastroCliente.fxml");     //6
	    criaCena("CadastroDev.fxml");         //7
	    criaCena("AdicionarJogo.fxml");       //8
	    criaCena("AlterarPreco.fxml");        //9
	    criaCena("AlterarSenha.fxml");        //10
	        
	    stage.setScene(cenas.get(0));
	    stage.setTitle("IndieBoy");
	    stage.show();
	    setStage(stage);
	}
	
    public static void main(String[] args) {
    	launch(args);
    }
}
