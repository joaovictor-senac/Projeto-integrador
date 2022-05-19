package com.example.projeto.integrador.controllers;

import com.example.projeto.integrador.models.Curso;
import com.example.projeto.integrador.service.CursoServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/curso")
public class CursoController {

  final CursoServiceImpl cursoServiceImpl;

  public CursoController(CursoServiceImpl cursoServiceImpl) {
    this.cursoServiceImpl = cursoServiceImpl;
  }


  @PostMapping
  public ResponseEntity<Curso> salvarCurso(@RequestBody Curso curso) {
    Curso response = cursoServiceImpl.salvar(curso);
    return ResponseEntity.status(HttpStatus.CREATED).body(response);
  }

  @DeleteMapping()
  public void deletaCurso(Long id){
    cursoServiceImpl.delete(id);
  }

  @GetMapping
  public List<Curso> BuscarCurso() {
    return cursoServiceImpl.listar();
  }

  @PutMapping
  public void atualizarCurso(@RequestBody Curso curso) {
    cursoServiceImpl.editar(curso);
  }

}
