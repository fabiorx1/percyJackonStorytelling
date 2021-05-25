package br.unifei.ecot02.trabalho1;

public class Humano extends Mortal implements Abencoavel{

	public Humano(String nome, String descricao) {
		super(nome, descricao);
	}
	public Cacadora jurarArtemis() {
		return new Cacadora(this);
		
	}

}
