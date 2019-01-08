package br.ufrpe.bcc.ip2.projeto.exceptions;

@SuppressWarnings("serial")
public class NaoExisteException extends Exception{
	public NaoExisteException(String objeto){
		super(objeto + " nao existe");
	}
}
