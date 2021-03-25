package com.gerenciamentofrota.controller;

import com.gerenciamentofrota.model.Marca;
import com.gerenciamentofrota.service.MarcaService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("veiculo")
public class MarcaController extends DefaultController<Marca, MarcaService> {
}
