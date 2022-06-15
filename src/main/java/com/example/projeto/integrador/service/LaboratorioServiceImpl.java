package com.example.projeto.integrador.service;

import com.example.projeto.integrador.models.Laboratorio;
import com.example.projeto.integrador.reporsitories.LaboratorioReporsitory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LaboratorioServiceImpl implements LaboratorioService {

  final LaboratorioReporsitory laboratorioReporsitory;

  public LaboratorioServiceImpl(LaboratorioReporsitory laboratorioReporsitory) {
    this.laboratorioReporsitory = laboratorioReporsitory;
  }


  @Override
  public Laboratorio salvar(Laboratorio laboratorio) throws Exception {
    List <Laboratorio> nome = laboratorioReporsitory.findLaboratorioByNome(laboratorio.getNome());
    if (nome != null && nome.size() > 0 ) {
      throw new Exception("ja foi cadatrado o laboratorio");
    }
    return laboratorioReporsitory.save(laboratorio);
  }

  @Override
  public Laboratorio editar(Laboratorio laboratorio) {
    return laboratorioReporsitory.save(laboratorio);
  }

  @Override
  public void delete(Long id) {
    laboratorioReporsitory.deleteById(id);
  }

  @Override
  public List<Laboratorio> listar() {
    return laboratorioReporsitory.findAll();
  }
}
