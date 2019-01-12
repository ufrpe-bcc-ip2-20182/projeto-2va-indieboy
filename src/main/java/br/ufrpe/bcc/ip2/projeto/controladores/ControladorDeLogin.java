package br.ufrpe.bcc.ip2.projeto.controladores;

import br.ufrpe.bcc.ip2.projeto.classesBasicas.Usuario;
import br.ufrpe.bcc.ip2.projeto.exceptions.CamposInvalidosException;
import br.ufrpe.bcc.ip2.projeto.exceptions.NaoExisteException;
import br.ufrpe.bcc.ip2.projeto.repositorios.IRepositorioDeUsuario;

public class ControladorDeLogin {
	
	private IRepositorioDeUsuario repositorio;
	
	public ControladorDeLogin(IRepositorioDeUsuario repositorio){
		this.repositorio = repositorio;
	}
	
	public Usuario verificarLogin(String login, String senha) throws NaoExisteException, CamposInvalidosException{
		if(login != null && senha != null){
			Usuario usuario = repositorio.login(login, senha);
			if(usuario != null){
				return usuario;
			}else throw new NaoExisteException("Usuario");
		}
		else throw new CamposInvalidosException();
	}
}
