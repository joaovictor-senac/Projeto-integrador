package com.example.projeto.integrador.service;

import com.example.projeto.integrador.models.Instrutor;
import com.example.projeto.integrador.reporsitories.InstrutorReporsitory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IntrutorServiceImpl implements InstrutorService {

  final InstrutorReporsitory instrutorReporsitory;

  public IntrutorServiceImpl(InstrutorReporsitory instrutorReporsitory) {
    this.instrutorReporsitory = instrutorReporsitory;
  }

  @Override
  public Instrutor salvar(Instrutor instrutor) {
    return instrutorReporsitory.save(instrutor);
  }

  @Override
  public Instrutor editar(Instrutor instrutor) {
    return null;
  }

  @Override
  public Instrutor excluir(Instrutor instrutor) {
    return null;
  }

  @Override
  public List<Instrutor> listar(Instrutor instrutor) {
    return instrutorReporsitory.findAll();
  }
}
