package br.ufrpe.bcc.ip2.projeto.repositorios;

import java.util.LinkedList;

import br.ufrpe.bcc.ip2.projeto.classesBasicas.Sessao;

public class RepositorioDeSessao implements IRepositorioDeSessao {
	
	private static RepositorioDeSessao repositorioDeSessao;
	private LinkedList <Sessao> repositorio = new LinkedList <Sessao>();
	
	private RepositorioDeSessao(){}
	
	public static RepositorioDeSessao getInstance(){
		if(repositorioDeSessao == null)
			repositorioDeSessao = new RepositorioDeSessao();
		return repositorioDeSessao;
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
