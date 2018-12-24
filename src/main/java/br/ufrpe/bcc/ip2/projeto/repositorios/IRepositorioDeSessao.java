package br.ufrpe.bcc.ip2.projeto.repositorios;

import br.ufrpe.bcc.ip2.projeto.classesBasicas.Sessao;

public interface IRepositorioDeSessao {

	public void adicionar(Sessao sessao);
	public Sessao procurar(int numSessao);
}
