package br.com.estacione.estacionamento.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.estacione.estacionamento.domain.model.Vaga;
import br.com.estacione.estacionamento.domain.repository.VagaRepository;
import br.com.estacione.estacionamento.service.VagaService;

@RestController
@RequestMapping("/vaga")
public class VagaController{
	
	@Autowired
	private VagaRepository vagaRepository;
	
	@Autowired
	private VagaService vagaService;
	
	@GetMapping
	public List<Vaga> listar() {
		return vagaRepository.findAll();
	}
	
	@GetMapping("/status/{vagaStatusVaga}")
	public ResponseEntity<Object[]> buscaStatus(@PathVariable String vagaStatusVaga) {
		List<Optional<Vaga>> vaga = vagaService.findByStatus(vagaStatusVaga);
		return ResponseEntity.ok(vaga.toArray());
//		if(vaga.isPresent()) {
//			return ResponseEntity.ok(vaga.get());
//			
//		}
//		
//		return ResponseEntity.notFound().build();
	}
	
	@GetMapping("/{vagaId}")
	public ResponseEntity<Vaga> busca(@PathVariable Long vagaId) {
		Optional<Vaga> vaga = vagaService.findById(vagaId);
		
		if(vaga.isPresent()) {
			return ResponseEntity.ok(vaga.get());
			
		}
		
		return ResponseEntity.notFound().build();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Vaga adicionar(@RequestBody Vaga vaga) {
		return vagaService.save(vaga);
		
	}
	
}