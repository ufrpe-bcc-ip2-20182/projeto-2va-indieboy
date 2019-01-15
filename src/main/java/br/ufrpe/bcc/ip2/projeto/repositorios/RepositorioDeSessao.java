package br.ufrpe.bcc.ip2.projeto.repositorios;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;

import br.ufrpe.bcc.ip2.projeto.classesBasicas.Jogo;
import br.ufrpe.bcc.ip2.projeto.classesBasicas.Sessao;

public class RepositorioDeSessao implements IRepositorioDeSessao {
	
	private static RepositorioDeSessao repositorioDeSessao;
	private LinkedList <Sessao> repositorio = new LinkedList <Sessao>();
	
	private RepositorioDeSessao() {
		try {
			File f = new File("repSessao.bin");
			if(f.exists()){
				FileInputStream fis = new FileInputStream(f);
				ObjectInputStream ois = new ObjectInputStream(fis);
				repositorio = (LinkedList<Sessao>) ois.readObject();
			}else{
				repositorio = new LinkedList<Sessao>();
				salvarDados();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void salvarDados() throws IOException{
		FileOutputStream fos = new FileOutputStream("repSessao.bin");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(repositorio);
	}
	
	public static RepositorioDeSessao getInstance(){
		if(repositorioDeSessao == null)
			repositorioDeSessao = new RepositorioDeSessao();
		return repositorioDeSessao;
	}
	
	public void adicionar(Sessao sessao){
		repositorio.add(sessao);
	}
	
	public Sessao procurar(int numSessao){
		for(int i=0; i<this.repositorio.size(); ++i){
			if(numSessao == this.repositorio.get(i).getNumSessao()){
				return this.repositorio.get(i);
			}
		}
		return null;
	}
	
	public LinkedList<Sessao> getSessaoArray() {
		return repositorio;
	}
}
