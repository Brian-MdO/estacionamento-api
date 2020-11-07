package br.com.estacione.estacionamento.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.estacione.estacionamento.domain.model.Cliente;
import br.com.estacione.estacionamento.domain.repository.ClienteRepository;

@RestController
public class ClienteController {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@GetMapping("/cliente")
	public List<Cliente> listar() {
		return clienteRepository.findAll();
	}
	
}