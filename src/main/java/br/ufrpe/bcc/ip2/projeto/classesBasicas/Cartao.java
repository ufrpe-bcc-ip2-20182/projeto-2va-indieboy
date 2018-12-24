package br.ufrpe.bcc.ip2.projeto.classesBasicas;

public class Cartao {
	private String titular;
	private String numCartao;
	private int senhaCartao;
	
	public Cartao(String titular, String numCartao, int senhaCartao) {
		this.titular = titular;
		this.numCartao = numCartao;
		this.senhaCartao = senhaCartao;
	}
	
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
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
