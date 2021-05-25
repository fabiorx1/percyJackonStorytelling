package br.unifei.ecot02.trabalho1;

import java.util.List;
import java.util.ArrayList;
public class Profecia {
	private Ser intermediario;
	private String poema;
	private List<Ser> envolvidos = new ArrayList<Ser>();
	
	public Profecia(Ser intermediario){
		this.intermediario = intermediario;
	}	
	
	public Ser getIntermediario() {
		return intermediario;
	}

	public void setIntermediario(Ser intermediario) {
		this.intermediario = intermediario;
	}

	public String getPoema() {
		return poema;
	}
	public void setPoema(String poema) {
		this.poema = poema;
	}
	public List<Ser> getEnvolvidos() {
		return envolvidos;
	}
	public void setEnvolvidos(List<Ser> envolvidos) {
		this.envolvidos = envolvidos;
	}
	

}
