package br.ufrpe.bcc.ip2.projeto.controladores;

import br.ufrpe.bcc.ip2.projeto.classesBasicas.Usuario;
import br.ufrpe.bcc.ip2.projeto.exceptions.*;
import br.ufrpe.bcc.ip2.projeto.repositorios.IRepositorioDeUsuario;
import java.util.LinkedList;
import br.ufrpe.bcc.ip2.projeto.classesBasicas.Cliente;
import br.ufrpe.bcc.ip2.projeto.classesBasicas.Desenvolvedor;
import br.ufrpe.bcc.ip2.projeto.classesBasicas.Jogo;

public class ControladorDeUsuario {
	
	private IRepositorioDeUsuario repositorio;
	
	public ControladorDeUsuario(IRepositorioDeUsuario repositorio){
		this.repositorio = repositorio;
	}
	
	public void adicionarUsuario(Usuario usuario) throws CadastroInvalidoException, JaExisteException{
		if(usuario != null){
			if(this.repositorio.procurar(usuario.getLogin()) == null){
				this.repositorio.adicionar(usuario);
			}else throw new JaExisteException("Usuario");
		}else throw new CadastroInvalidoException();
	}
	
	public Usuario procurarUsuario(String login){
		return this.repositorio.procurar(login);
	}
	
	public void removerUsuario(String login) throws NaoExisteException{
		Usuario usuario = this.repositorio.procurar(login);
		if(usuario != null){
			this.repositorio.remover(login);
		}else throw new NaoExisteException("Usuario");
	}
	
	public void atualizarSenha(String login, String senhaNova) throws NaoExisteException{
		Usuario usuario = this.repositorio.procurar(login);
		if(usuario != null){
			int indice = this.repositorio.procurarIndice(login);
			this.repositorio.atualizar(indice, senhaNova);
		}else throw new NaoExisteException("Usuario");
	}
	
	public LinkedList<Cliente> getClienteArray() {
		return repositorio.getClienteArray();
	}
	
	public LinkedList<Desenvolvedor> getDevArray() {
		return repositorio.getDevArray();
	}
	
	public void addJogoComprado(String login, Jogo jogoComprado){
		if(repositorio.procurar(login) instanceof Cliente){
			Cliente cliente = (Cliente) repositorio.procurar(login);
			repositorio.addJogoComprado(cliente, jogoComprado);
		}else{
			
		}
	}
	
	public LinkedList<Usuario> getUsuarioArray(){
		return repositorio.getUsuarioArray();
		
	}
	
	/*public LinkedList<Jogo> getJogosDoClienteArray(Cliente cliente) {
		return repositorio.getJogosDoClienteArray(cliente);
	}*/
	
}
