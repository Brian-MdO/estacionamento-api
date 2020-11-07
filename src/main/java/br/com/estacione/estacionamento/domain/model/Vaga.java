package br.com.estacione.estacionamento.domain.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Vaga {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Enumerated(EnumType.STRING)
	private TipoDeStatus statusVaga;

	private String nome;
	private BigDecimal valorHoraVaga;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public TipoDeStatus getStatusVaga() {
		return statusVaga;
	}

	public void setStatusVaga(TipoDeStatus statusVaga) {
		this.statusVaga = statusVaga;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getValorHoraVaga() {
		return valorHoraVaga;
	}

	public void setValorHoraVaga(BigDecimal valorHoraVaga) {
		this.valorHoraVaga = valorHoraVaga;
	}

}