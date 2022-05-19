package com.example.projeto.integrador.service;

import com.example.projeto.integrador.models.Curso;
import com.example.projeto.integrador.reporsitories.CursoReporsitoy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
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
    return cursoReporsitoy.save(curso);
  }

  @Override
   public void delete(Long id) {
    cursoReporsitoy.deleteById(id);
  }

  @Override
  public List <Curso> listar() {
    return cursoReporsitoy.findAll();
  }

}
