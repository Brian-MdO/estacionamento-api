package br.com.estacione.estacionamento.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.estacione.estacionamento.domain.model.TipoDeStatus;
import br.com.estacione.estacionamento.domain.model.Vaga;
import br.com.estacione.estacionamento.domain.repository.VagaRepository;

@Service
public class VagaService {
	
	@Autowired
	private VagaRepository vagaRepository;

	public List<Optional<Vaga>> findByStatus(String vagaStatus) {
		
		if (vagaStatus.equalsIgnoreCase(TipoDeStatus.OCUPADO.toString())) {
			return vagaRepository.findByStatus(TipoDeStatus.OCUPADO);
		}
		return vagaRepository.findByStatus(TipoDeStatus.DESOCUPADO);
	
	}

	public Vaga save(Vaga vaga) {
		return vagaRepository.save(vaga);
	}

	public Optional<Vaga> findById(Long vagaId) {
		return vagaRepository.findById(vagaId);
	}

}
