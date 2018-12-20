package br.ufrpe.bcc.lp2.repositorios;

import java.util.LinkedList;
import br.ufrpe.bcc.ip2.classesBasicas.Usuario;

public class RepositorioDeUsuario {
	
	private LinkedList <Usuario> repositorio;
	
	public RepositorioDeUsuario() {
		repositorio = new LinkedList <Usuario>();
	}
	
	public void adicionar(Usuario usuario){
		repositorio.add(usuario);
	}
	
	public Usuario procurar(String login){
		for(int i = 0; i<this.repositorio.size(); ++i){
			if(login.equals(this.repositorio.get(i).getLogin())){
				return this.repositorio.get(i);
			}
		}
		return null;
	}
	
	public int procurarIndice(String login){
		for(int i = 0; i<this.repositorio.size(); ++i){
			if(login.equals(this.repositorio.get(i).getLogin()))
				return i;
		}
		return -1;
	}
	
	public void remover(String login){
		Usuario usuario = procurar(login);
		repositorio.remove(usuario);
	}
	
	public void atualizar(int indice, String novaSenha){
		repositorio.get(indice).setSenha(novaSenha);
	}
}
