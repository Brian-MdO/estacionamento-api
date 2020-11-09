package br.com.estacione.estacionamento.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.estacione.estacionamento.domain.model.Ticket;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long>{

}
