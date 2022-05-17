package com.example.projeto.integrador.service;

import com.example.projeto.integrador.models.Laboratorio;

import java.util.List;

public interface LaboratorioService {

  Laboratorio Salvar(Laboratorio laboratorio);

  Laboratorio  Editar(Laboratorio laboratorio);

  Laboratorio Excluir(Laboratorio laboratorio);

  List<Laboratorio> Listar();
}
