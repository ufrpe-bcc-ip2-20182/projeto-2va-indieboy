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

public class RepositorioDeJogo implements IRepositorioDeJogo{

	private LinkedList <Jogo> repositorio = new LinkedList <Jogo>();
	private static RepositorioDeJogo repositorioDeJogo;

	private RepositorioDeJogo() {
		try {
			File f = new File("repJogos.bin");
			if(f.exists()){
				FileInputStream fis = new FileInputStream(f);
				ObjectInputStream ois = new ObjectInputStream(fis);
				repositorio = (LinkedList<Jogo>) ois.readObject();
			}else{
				repositorio = new LinkedList<Jogo>();
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
		FileOutputStream fos = new FileOutputStream("repJogos.bin");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(repositorio);
	}

	public static RepositorioDeJogo getInstance(){
		if(repositorioDeJogo == null)
			repositorioDeJogo = new RepositorioDeJogo();
		return repositorioDeJogo;
	}

	public void adicionar(Jogo jogo){
		repositorio.add(jogo);
	}

	public Jogo procurar(String nome){
		for(int i = 0; i<this.repositorio.size(); ++i){
			System.out.println(repositorio.get(i));
			if(nome.equals(this.repositorio.get(i).getNome())){
				return this.repositorio.get(i);
			}
		}
		return null;
	}

	public int procurarIndice(String nome){
		for(int i = 0; i<this.repositorio.size(); ++i){
			if(nome.equals(this.repositorio.get(i).getNome())){
				return i;
			}
		}
		return -1;
	}

	public void remover(String nome){
		Jogo jogo = procurar(nome);
		repositorio.remove(jogo);
	}

	public void atualizar(String nome, double novoPreco){
		int indice = procurarIndice(nome);
		repositorio.get(indice).setPreco(novoPreco);
	}

	public LinkedList<Jogo> getJogoArray() {
		return repositorio;
	}

}
