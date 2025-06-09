package com.transporte.entities;

import java.time.LocalTime;
import java.util.Objects;

class Rota {
	private Long id;
	private String nome;
	private String turno;
	private LocalTime horarioInicio;
	private LocalTime horarioFim;
	private Motorista motorista;

	public Rota() {
	}

	public Rota(Long id, String nome, String turno, LocalTime horarioInicio, LocalTime horarioFim,
			Motorista motorista) {
		this.id = id;
		this.nome = nome;
		this.turno = turno;
		this.horarioInicio = horarioInicio;
		this.horarioFim = horarioFim;
		this.motorista = motorista;
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

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public LocalTime getHorarioInicio() {
		return horarioInicio;
	}

	public void setHorarioInicio(LocalTime horarioInicio) {
		this.horarioInicio = horarioInicio;
	}

	public LocalTime getHorarioFim() {
		return horarioFim;
	}

	public void setHorarioFim(LocalTime horarioFim) {
		this.horarioFim = horarioFim;
	}

	public Motorista getMotorista() {
		return motorista;
	}

	public void setMotorista(Motorista motorista) {
		this.motorista = motorista;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Rota rota = (Rota) o;
		return Objects.equals(id, rota.id);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
}
