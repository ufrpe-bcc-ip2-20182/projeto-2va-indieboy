package br.ufrpe.bcc.ip2.projeto.controladores;

import br.ufrpe.bcc.ip2.projeto.classesBasicas.Usuario;
import br.ufrpe.bcc.ip2.projeto.repositorios.RepositorioDeUsuario;

public class ControladorDeUsuario {
	
	private static ControladorDeUsuario controlador;
	private RepositorioDeUsuario repositorio;
	
	private ControladorDeUsuario(){
		repositorio = new RepositorioDeUsuario();
	}
	
	public static ControladorDeUsuario getInstance(){
		if (controlador == null)
			controlador = new ControladorDeUsuario();
		return controlador;
	}
	
	public void adicionar(String login, String senha){
		
	}
	
	//public Usuario procurar(String login, String senha){
		//for()
	//}
	
}