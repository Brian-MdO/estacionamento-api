package br.com.estacione.estacionamento.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.estacione.estacionamento.domain.model.Cliente;
import br.com.estacione.estacionamento.domain.repository.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository clienteRepository;

	public Cliente save(Cliente cliente) {
		return clienteRepository.save(cliente);
	}

	public List<Cliente> findAll() {
		return clienteRepository.findAll();
	}

}
