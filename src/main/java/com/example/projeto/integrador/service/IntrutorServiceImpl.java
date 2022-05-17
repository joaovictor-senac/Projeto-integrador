package com.example.projeto.integrador.service;

import com.example.projeto.integrador.models.Instrutor;
import com.example.projeto.integrador.reporsitories.InstrutorReporsitory;

import java.util.List;

public class IntrutorServiceImpl implements InstrutorService {

  final InstrutorReporsitory instrutorReporsitory;

  public IntrutorServiceImpl(InstrutorReporsitory instrutorReporsitory) {
    this.instrutorReporsitory = instrutorReporsitory;
  }

  @Override
  public Instrutor Salvar(Instrutor instrutor) {
    return instrutorReporsitory.save(instrutor);
  }

  @Override
  public Instrutor Editar(Instrutor instrutor) {
    return null;
  }

  @Override
  public Instrutor Excluir(Instrutor instrutor) {
    return null;
  }

  @Override
  public List<Instrutor> Listar() {
    return instrutorReporsitory.findAll();
  }
}
