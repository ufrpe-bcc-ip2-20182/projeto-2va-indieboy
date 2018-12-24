package br.ufrpe.bcc.ip2.projeto.classesBasicas;

import java.time.LocalDate;
import java.time.LocalTime;

public class Sessao {
	private short numSessao;
	private LocalDate data;
	private LocalTime horarioInicio;
	private LocalTime horarioFim;
	private Cliente cliente;
	private double pagamento;
	
	public Sessao(short numSessao, Cliente cliente, short indice){
		this.numSessao = numSessao;
		this.cliente = cliente;
		data = LocalDate.now();
		horarioInicio = LocalTime.now();
	}

	public LocalTime getHorarioFim() {
		return horarioFim;
	}

	public void setHorarioFim(LocalTime horarioFim) {
		this.horarioFim = horarioFim;
	}

	public double getPagamento() {
		return pagamento;
	}

	public void setPagamento(double pagamento) {
		this.pagamento += pagamento;
	}

	public short getNumSessao() {
		return numSessao;
	}

	public LocalDate getData() {
		return data;
	}

	public LocalTime getHorarioInicio() {
		return horarioInicio;
	}

	public Cliente getCliente() {
		return cliente;
	}	
}
