package com.gerenciamentofrota.service;

import com.gerenciamentofrota.model.Marca;
import com.gerenciamentofrota.repository.MarcaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MarcaService extends DefaultService<Marca, MarcaRepository> {
}
