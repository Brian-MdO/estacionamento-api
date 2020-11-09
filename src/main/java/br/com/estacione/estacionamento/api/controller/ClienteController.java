package br.com.estacione.estacionamento.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.estacione.estacionamento.domain.model.Cliente;
import br.com.estacione.estacionamento.service.ClienteService;

@RestController
@RequestMapping("/login")
public class ClienteController {
	
	@Autowired
	private ClienteService clienteService;
	
	@GetMapping
	public List<Cliente> listar() {
		return clienteService.findAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Cliente adicionar(@RequestBody Cliente cliente) {
		return clienteService.save(cliente);
		
	}
	
}