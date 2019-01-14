package br.ufrpe.bcc.ip2.projeto.controladores;

import java.io.IOException;
import java.util.LinkedList;

import br.ufrpe.bcc.ip2.projeto.classesBasicas.Jogo;
import br.ufrpe.bcc.ip2.projeto.exceptions.*;
import br.ufrpe.bcc.ip2.projeto.repositorios.IRepositorioDeJogo;

public class ControladorDeJogo {

	private IRepositorioDeJogo repositorio;
	
	public ControladorDeJogo(IRepositorioDeJogo repositorio){
		this.repositorio = repositorio;
	}
	
	public void adicionarProduto(Jogo jogo) throws CadastroInvalidoException, JaExisteException, IOException{
		if(jogo != null){
			if(this.repositorio.procurar(jogo.getNome()) == null){
				this.repositorio.adicionar(jogo);
				repositorio.salvarDados();
			}else throw new JaExisteException("Jogo");
		}else throw new CadastroInvalidoException();
	}
	
	public Jogo procurarProduto(String nome){
		return this.repositorio.procurar(nome);
	}
	
	public void removerProduto(String nome) throws NaoExisteException, IOException{
		Jogo jogo = this.repositorio.procurar(nome);
		if(jogo != null){
			this.repositorio.remover(nome);
			repositorio.salvarDados();
		}else{
			throw new NaoExisteException("Jogo");
		}
	}
	
	public void atualizarPreco(String nome, double preco) throws NaoExisteException, IOException{
		Jogo jogo = this.repositorio.procurar(nome);
		if(jogo !=null){
			this.repositorio.atualizar(nome, preco);
			repositorio.salvarDados();
		}else{
			throw new NaoExisteException("Jogo");
		}
	}
	
	public LinkedList<Jogo> getJogoArray() {
		return repositorio.getJogoArray();
	}
	
}
