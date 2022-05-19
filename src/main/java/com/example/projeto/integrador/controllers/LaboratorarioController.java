package com.example.projeto.integrador.controllers;

import com.example.projeto.integrador.models.Curso;
import com.example.projeto.integrador.models.Laboratorio;
import com.example.projeto.integrador.service.LaboratorioServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

  @DeleteMapping()
  public void deletaCurso(Long id){
    laboratorioService.delete(id);
  }

  @GetMapping
  public List<Laboratorio> buscarLasboratorio() {
    return laboratorioService.listar();
  }

  @PutMapping
  public void atualizarCurso(@RequestBody Laboratorio laboratorio) {
    laboratorioService.editar(laboratorio);
  }

}
