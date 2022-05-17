package com.example.projeto.integrador.service;

import com.example.projeto.integrador.models.Curso;
import com.example.projeto.integrador.reporsitories.CursoReporsitoy;

import java.util.List;

public class CursoServiceImpl implements CursoService {

  final CursoReporsitoy cursoReporsitoy;

  public CursoServiceImpl(CursoReporsitoy cursoReporsitoy) {
    this.cursoReporsitoy = cursoReporsitoy;
  }

  @Override
  public Curso salvar(Curso curso) {
    return cursoReporsitoy.save(curso);
  }

  @Override
  public Curso editar(Curso curso) {
    return null;
  }

  @Override
  public Curso ExcluirCurso(Curso curso) {
    return null;
  }

  @Override
  public List <Curso> listar(Curso curso) {
    return cursoReporsitoy.findAll();
  }

}
