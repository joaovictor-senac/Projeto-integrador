package com.example.projeto.integrador.service;

import com.example.projeto.integrador.models.Laboratorio;
import com.example.projeto.integrador.reporsitories.LaboratorioReporsitory;

import java.util.List;

public class LaboratorioServiceImpl implements LaboratorioService {

  final LaboratorioReporsitory laboratorioReporsitory;

  public LaboratorioServiceImpl(LaboratorioReporsitory laboratorioReporsitory) {
    this.laboratorioReporsitory = laboratorioReporsitory;
  }


  @Override
  public Laboratorio Salvar(Laboratorio laboratorio) {
    return laboratorioReporsitory.save(laboratorio);
  }

  @Override
  public Laboratorio Editar(Laboratorio laboratorio) {
    return null;
  }

  @Override
  public Laboratorio Excluir(Laboratorio laboratorio) {
    return null;
  }

  @Override
  public List<Laboratorio> Listar() {
    return laboratorioReporsitory.findAll();
  }
}
