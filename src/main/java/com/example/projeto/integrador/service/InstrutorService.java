package com.example.projeto.integrador.service;

import com.example.projeto.integrador.models.Instrutor;
import com.example.projeto.integrador.reporsitories.InstrutorReporsitory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface InstrutorService {
  Instrutor Salvar(Instrutor instrutor);

  Instrutor Editar(Instrutor instrutor);

  Instrutor Excluir(Instrutor instrutor);

  List <Instrutor> Listar();

}
