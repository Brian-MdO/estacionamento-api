package br.com.estacione.estacionamento.api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.estacione.estacionamento.domain.model.Ticket;
import br.com.estacione.estacionamento.service.TicketService;

@RestController
public class TicketController {
	
	public TicketService ticketService;
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Ticket adicionar(@RequestBody Ticket ticket) {
		return ticketService.save(ticket);
		
	}

}