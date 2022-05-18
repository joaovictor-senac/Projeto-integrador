package com.example.projeto.integrador.controllers;

import com.example.projeto.integrador.models.Laboratorio;
import com.example.projeto.integrador.service.LaboratorioServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping (value = "/laboratorio")
public class  LaboratorarioController {
  final LaboratorioServiceImpl laboratorioService;

  public LaboratorarioController(LaboratorioServiceImpl laboratorioService) {
    this.laboratorioService = laboratorioService;
  }

  public ResponseEntity<Laboratorio> salvarCurso(@RequestBody Laboratorio laboratorio) {
    Laboratorio response = laboratorioService.salvar(laboratorio);
    return ResponseEntity.status(HttpStatus.CREATED).body(response);
  }

}
