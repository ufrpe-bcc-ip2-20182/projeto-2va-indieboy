package br.ufrpe.bcc.ip2.projeto.controladores;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.LinkedList;

import br.ufrpe.bcc.ip2.projeto.classesBasicas.Cliente;
import br.ufrpe.bcc.ip2.projeto.classesBasicas.Jogo;
import br.ufrpe.bcc.ip2.projeto.classesBasicas.Sessao;
import br.ufrpe.bcc.ip2.projeto.exceptions.*;
import br.ufrpe.bcc.ip2.projeto.repositorios.IRepositorioDeSessao;

public class ControladorDeSessao {
	
	private IRepositorioDeSessao repositorio;
	
	public ControladorDeSessao(IRepositorioDeSessao repositorio){
		this.repositorio = repositorio;
	}

	public void adicionarSessao(Sessao sessao) throws NaoExisteException{
		if(sessao != null){
			this.repositorio.adicionar(sessao);
		}else{
			throw new NaoExisteException("Sessao");
		}
	}
	
	public Sessao procurarSessao(int numSessao){
		return this.repositorio.procurar(numSessao);
	}
	
	public Cliente verificarCliente(int numSessao) throws NaoExisteException{
		Sessao sessao = this.repositorio.procurar(numSessao);
		if(sessao != null)
			return sessao.getCliente();
		else throw new NaoExisteException("Mesa");
	}
	
	public LocalDate verificarData(int numSessao) throws NaoExisteException{
		Sessao sessao = this.repositorio.procurar(numSessao);
		if(sessao != null)
			return sessao.getData();
		else throw new NaoExisteException("Mesa");
	}
	
	public LocalTime verificarHorarioInicio (int numSessao) throws NaoExisteException{
		Sessao sessao = this.repositorio.procurar(numSessao);
		if(sessao != null)
			return sessao.getHorarioInicio();
		else throw new NaoExisteException("Mesa");
	}
	
	public LocalTime verificarHorarioFim (int numSessao) throws NaoExisteException{
		Sessao sessao = this.repositorio.procurar(numSessao);
		if(sessao != null)
			return sessao.getHorarioFim();
		else throw new NaoExisteException("Mesa");
	}
	
	public double verificarPagamento (int numSessao) throws NaoExisteException{
		Sessao sessao = this.repositorio.procurar(numSessao);
		if (sessao != null)
			return sessao.getPagamento();
		else throw new NaoExisteException("Mesa");
	}
	
	public LinkedList<Sessao> getSessaoArray() {
		return repositorio.getSessaoArray();
	}
	
	public void salvarDados() throws IOException{
		repositorio.salvarDados();
	}
	
}
