package br.ufrpe.bcc.ip2.projeto.controladores;

import java.time.LocalDate;
import java.time.LocalTime;

import br.ufrpe.bcc.ip2.projeto.classesBasicas.Cliente;
import br.ufrpe.bcc.ip2.projeto.classesBasicas.Sessao;
import br.ufrpe.bcc.ip2.projeto.repositorios.IRepositorioDeSessao;

public class ControladorDeSessao {
	
	private IRepositorioDeSessao repositorio;
	
	public ControladorDeSessao(IRepositorioDeSessao repositorio){
		this.repositorio = repositorio;
	}

	public void adicionarSessao(Sessao sessao){
		if(sessao != null){
			this.repositorio.adicionar(sessao);
		}else{
			//excessao
		}
	}
	
	public Sessao procurarSessao(int numSessao){
		return this.repositorio.procurar(numSessao);
	}
	
	public Cliente verificarCliente(int numSessao){
		Sessao sessao = this.repositorio.procurar(numSessao);
		if(sessao != null)
			return sessao.getCliente();
			
		else{
			return null; //so pra n ficar no erro
			//excessao?
		}
	}
	
	public LocalDate verificarData(int numSessao){
		Sessao sessao = this.repositorio.procurar(numSessao);
		if(sessao != null)
			return sessao.getData();
		else return null; //excessao?
	}
	
	public LocalTime verificarHorarioInicio (int numSessao){
		Sessao sessao = this.repositorio.procurar(numSessao);
		if(sessao != null)
			return sessao.getHorarioInicio();
		else return null;
	}
	
	public LocalTime verificarHorarioFim (int numSessao){
		Sessao sessao = this.repositorio.procurar(numSessao);
		if(sessao != null)
			return sessao.getHorarioFim();
		else return null;
	}
	
	public double verificarPagamento (int numSessao){
		Sessao sessao = this.repositorio.procurar(numSessao);
		if (sessao != null)
			return sessao.getPagamento();
		else return -1; // ??
	}
}
