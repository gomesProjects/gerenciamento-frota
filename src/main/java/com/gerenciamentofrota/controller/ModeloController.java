package com.gerenciamentofrota.controller;

import com.gerenciamentofrota.model.Modelo;
import com.gerenciamentofrota.service.ModeloService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("modelo")
public class ModeloController extends DefaultController<Modelo, ModeloService> {
}
