package com.gerenciamentofrota.service;

import com.gerenciamentofrota.model.Veiculo;
import com.gerenciamentofrota.repository.VeiculoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class VeiculoService extends DefaultService<Veiculo, VeiculoRepository> {

    public List<Veiculo> findByModelo(String modelo) throws Exception{
        return getRepository().findByModelo(modelo);
    }

    public List<Veiculo> findByMarca(String marca) throws Exception{
        return getRepository().findByMarca(marca);
    }
}
