package br.ufrpe.bcc.ip2.projeto.classesBasicas;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

public class Sessao implements Serializable{
	private int numSessao;
	private LocalDate data;
	private LocalTime horarioInicio;
	private LocalTime horarioFim;
	private Cliente cliente;
	private double pagamento;
	
	public Sessao(int numSessao, Cliente cliente){
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

	public int getNumSessao() {
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
