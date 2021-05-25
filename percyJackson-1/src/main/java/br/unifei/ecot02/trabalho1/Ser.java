package br.unifei.ecot02.trabalho1;

import java.util.Date;

public abstract class Ser{
	private String nome;
	private String descricao;
	private Date nascimento;
	private boolean isOraculo;
	
	public Ser(String nome, String descricao) {
		super();
		this.nome = nome;
		this.descricao = descricao;
		System.out.println("[%s] %s, %s foi adicionado a historia.".formatted(this.getClass(), nome, descricao));
	}

	public Ser() {
		this.setIsOraculo(true);
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getNascimento() {
		return nascimento;
	}

	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}

	public boolean GetIsOraculo() {
		return isOraculo;
	}

	public void setIsOraculo(boolean isOraculo) {
		this.isOraculo = isOraculo;
	}

}
