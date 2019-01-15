package br.ufrpe.bcc.ip2.projeto.controladores;

import java.util.LinkedList;

import br.ufrpe.bcc.ip2.projeto.classesBasicas.Cliente;
import br.ufrpe.bcc.ip2.projeto.classesBasicas.Desenvolvedor;
import br.ufrpe.bcc.ip2.projeto.classesBasicas.Jogo;
import br.ufrpe.bcc.ip2.projeto.classesBasicas.Sessao;
import br.ufrpe.bcc.ip2.projeto.classesBasicas.Usuario;
import br.ufrpe.bcc.ip2.projeto.repositorios.*;

public class Fachada {
	private static Fachada fachada;
	private IRepositorioDeUsuario repositorioUsuario = RepositorioDeUsuario.getInstance();
	private IRepositorioDeJogo repositorioJogo = RepositorioDeJogo.getInstance();
	private IRepositorioDeSessao repositorioSessao = RepositorioDeSessao.getInstance();
	private ControladorDeUsuario controladorUsuario;
	private ControladorDeJogo controladorJogo;
	private ControladorDeSessao controladorSessao;
	private ControladorDeLogin controladorLogin;
	
	public static Fachada getInstance() {
	    if (fachada == null) {
	      fachada = new Fachada();
	    }
	    return fachada;
	}
	
	private Fachada () {
		this.controladorUsuario = new ControladorDeUsuario(this.repositorioUsuario);
		this.controladorJogo = new ControladorDeJogo(this.repositorioJogo);
		this.controladorSessao = new ControladorDeSessao(this.repositorioSessao);
		this.controladorLogin = new ControladorDeLogin(this.repositorioUsuario);
	}
	
	public ControladorDeUsuario contUsuario() {
		return this.controladorUsuario;
	}
	public ControladorDeJogo contJogo() {
		return this.controladorJogo;
	}
	public ControladorDeSessao contSessao() {
		return this.controladorSessao;
	}
	
	public ControladorDeLogin contLogin() {
		return this.controladorLogin;
	}
	
	public LinkedList<Cliente> getClienteArray() {
		return this.controladorUsuario.getClienteArray();
	}
	
	public LinkedList<Desenvolvedor> getDevArray() {
		return this.controladorUsuario.getDevArray();
	}
	
	public LinkedList<Sessao> getSessaoArray() {
		return this.controladorSessao.getSessaoArray();
	}
	
	public LinkedList<Jogo> getJogoArray() {
		return this.controladorJogo.getJogoArray();
	}
	
	public void addJogoComprado(String login, Jogo jogoComprado){
		this.controladorUsuario.addJogoComprado(login, jogoComprado);
	}
	
	public LinkedList<Usuario> getUsuarioArray(){
		return this.controladorUsuario.getUsuarioArray();
	}
	
}
