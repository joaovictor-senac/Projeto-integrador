package com.example.projeto.integrador.service;

import com.example.projeto.integrador.models.Instrutor;
import com.example.projeto.integrador.reporsitories.InstrutorReporsitory;
import org.springframework.stereotype.Service;

import java.util.List;


public interface InstrutorService {
  Instrutor salvar(Instrutor instrutor);

  Instrutor editar(Instrutor instrutor);

  Instrutor excluir(Instrutor instrutor);

  List <Instrutor> listar(Instrutor instrutor);

}
