package com.gerenciamentofrota.repository;

import com.gerenciamentofrota.model.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MarcaRepository extends JpaRepository<Veiculo, Long> {
}
