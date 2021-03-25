package com.gerenciamentofrota.controller;

import com.gerenciamentofrota.model.Veiculo;
import com.gerenciamentofrota.service.VeiculoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("veiculo")
public class VeiculoController extends DefaultController<Veiculo, VeiculoService> {
}
