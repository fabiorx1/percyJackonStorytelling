package br.unifei.ecot02.trabalho1;

public class Antropozoomorfo extends Semideus {
	
	private Animal animal;
	
	public Antropozoomorfo(Deidade deus, Animal animal) {
		super(deus);
		this.animal = animal;
	}
	
	public Antropozoomorfo(Deidade deus, Animal animal, String nome, String descricao) {
		super(deus, nome, descricao);
		System.out.println("meio humano(a), meio %s".formatted(animal.getNome()));
		this.animal = animal;
	}

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

}
