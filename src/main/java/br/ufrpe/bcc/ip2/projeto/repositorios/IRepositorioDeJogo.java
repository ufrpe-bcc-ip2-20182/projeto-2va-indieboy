package br.ufrpe.bcc.ip2.projeto.repositorios;

import java.io.IOException;
import java.util.LinkedList;
import br.ufrpe.bcc.ip2.projeto.classesBasicas.Jogo;

public interface IRepositorioDeJogo {

	void adicionar(Jogo jogo);
	Jogo procurar(String nome);
	int procurarIndice(String nome);
	void remover(String nome);
	void atualizar(String nome, double novoPreco);
	LinkedList<Jogo> getJogoArray();
	void salvarDados() throws IOException;
	
}
