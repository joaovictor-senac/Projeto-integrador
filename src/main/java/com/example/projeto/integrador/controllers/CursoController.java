package com.example.projeto.integrador.controllers;

import com.example.projeto.integrador.models.Curso;
import com.example.projeto.integrador.service.CursoServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/curso")
public class CursoController {

  final CursoServiceImpl cursoService;

  public CursoController(CursoServiceImpl cursoService) {
    this.cursoService = cursoService;
  }


  @PostMapping
  public ResponseEntity<Curso> salvarCurso(@RequestBody Curso curso) {
    Curso response = cursoService.salvar(curso);
    return ResponseEntity.status(HttpStatus.CREATED).body(response);
  }

}
