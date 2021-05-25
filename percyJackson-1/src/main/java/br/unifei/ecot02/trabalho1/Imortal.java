package br.unifei.ecot02.trabalho1;

import java.util.List;
import java.util.ArrayList;
public abstract class Imortal extends Ser {
	
	private List<Elemento> elementos = new ArrayList<Elemento>(); 
	public Imortal() {
		
	}
	
	public Imortal(String nome, String descricao) {
		super(nome, descricao);
	}
	
	public void morrerEmBatalha() {
		
	}
	public List<Elemento> getElementos() {
		return elementos;
	}
	public void setElementos(List<Elemento> elementos) {
		this.elementos = elementos;
	}
}
