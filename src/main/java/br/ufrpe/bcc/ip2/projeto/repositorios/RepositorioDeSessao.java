package br.ufrpe.bcc.ip2.projeto.repositorios;

import java.util.LinkedList;

import br.ufrpe.bcc.ip2.projeto.classesBasicas.Sessao;

public class RepositorioDeSessao {
	private LinkedList <Sessao> repositorio;
	
	public RepositorioDeSessao(){
		repositorio = new LinkedList <Sessao>();
	}
	
	public void adicionar(Sessao sessao){
		repositorio.add(sessao);
	}
	
	public Sessao procurar(int numSessao){
		for(int i=0; i<this.repositorio.size(); ++i){
			if(numSessao == this.repositorio.get(i).getNumSessao()){
				return this.repositorio.get(i);
			}
		}
		return null;
	}
}
