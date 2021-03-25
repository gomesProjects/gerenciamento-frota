package com.gerenciamentofrota.service;

import com.gerenciamentofrota.model.Veiculo;
import com.gerenciamentofrota.repository.VeiculoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MarcaService extends DefaultService<Veiculo, VeiculoRepository> {
}
