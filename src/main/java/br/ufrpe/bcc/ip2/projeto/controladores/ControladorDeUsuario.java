package br.ufrpe.bcc.ip2.projeto.controladores;

import br.ufrpe.bcc.ip2.projeto.classesBasicas.Usuario;
import br.ufrpe.bcc.ip2.projeto.exceptions.*;
import br.ufrpe.bcc.ip2.projeto.repositorios.IRepositorioDeUsuario;
import br.ufrpe.bcc.ip2.projeto.classesBasicas.Cartao;
import br.ufrpe.bcc.ip2.projeto.classesBasicas.Cliente;

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
	
	//public Usuario procurarCartao(String login, String numCartao, int senhaCartao){
		//return this.repositorio.procurar(login, numCartao, senhaCartao);
	//}
	
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
	
	/*public boolean existe(Cartao cartao, String login){
		return this.repositorio.equals(cartao);
	}*/
	
}
