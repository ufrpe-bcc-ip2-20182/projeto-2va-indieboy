package br.ufrpe.bcc.ip2.projeto.classesBasicas;

import java.io.Serializable;
import java.util.LinkedList;

public class Catalogo implements Serializable{
	private static Catalogo catalogo;	
	private LinkedList <Jogo> jogos;
	
	private Catalogo(){
		this.jogos = new LinkedList<Jogo>();
	}
	
	public static Catalogo getInstance(){
		if(catalogo == null){
			catalogo = new Catalogo();
		}
		return catalogo;
	}
	
	public void adicionarItem(Jogo jogo){
		this.jogos.add(jogo);
	}
	
	public void removerItem(Jogo jogo){
		this.jogos.remove(jogo);
	}
	
	public String toString(){
		String frase = new String();
		frase += "Nome     Preço\n";
		for(int i = 0; i < jogos.size(); ++i){
			frase += jogos.get(i).getNome();
			frase += "     " + jogos.get(i).getPreco() + "$";
			frase += "\n";
		}
		return frase;
	}
	
	public String toString(Jogo jogo){
		String frase = new String();
		frase += "\nNome: " + jogo.getNome();
		frase += "\nGenero: " + jogo.getGenero();
		frase += "\nClassificação Etaria: " + jogo.getClassificacaoEtaria();
		frase += "\nDesenvolvedor: " + jogo.getDesenvolvedor();
		frase += "\nDescrição: " + jogo.getDescricao();
		frase += "\nPreco: " + jogo.getPreco();
		frase += "\n\nComentarios: " + jogo.toString();
		return frase;
	}
}
