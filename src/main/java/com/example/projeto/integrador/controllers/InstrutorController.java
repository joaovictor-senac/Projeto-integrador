package com.example.projeto.integrador.controllers;

import com.example.projeto.integrador.models.Curso;
import com.example.projeto.integrador.models.Instrutor;
import com.example.projeto.integrador.service.IntrutorServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/instrutor")
public class InstrutorController {
  final IntrutorServiceImpl intrutorService;

  public InstrutorController(IntrutorServiceImpl intrutorService) {
    this.intrutorService = intrutorService;
  }

  @PostMapping
  public ResponseEntity<Object> salvarCurso(@RequestBody Instrutor Instrutor) throws Exception {
    Instrutor response = intrutorService.salvar(Instrutor);
    return ResponseEntity.status(HttpStatus.CREATED).body(response);
  }

  @DeleteMapping()
  public void deletaInstrutor(Long id){
    intrutorService.delete(id);
  }

  @GetMapping
  public ResponseEntity<Object> BuscarCurso() {
    List <Instrutor> response = intrutorService.listar();
    return ResponseEntity.status(HttpStatus.CREATED).body(response);
  }

  @PutMapping
  public void atualizarCurso(@RequestBody Instrutor instrutor) {
    intrutorService.editar(instrutor);
  }
}
