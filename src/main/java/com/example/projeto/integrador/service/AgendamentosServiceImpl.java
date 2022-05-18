package com.example.projeto.integrador.service;

import com.example.projeto.integrador.models.Agendamentos;
import com.example.projeto.integrador.reporsitories.AgendamentosReporsitory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgendamentosServiceImpl implements AgendamentosService {

  final AgendamentosReporsitory agendamentosReporsitory;

  public AgendamentosServiceImpl(AgendamentosReporsitory agendamentosReporsitory) {
    this.agendamentosReporsitory = agendamentosReporsitory;
  }


  @Override
  public Agendamentos salvar(Agendamentos agendamentos) {
    return agendamentosReporsitory.save(agendamentos);
  }

  @Override
  public void excluir(Long id) {
    agendamentosReporsitory.deleteById(id);
  }

  @Override
  public Agendamentos editar(Agendamentos agendamentos) {
    return agendamentosReporsitory.save(agendamentos);
  }

  @Override
  public List <Agendamentos> listar() {
    return agendamentosReporsitory.findAll();
  }



}
