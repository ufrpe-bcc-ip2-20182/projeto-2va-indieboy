package br.ufrpe.bcc.ip2.projeto.repositorios;

import java.util.LinkedList;

import br.ufrpe.bcc.ip2.projeto.classesBasicas.Usuario;

public class RepositorioDeUsuario implements IRepositorioDeUsuario{
	
	private static RepositorioDeUsuario repositorioUsuario;
	private LinkedList <Usuario> repositorio = new LinkedList <Usuario>();;
	
	public static RepositorioDeUsuario getInstance(){
		if(repositorioUsuario == null){
			repositorioUsuario = new RepositorioDeUsuario();
		}
		return repositorioUsuario;
	}
	
	private RepositorioDeUsuario (){}
	
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

	public Usuario login(String login, String senha){
		for(int i = 0; i<this.repositorio.size(); ++i){
			if(login.equals(this.repositorio.get(i).getLogin()) && senha.equals(this.repositorio.get(i).getSenha()))
				return this.repositorio.get(i);
		}
		return null;
	}
}
