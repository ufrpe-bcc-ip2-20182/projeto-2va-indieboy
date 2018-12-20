package br.ufrpe.bcc.ip2.classesBasicas;

import java.time.LocalDate;
//import java.util.LinkedList;

public class Cliente extends Usuario{
	private String nome;
	private LocalDate nascimento;
	private Cartao cartao;
	//private LinkedList <Jogo> jogosComprados;
	
	public Cliente(String login, String senha, String nome, LocalDate nascimento, Cartao cartao) {
		super(login, senha);
		this.nome = nome;
		this.nascimento = nascimento;
		this.cartao = cartao;
		//this.jogosComprados  = new LinkedList<Jogo>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getNascimento() {
		return nascimento;
	}

	public void setNascimento(LocalDate nascimento) {
		this.nascimento = nascimento;
	}

	public Cartao getCartao() {
		return cartao;
	}

	public void setCartao(Cartao cartao) {
		this.cartao = cartao;
	}

	/*public LinkedList<Jogo> getJogosComprados() {
		return jogosComprados;
	}
	
	public void addJogoComprado(Jogo jogoComprado){
			jogosComprados.add(jogoComprado);
	}*/
}
