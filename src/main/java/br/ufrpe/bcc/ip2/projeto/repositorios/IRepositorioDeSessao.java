package br.ufrpe.bcc.ip2.projeto.repositorios;

import java.io.IOException;
import java.util.LinkedList;

import br.ufrpe.bcc.ip2.projeto.classesBasicas.Sessao;

public interface IRepositorioDeSessao {

	public void adicionar(Sessao sessao);
	public Sessao procurar(int numSessao);
	public LinkedList<Sessao> getSessaoArray();
	public void salvarDados() throws IOException;
}
