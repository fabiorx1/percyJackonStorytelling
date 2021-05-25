package br.unifei.ecot02.trabalho1;

public class Cacadora extends Imortal {
	
	public Cacadora(Mortal mortal) {
		this.setDescricao("Ser Feminino Imortal, jurou a Artemis abdicação do amor romantico.");
		this.setNome(mortal.getNome());
		this.setIsOraculo(false);
		this.setNascimento(mortal.getNascimento());
		
		if(mortal.getClass() == Humano.class) this.getElementos().add(Elemento.nevoa(70, this));

	}
}
