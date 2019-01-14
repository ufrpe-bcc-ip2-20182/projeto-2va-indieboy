package br.ufrpe.bcc.ip2.projeto.classesBasicas;

import java.io.Serializable;
import java.util.LinkedList;

public class Jogo implements Serializable{
	private String nome;
	private Genero genero;
	private int classificacaoEtaria;
	private Desenvolvedor desenvolvedor;
	private double preco;
	private String descricao;
	private LinkedList <String> comentarios;

	public Jogo(String nome, Genero genero, int classificacaoEtaria, Desenvolvedor desenvolvedor, double preco,
			String descricao) {
		this.nome = nome;
		this.genero = genero;
		this.classificacaoEtaria = classificacaoEtaria;
		this.desenvolvedor = desenvolvedor;
		this.preco = preco;
		this.descricao = descricao;
		comentarios = new LinkedList<String>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public int getClassificacaoEtaria() {
		return classificacaoEtaria;
	}

	public void setClassificacaoEtaria(short classificacaoEtaria) {
		this.classificacaoEtaria = classificacaoEtaria;
	}

	public Desenvolvedor getDesenvolvedor() {
		return desenvolvedor;
	}

	public void setDesenvolvedor(Desenvolvedor desenvolvedor) {
		this.desenvolvedor = desenvolvedor;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public void addComentarios(Cliente cliente, String comentario){
		String comentarioCompleto = "\n" + cliente.getNome() + ":\n" + comentario + "\n";
		comentarios.add(comentarioCompleto);
	}
	
	@Override
	public String toString() {
		String todosComentarios = new String();
		for(int i = 0; i < comentarios.size(); ++i)
			todosComentarios += comentarios.get(i);
		return todosComentarios;
	}
}
