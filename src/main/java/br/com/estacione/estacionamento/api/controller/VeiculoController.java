package br.com.estacione.estacionamento.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.estacione.estacionamento.domain.model.Veiculo;
import br.com.estacione.estacionamento.service.VeiculoService;

@RestController
@RequestMapping("/veiculo")
public class VeiculoController {
	
	@Autowired
	public VeiculoService veiculoService;
	
	@GetMapping
	public List<Veiculo> listar() {
		return veiculoService.findAll();
	}

}
