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
	    criaCena("IndieBoy.fxml");            //0
	    criaCena("MenuAdmin.fxml");           //1
	    criaCena("MenuCliente.fxml");         //2
	    criaCena("MenuDev.fxml");             //3
	    criaCena("CadastroAdmin.fxml");       //4
	    criaCena("CadastroCliente.fxml");     //5
	    criaCena("CadastroDev.fxml");         //6
	    criaCena("AdicionarJogo.fxml");       //7
	    criaCena("AlterarPreco.fxml");        //8
	    criaCena("AlterarSenha.fxml");        //9
	        
	    stage.setScene(cenas.get(0));
	    stage.setTitle("IndieBoy");
	    stage.show();
	    setStage(stage);
	}
	
    public static void main(String[] args) {
        //System.out.println("Executando...");
    	launch(args);
    }
}
