package br.ufrpe.bcc.ip2.projeto.classesBasicas;

import java.io.Serializable;

public abstract class Usuario implements Serializable{
	private String login;
	private String senha;
	
	public Usuario(String login, String senha){
		this.login = login;
		this.senha = senha;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}
