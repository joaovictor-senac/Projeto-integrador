package com.example.projeto.integrador.service;

import com.example.projeto.integrador.models.Agendamentos;
import org.springframework.stereotype.Service;

import java.util.List;


public interface AgendamentosService {

  Agendamentos salvar(Agendamentos agendamentos);

  void excluir(Long id);

  Agendamentos editar(Agendamentos agendamentos);

  List <Agendamentos> listar();
}
