package br.unifei.ecot02.trabalho1;
import java.util.Date;
public class Elemento {
	private String codinome;
	private int dominio;
	private Ser dominador;
	
	public Elemento() {}
	
	public static Elemento nevoa(int dom, Ser ser){
		return new Elemento("Nevoa", dom, ser);
	}
	
	public static Elemento agua(int dom, Ser ser){
		return new Elemento("Agua", dom, ser);
	}
	
	public static Elemento morte(int dom, Ser ser){
		return new Elemento("Morte", dom, ser);
	}
	
	public static Elemento natureza(int dom, Ser ser){
		return new Elemento("Natureza", dom, ser);
	}
	
	public static Elemento adivinhacao(int dom, Ser ser){
		return new Elemento("Adivinhacao", dom, ser);
	}
	
	public static Elemento eloquencia(int dom, Ser ser){
		return new Elemento("Eloquencia", dom, ser);
	}
	
	public static Elemento atletismo(int dom, Ser ser){
		return new Elemento("Atletismo", dom, ser);
	}
	
	public static Elemento raio(int dom, Ser ser){
		return new Elemento("Raio", dom, ser);
	}
	
	public static Elemento estrategia(int dom, Ser ser){
		return new Elemento("Estrategia", dom, ser);
	}
	
	public static Elemento forca(int dom, Ser ser){
		return new Elemento("Forca", dom, ser);
	}
	
	public Elemento(String codinome, int dominio, Ser dominador) {
		super();
		this.codinome = codinome;
		this.dominio = dominio;
		this.dominador = dominador;
		System.out.println("%s domina o(a) %s em %d".formatted(dominador.getNome(), codinome, dominio));
	}

	protected void usar(Object alvo, Date data) {
		if(alvo.getClass() == Imortal.class && this.dominio >85) {
			((Imortal) alvo).morrerEmBatalha();			
		}
		else if(alvo.getClass() == Mortal.class && this.dominio >75) {
			((Mortal) alvo).morrer(data);			
		}
		if(alvo.getClass()==Zumbi.class && this.codinome == "Morte" && this.dominio>70)
		{
			((Zumbi) alvo).ressuscitar();
		}
		this.dominio+=2;
	}
	protected void treinar() {
		this.dominio+=1;
		System.out.println("%s treinou e agora domina %s em %d".formatted(dominador.getNome(), this.getCodinome(), this.getDominio()));
	}
	
	public Ser getDominador() {
		return dominador;
	}
	public void setDominador(Ser dominador) {
		this.dominador = dominador;
	}
	
	public String getCodinome() {
		return codinome;
	}
	public void setCodinome(String codinome) {
		this.codinome = codinome;
	}
	public int getDominio() {
		return dominio;
	}
	public void setDominio(int dominio) {
		this.dominio = dominio;
	}
	
}
