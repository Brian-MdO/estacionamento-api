package br.com.estacione.estacionamento.domain.model;

import java.math.BigDecimal;
import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Ticket {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Enumerated(EnumType.STRING)
	private TipoDeStatus status_ticket;

	private BigDecimal valor_total;
	private Calendar hora_entrada;
	private Calendar hora_saida;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public TipoDeStatus getStatus_vaga() {
		return status_ticket;
	}

	public void setStatus_vaga(TipoDeStatus status_vaga) {
		this.status_ticket = status_vaga;
	}

	public BigDecimal getValor_total() {
		return valor_total;
	}

	public void setValor_total(BigDecimal valor_total) {
		this.valor_total = valor_total;
	}

	public Calendar getHora_entrada() {
		return hora_entrada;
	}

	public void setHora_entrada(Calendar hora_entrada) {
		this.hora_entrada = hora_entrada;
	}

	public Calendar getHora_saida() {
		return hora_saida;
	}

	public void setHora_saida(Calendar hora_saida) {
		this.hora_saida = hora_saida;
	}

}
