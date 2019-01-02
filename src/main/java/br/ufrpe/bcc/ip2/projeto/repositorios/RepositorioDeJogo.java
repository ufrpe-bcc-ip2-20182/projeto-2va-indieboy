package br.ufrpe.bcc.ip2.projeto.repositorios;

import java.util.LinkedList;
import br.ufrpe.bcc.ip2.projeto.classesBasicas.Jogo;

public class RepositorioDeJogo implements IRepositorioDeJogo{
	
	private LinkedList <Jogo> repositorio = new LinkedList <Jogo>();
	private static RepositorioDeJogo repositorioDeJogo;
	
	private RepositorioDeJogo() {}
	
	public RepositorioDeJogo getInstance(){
		if(repositorioDeJogo == null)
			repositorioDeJogo = new RepositorioDeJogo();
		return repositorioDeJogo;
	}
	
	public void adicionar(Jogo jogo){
		repositorio.add(jogo);
	}
	
	public Jogo procurar(String nome){
		for(int i = 0; i<this.repositorio.size(); ++i){
			if(nome.equals(this.repositorio.get(i).getNome())){
				return this.repositorio.get(i);
			}
		}
		return null;
	}
	
	public int procurarIndice(String nome){
		for(int i = 0; i<this.repositorio.size(); ++i){
			if(nome.equals(this.repositorio.get(i).getNome())){
				return i;
			}
		}
		return -1;
	}
	
	public void remover(String nome){
		Jogo jogo = procurar(nome);
		repositorio.remove(jogo);
	}
	
	public void atualizar(String nome, double novoPreco){
		int indice = procurarIndice(nome);
		repositorio.get(indice).setPreco(novoPreco);
	}
		
}
