package br.ufrpe.bcc.ip2.projeto.exceptions;

@SuppressWarnings("serial")
public class CadastroInvalidoException extends Exception{
	public CadastroInvalidoException(){
		super("Cadastro Invalido");
	}
}
