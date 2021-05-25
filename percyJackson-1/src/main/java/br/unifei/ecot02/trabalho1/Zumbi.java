package br.unifei.ecot02.trabalho1;
import java.util.Date;
public class Zumbi extends Mortal {
	
	private Date morte;
	private Mortal mortal;
	private boolean isRessuscitado;
	private Elemento invocador;
	
	public Zumbi(Mortal mortal, Date morte) {
		this.mortal = mortal;
		this.morte = morte;
		System.out.println("%s agora e um Zumbi".formatted(mortal.getNome()));
	}
	
	public boolean isRessuscitado() {
		return isRessuscitado;
	}
	public void setRessuscitado(boolean isRessuscitado) {
		this.isRessuscitado = isRessuscitado;
	}
	
	public void ressuscitar() {
		this.setRessuscitado(true);
		System.out.println("%s foi ressuscitado".formatted(mortal.getNome()));
	}
	
	
	public Mortal getMortal() {
		return mortal;
	}

	public void setMortal(Mortal mortal) {
		this.mortal = mortal;
	}


	public Date getMorte() {
		return morte;
	}

	public void setMorte(Date morte) {
		this.morte = morte;
	}
	public Elemento getInvocador() {
		return invocador;
	}
	public void setInvocador(Elemento invocador) {
		this.invocador = invocador;
	}
	
}
