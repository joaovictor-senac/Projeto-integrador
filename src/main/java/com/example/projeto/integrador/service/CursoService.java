package com.example.projeto.integrador.service;

import com.example.projeto.integrador.models.Curso;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CursoService {
  Curso salvar(Curso curso);

  Curso editar(Curso curso);

  Curso ExcluirCurso(Curso curso);

  List <Curso> listar(Curso curso);
}
