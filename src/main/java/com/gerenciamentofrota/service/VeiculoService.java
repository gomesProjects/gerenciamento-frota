package com.gerenciamentofrota.service;

import com.gerenciamentofrota.model.Veiculo;
import com.gerenciamentofrota.repository.VeiculoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
@RequiredArgsConstructor
public class VeiculoService extends DefaultService<Veiculo, VeiculoRepository> {

    @Override
    public List<Veiculo> findByString(String search) {
        List<Veiculo> veiculos = getRepository().findByMarca(search);

        if (veiculos.isEmpty()) {
            veiculos.addAll(getRepository().findByModelo(search));
        }

        return veiculos;
    }
}
