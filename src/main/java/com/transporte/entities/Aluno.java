package com.transporte.entities;

import java.util.Objects;

public class Aluno {
	private Long id;
	private String nome;
	private int idade;
	private String endereco;
	private Responsavel responsavel;

	public Aluno() {
	}

	public Aluno(Long id, String nome, int idade, String endereco, Responsavel responsavel) {
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.endereco = endereco;
		this.responsavel = responsavel;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Responsavel getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(Responsavel responsavel) {
		this.responsavel = responsavel;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Aluno aluno = (Aluno) o;
		return Objects.equals(id, aluno.id);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
}
