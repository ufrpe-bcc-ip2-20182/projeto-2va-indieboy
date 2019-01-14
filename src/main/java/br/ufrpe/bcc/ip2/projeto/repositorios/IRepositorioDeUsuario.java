package br.ufrpe.bcc.ip2.projeto.repositorios;

import java.util.LinkedList;

import br.ufrpe.bcc.ip2.projeto.classesBasicas.Cliente;
import br.ufrpe.bcc.ip2.projeto.classesBasicas.Desenvolvedor;
import br.ufrpe.bcc.ip2.projeto.classesBasicas.Jogo;
import br.ufrpe.bcc.ip2.projeto.classesBasicas.Usuario;

public interface IRepositorioDeUsuario {

	public void adicionar(Usuario usuario);
	public Usuario procurar(String login);
	public int procurarIndice(String login);
	public void remover(String login);
	public void atualizar(int indice, String novaSenha);
	public Usuario login(String login, String senha);
	public LinkedList<Cliente> getClienteArray();
	public LinkedList<Desenvolvedor> getDevArray();
	//public LinkedList<Jogo> getJogosDoClienteArray(Cliente usuario);
	
}
