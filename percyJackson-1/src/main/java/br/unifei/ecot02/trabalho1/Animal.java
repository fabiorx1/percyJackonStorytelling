package br.unifei.ecot02.trabalho1;

public class Animal extends Mortal {
	private String especie;
	
	public Animal() {}
	public Animal(String especie) {
		super();
		System.out.println("%s s *existem*");
		this.especie = especie;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

}
