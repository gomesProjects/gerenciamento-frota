package com.gerenciamentofrota.controller;

import com.gerenciamentofrota.model.Veiculo;
import com.gerenciamentofrota.service.VeiculoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("veiculo")
public class VeiculoController extends DefaultController<Veiculo, VeiculoService> {
}
