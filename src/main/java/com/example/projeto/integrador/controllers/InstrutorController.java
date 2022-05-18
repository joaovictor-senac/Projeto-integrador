package com.example.projeto.integrador.controllers;

import com.example.projeto.integrador.models.Instrutor;
import com.example.projeto.integrador.service.IntrutorServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/instrutor")
public class InstrutorController {
  final IntrutorServiceImpl intrutorService;

  public InstrutorController(IntrutorServiceImpl intrutorService) {
    this.intrutorService = intrutorService;
  }

  @PostMapping
  public ResponseEntity<Instrutor> salvarCurso(@RequestBody Instrutor Instrutor) {
    Instrutor response = intrutorService.salvar(Instrutor);
    return ResponseEntity.status(HttpStatus.CREATED).body(response);
  }
}
