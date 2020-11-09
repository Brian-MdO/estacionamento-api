package br.com.estacione.estacionamento.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.estacione.estacionamento.domain.model.Veiculo;

@Repository
public interface VeiculoRepository extends JpaRepository<Veiculo, Long>{

}
