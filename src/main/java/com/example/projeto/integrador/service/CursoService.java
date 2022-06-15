package com.example.projeto.integrador.service;

import com.example.projeto.integrador.models.Curso;

import java.util.List;


public interface CursoService {
  Curso salvar(Curso curso) throws Exception;

  Curso editar(Curso curso);

  void delete(Long id);

  List <Curso> listar();
}
