package br.ufrpe.bcc.ip2.projeto.classesBasicas;

public enum Genero {
	Ação(1),            Aventura(2),        Terror(3),
	Simulação(4),       Esporte(5),         Corrida(6), 
	Plataforma(7),      Puzzle(8),          Outros(9),
	FPS(10),            MOBA(11),           RTS(12);
	
	private int valor;
	
	Genero(int valor){
		this.valor = valor;
	}
	
	public int getGenero() {
        return this.valor;
    }
}
