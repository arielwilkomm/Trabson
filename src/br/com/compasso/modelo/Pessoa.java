package br.com.compasso.modelo;

import java.util.Date;

public class Pessoa {

	private String id;
	private String nome;
	private String cpf;
	private String rg;
	private String genero;
	private Date nascimento;

	public Pessoa() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pessoa(String id, String nome, String cpf, String rg, String genero, Date nascimento) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.genero = genero;
		this.nascimento = nascimento;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Date getNascimento() {
		return nascimento;
	}

	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}

}
