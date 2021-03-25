package com.gerenciamentofrota.repository;

import com.gerenciamentofrota.model.Modelo;
import com.gerenciamentofrota.model.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModeloRepository extends JpaRepository<Modelo, Long> {
}
