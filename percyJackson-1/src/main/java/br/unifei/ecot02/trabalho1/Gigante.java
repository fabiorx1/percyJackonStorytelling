package br.unifei.ecot02.trabalho1;

import java.util.List;
import java.util.ArrayList;
public class Gigante extends Imortal {
	private List<Deidade> ancestrais = new ArrayList<Deidade>();
	public List<Deidade> getAncestrais() {
		return ancestrais;
	}
	public void setAncestrais(List<Deidade> ancestrais) {
		this.ancestrais = ancestrais;
	}
	public Gigante(List<Deidade> ancestrais) {
		this.setAncestrais(ancestrais);
	}
}
