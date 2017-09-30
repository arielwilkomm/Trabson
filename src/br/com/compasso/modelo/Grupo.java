package br.com.compasso.modelo;

import java.util.List;

public class Grupo {

	private String id;
	private String nome;
	private List<Pessoa> pessoa;

	public Grupo(String id, String nome, List<Pessoa> pessoa) {
		super();
		this.id = id;
		this.nome = nome;
		this.pessoa = pessoa;
	}

	public Grupo() {
		super();
		// TODO Auto-generated constructor stub
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

	public List<Pessoa> getPessoa() {
		return pessoa;
	}

	public void setPessoa(List<Pessoa> pessoa) {
		this.pessoa = pessoa;
	}

}
