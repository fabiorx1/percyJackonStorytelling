package br.unifei.ecot02.trabalho1;
import java.util.Date;
public abstract class Mortal extends Ser implements Oraculo{

	public Mortal() {}
	public Mortal(String name, String descricao) {
		super(name, descricao);
	}
	
	public Zumbi morrer(Date data) {
		return new Zumbi(this, data);
	}

	public void assumirOraculo() {
		System.out.println("%s, um(a) mortal, assumiu os poderes de um Oraculo".formatted(this.getNome()));
		this.setIsOraculo(true);
		
	}

	public void recitar(Profecia profecia) {
		System.out.println("%s recitou:\n%s".formatted(this.getNome(), profecia.getPoema()));
		
	}

	public void aparecer(Ser visitado, String mensagem) {
		System.out.println("%s visitou %s e deixou a seguinte mensagem:\n %s".formatted(this.getNome(), visitado.getNome(), mensagem));
	}
	
	
}
