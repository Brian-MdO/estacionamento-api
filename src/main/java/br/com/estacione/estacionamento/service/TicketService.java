package br.com.estacione.estacionamento.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.estacione.estacionamento.domain.model.Ticket;
import br.com.estacione.estacionamento.domain.repository.TicketRepository;

@Service
public class TicketService {
	
	@Autowired
	public TicketRepository ticketRepository;

	public Ticket save(Ticket ticket) {
		return ticketRepository.save(ticket);
	}

}
