package br.ufrpe.bcc.ip2.projeto.exceptions;

public class JaExisteException extends Exception{
	public JaExisteException(String objeto){
		super(objeto + " ja existe");
	}
}
