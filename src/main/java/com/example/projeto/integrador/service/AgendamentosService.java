package com.example.projeto.integrador.service;

import com.example.projeto.integrador.models.Agendamentos;

import java.util.List;


public interface AgendamentosService {

  Agendamentos salvar(Agendamentos agendamentos) throws Exception;

  void excluir(Long id);

  Agendamentos editar(Agendamentos agendamentos);

  List <Agendamentos> listar();
}
