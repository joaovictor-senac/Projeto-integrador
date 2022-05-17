package com.example.projeto.integrador.service;

import com.example.projeto.integrador.models.Agendamentos;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AgendamentosService {

  Agendamentos Salvar(Agendamentos agendamentos);

  Agendamentos Excluir(Agendamentos agendamentos);

  Agendamentos Editar(Agendamentos agendamentos);

  List <Agendamentos> Listar();
}
