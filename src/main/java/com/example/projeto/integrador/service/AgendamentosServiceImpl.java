package com.example.projeto.integrador.service;

import com.example.projeto.integrador.models.Agendamentos;
import com.example.projeto.integrador.models.Curso;
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
  public Agendamentos salvar(Agendamentos agendamentos) throws Exception {
    String horaInicio[] = agendamentos.getHoraInicial().split("");
    String horaFinal[] = agendamentos.getHoraFinal().split("");

    Integer tempoInicio = Integer.parseInt(horaInicio[0]);
    Integer tempoFinal = Integer.parseInt(horaFinal[0]);

    if (agendamentos.getDataFim().isBefore(agendamentos.getDataInicial())) {
      throw new Exception("Não é possivel cadastrar nessa data, já foi preenchida");
    }
    if (tempoFinal < tempoInicio) {
      throw new Exception("já deve estar acontencendo um curso nesse horario");
    }
    if (agendamentos.getDataFim().equals(agendamentos.getHoraInicial())) {
      throw new Exception("Já foi foi cadastrado nesse horario");
    }

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
