package com.gerenciamentofrota.service;

import com.gerenciamentofrota.model.Modelo;
import com.gerenciamentofrota.repository.ModeloRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ModeloService extends DefaultService<Modelo, ModeloRepository> {
}
