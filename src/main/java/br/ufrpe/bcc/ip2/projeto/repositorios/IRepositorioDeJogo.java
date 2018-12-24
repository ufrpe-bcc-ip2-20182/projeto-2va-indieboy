package br.ufrpe.bcc.ip2.projeto.repositorios;

import br.ufrpe.bcc.ip2.projeto.classesBasicas.Jogo;

public interface IRepositorioDeJogo {

	public void adicionar(Jogo jogo);
	public Jogo procurar(String nome);
	public void remover(String nome);
	public void atualizar(int indice, double novoPreco);
}
