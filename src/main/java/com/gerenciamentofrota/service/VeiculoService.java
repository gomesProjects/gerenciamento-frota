package com.gerenciamentofrota.service;

import com.gerenciamentofrota.model.Veiculo;
import com.gerenciamentofrota.repository.VeiculoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class VeiculoService extends DefaultService<Veiculo, VeiculoRepository> {

    @Override
    public List<Veiculo> findByString(String search) {


        List<Veiculo> marca = getRepository().findByMarca(search);
        List<Veiculo> modelo = getRepository().findByModelo(search);

        if(marca != null) {
            return marca;
        } else {
            return modelo;
        }



        /*try {
            return getRepository().findByModelo(search);
        } catch (Exception e) {
            try {
                return getRepository().findByMarca(search);
            } catch (Exception e2) {
                e.printStackTrace();
            }
            return null;
        }*/
    }
}
