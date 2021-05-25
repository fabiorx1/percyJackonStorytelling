package br.unifei.ecot02.trabalho1;

public class Heroi extends Semideus {
	
	private Antropozoomorfo protetor;
	private Humano enteHumano;
	
	public Heroi(Deidade deus) {
		super(deus);
	}
	
	public Heroi(Deidade deus, String nome, String descricao) {
		super(deus, nome, descricao);
	}

	public Antropozoomorfo getProtetor() {
		return protetor;
	}

	public void setProtetor(Antropozoomorfo protetor) {
		this.protetor = protetor;
	}
	
	public Humano getEnteHumano() {
		return enteHumano;
	}

	public void setEnteHumano(Humano enteHumano) {
		this.enteHumano = enteHumano;
		System.out.println("%s e o ente humano de %s".formatted(enteHumano.getNome(), this.getNome()));
	}


}
