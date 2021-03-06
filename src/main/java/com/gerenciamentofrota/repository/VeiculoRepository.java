package com.gerenciamentofrota.repository;

import com.gerenciamentofrota.model.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface VeiculoRepository extends JpaRepository<Veiculo, Long> {

    @Query(value = "select * from veiculo left join modelo " +
            "on modelo.id = veiculo.modelo_id " +
            "where modelo.nome = ?1", nativeQuery = true)
    List<Veiculo> findByModelo(String modelo);

    @Query(value = "select * from veiculo left join marca " +
            "on marca.id = veiculo.marca_id " +
            "where marca.nome = ?1", nativeQuery = true)
    List<Veiculo> findByMarca(String marca);
}
