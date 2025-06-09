package com.transporte.entities;

import java.time.LocalDate;
import java.util.Objects;

class PresencaAluno {
	private Long id;
	private LocalDate data;
	private boolean presente;
	private Aluno aluno;
	private Rota rota;

	public PresencaAluno() {
	}

	public PresencaAluno(Long id, LocalDate data, boolean presente, Aluno aluno, Rota rota) {
		this.id = id;
		this.data = data;
		this.presente = presente;
		this.aluno = aluno;
		this.rota = rota;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public boolean isPresente() {
		return presente;
	}

	public void setPresente(boolean presente) {
		this.presente = presente;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Rota getRota() {
		return rota;
	}

	public void setRota(Rota rota) {
		this.rota = rota;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		PresencaAluno that = (PresencaAluno) o;
		return Objects.equals(id, that.id);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
}