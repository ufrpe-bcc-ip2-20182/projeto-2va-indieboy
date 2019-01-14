package br.ufrpe.bcc.ip2.projeto.classesBasicas;

import java.io.Serializable;
import java.util.LinkedList;

public class Desenvolvedor extends Usuario implements Serializable{
	private LinkedList <Jogo> jogos;
	private String nome;
	
	public Desenvolvedor(String login, String senha, String nome) {
		super(login, senha);
		this.nome = nome;
		jogos = new LinkedList<Jogo>();
	}
	
	public Jogo procurarJogo(String nome){
		for(int i = 0; i<this.jogos.size(); ++i){
			if(nome.equals(this.jogos.get(i).getNome())){
				return this.jogos.get(i);
			}
		}
		return null;
	}
	
	public String getNome(){
		return nome;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}

	public LinkedList<Jogo> getJogos() {
		return jogos;
	}

	public void addJogo(Jogo jogo) {
		jogos.add(jogo);
	}
}
