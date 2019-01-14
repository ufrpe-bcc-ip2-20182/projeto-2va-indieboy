package br.ufrpe.bcc.ip2.projeto.classesBasicas;

import java.io.Serializable;

public class Cartao implements Serializable{
	private String numCartao;
	private int senhaCartao;
	
	public Cartao(String numCartao, int senhaCartao) {
		this.numCartao = numCartao;
		this.senhaCartao = senhaCartao;
	}
	
	public String getNumCartao() {
		return numCartao;
	}
	public void setNumCartao(String numCartao) {
		this.numCartao = numCartao;
	}
	public int getSenhaCartao() {
		return senhaCartao;
	}
	public void setSenhaCartao(int senhaCartao) {
		this.senhaCartao = senhaCartao;
	}
}
