package br.ufrpe.bcc.ip2.projeto.repositorios;

import java.util.LinkedList;
import br.ufrpe.bcc.ip2.projeto.classesBasicas.Jogo;

public interface IRepositorioDeJogo {

	public void adicionar(Jogo jogo);
	public Jogo procurar(String nome);
	public int procurarIndice(String nome);
	public void remover(String nome);
	public void atualizar(String nome, double novoPreco);
	public LinkedList<Jogo> getJogoArray();
}
