package com.example.projeto.integrador.service;

import com.example.projeto.integrador.models.Instrutor;

import java.util.List;


public interface InstrutorService {
  Instrutor salvar(Instrutor instrutor);

  Instrutor editar(Instrutor instrutor);

  void delete(Long id);

  List <Instrutor> listar();

}
