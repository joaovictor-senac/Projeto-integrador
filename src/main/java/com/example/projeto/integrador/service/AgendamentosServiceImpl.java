package com.example.projeto.integrador.service;

import com.example.projeto.integrador.models.Agendamentos;
import com.example.projeto.integrador.reporsitories.AgendamentosReporsitory;

import java.util.List;

public class AgendamentosServiceImpl implements AgendamentosService {

  final AgendamentosReporsitory agendamentosReporsitory;

  public AgendamentosServiceImpl(AgendamentosReporsitory agendamentosReporsitory) {
    this.agendamentosReporsitory = agendamentosReporsitory;
  }


  @Override
  public Agendamentos Salvar(Agendamentos agendamentos) {
    return agendamentosReporsitory.save(agendamentos);
  }

  @Override
  public Agendamentos Excluir(Agendamentos agendamentos) {
    return null;
  }

  @Override
  public Agendamentos Editar(Agendamentos agendamentos) {
    return null;
  }

  @Override
  public List <Agendamentos> Listar() {
    return agendamentosReporsitory.findAll();
  }
}
