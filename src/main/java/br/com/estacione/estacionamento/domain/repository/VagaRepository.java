package br.com.estacione.estacionamento.domain.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.estacione.estacionamento.domain.model.TipoDeStatus;
import br.com.estacione.estacionamento.domain.model.Vaga;

@Repository
public interface VagaRepository extends JpaRepository<Vaga, Long>{
	
	List<Vaga> findByNome(String nome);
	
	@Query("Select v from Vaga v where v.statusVaga=:vagaStatusVaga")
	List<Optional<Vaga>> findByStatus(TipoDeStatus vagaStatusVaga);

}