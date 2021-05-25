package br.unifei.ecot02.trabalho1;

public class Deidade extends Imortal implements Oraculo {
	
	public Deidade(String nome, String descricao) {
		super(nome, descricao);
	}
	
	public void assumirOraculo() {
		this.setIsOraculo(true);
	}

	public void recitar(Profecia profecia) {
		System.out.println("%s recitou:\n%s".formatted(this.getNome(), profecia.getPoema()));
	}

	public void aparecer(Ser visitado, String mensagem) {
		System.out.println("%s visitou %s e deixou a seguinte mensagem:\n %s".formatted(this.getNome(), visitado.getNome(), mensagem));
	}

}
