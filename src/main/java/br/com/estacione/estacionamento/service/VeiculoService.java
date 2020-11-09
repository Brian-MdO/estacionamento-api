package br.com.estacione.estacionamento.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.estacione.estacionamento.domain.model.Veiculo;
import br.com.estacione.estacionamento.domain.repository.VeiculoRepository;

@Service
public class VeiculoService {
	
	@Autowired
	public VeiculoRepository veiculoRepository;

	public List<Veiculo> findAll() {
		return veiculoRepository.findAll();
	}
}
