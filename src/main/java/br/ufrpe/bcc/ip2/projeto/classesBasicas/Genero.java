package br.ufrpe.bcc.ip2.projeto.classesBasicas;

public enum Genero {
	Acao(1),        Terror(2),
	Esporte(3),     Outros(4),
	Plataforma(5),  Puzzle(6),          
	FPS(7),        RTS(8);
	
	private int valor;
	
	Genero(int valor){
		this.valor = valor;
	}
	
	public int getGenero() {
        return this.valor;
    }
}
