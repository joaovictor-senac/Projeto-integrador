package com.example.projeto.integrador.service;

import com.example.projeto.integrador.models.Laboratorio;

import java.util.List;

public interface LaboratorioService {

  Laboratorio salvar(Laboratorio laboratorio);

  Laboratorio  editar(Laboratorio laboratorio);

  void delete(Long id);

  List<Laboratorio> listar();
}
