package br.ufrpe.bcc.ip2.projeto.controladores;

import br.ufrpe.bcc.ip2.projeto.classesBasicas.Jogo;
import br.ufrpe.bcc.ip2.projeto.exceptions.CadastroInvalidoException;
import br.ufrpe.bcc.ip2.projeto.exceptions.JaExisteException;
import br.ufrpe.bcc.ip2.projeto.repositorios.IRepositorioDeJogo;

public class ControladorDeJogo {

	private IRepositorioDeJogo repositorio;
	
	public ControladorDeJogo(IRepositorioDeJogo repositorio){
		this.repositorio = repositorio;
	}
	
	public void adicionarProduto(Jogo jogo) throws CadastroInvalidoException, JaExisteException{
		if(jogo != null){
			if(this.repositorio.procurar(jogo.getNome()) == null){
				this.repositorio.adicionar(jogo);
			} throw new JaExisteException("Jogo");
		}else{
			throw new CadastroInvalidoException();
		}
	}
	
	public Jogo procurarProduto(String nome){
		return this.repositorio.procurar(nome);
	}
	
	public void removerProduto(String nome){
		Jogo jogo = this.repositorio.procurar(nome);
		if(jogo != null){
			this.repositorio.remover(nome);
		}else{
			//subir excessão
		}
	}
	
	public void atualizarPreco(String nome, double preco){
		Jogo jogo = this.repositorio.procurar(nome);
		if(jogo !=null){
			this.repositorio.atualizar(nome, preco);
		}else{
			//subir excessão
		}
	}
	
}
