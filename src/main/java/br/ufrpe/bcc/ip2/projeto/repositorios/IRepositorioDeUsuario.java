package br.ufrpe.bcc.ip2.projeto.repositorios;

import br.ufrpe.bcc.ip2.projeto.classesBasicas.Usuario;

public interface IRepositorioDeUsuario {

	public void adicionar(Usuario usuario);
	public Usuario procurar(String login);
	public int procurarIndice(String login);
	public void remover(String login);
	public void atualizar(int indice, String novaSenha);
	public Usuario login(String login, String senha);
	
}
