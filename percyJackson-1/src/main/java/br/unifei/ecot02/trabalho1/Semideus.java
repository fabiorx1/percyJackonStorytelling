package br.unifei.ecot02.trabalho1;
import java.util.List;
import java.util.ArrayList;
public abstract class Semideus extends Mortal implements Abencoavel{

	private Deidade deus;
	private List<Elemento> elementos = new ArrayList<Elemento>();
	
	public Semideus(Deidade deus, String nome, String descricao) {
		super(nome, descricao);
		System.out.println("[Filho(a) de %s]".formatted(deus.getNome()));
		this.deus = deus;
		for(Elemento elemento : deus.getElementos()) {
			elementos.add(new Elemento(elemento.getCodinome(), elemento.getDominio()/2, this));			
		}
	}
	
	public Semideus(Deidade deus) {
		super();
		this.deus = deus;
		System.out.println("[Filho(a) de %s]".formatted(deus.getNome()));
		for(Elemento elemento : deus.getElementos()) {
			elementos.add(new Elemento(elemento.getCodinome(), elemento.getDominio()/2, this));
		}
	}
	
	
	public Deidade getDeus() {
		return deus;
	}


	public List<Elemento> getElementos() {
		return elementos;
	}

	public void setElementos(List<Elemento> elementos) {
		this.elementos = elementos;
	}

	public Cacadora jurarArtemis() {
		return new Cacadora(this);
		
	}

}
