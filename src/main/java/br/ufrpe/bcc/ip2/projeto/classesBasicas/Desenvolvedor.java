package br.ufrpe.bcc.ip2.projeto.classesBasicas;

import java.util.LinkedList;

public class Desenvolvedor extends Usuario{
	private LinkedList <Jogo> jogos;
	private String nome;
	
	public Desenvolvedor(String login, String senha, String nome) {
		super(login, senha);
		this.nome = nome;
		jogos = new LinkedList<Jogo>();
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
