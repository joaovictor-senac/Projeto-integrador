package com.example.projeto.integrador.controllers;

import com.example.projeto.integrador.models.Agendamentos;
import com.example.projeto.integrador.service.AgendamentosServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "/agendamentos")
public class AgendamentosController {
  final AgendamentosServiceImpl agendamentosServiceImpl;

  public AgendamentosController(AgendamentosServiceImpl agendamentosServiceImpl) {
    this.agendamentosServiceImpl = agendamentosServiceImpl;
  }

  @PostMapping
  public ResponseEntity<Agendamentos> salvarCurso(@RequestBody Agendamentos agendamentos) {
    Agendamentos response = agendamentosServiceImpl.salvar(agendamentos);
    return ResponseEntity.status(HttpStatus.CREATED).body(response);
  }

  @DeleteMapping()
  public void deleteAgendamentos(Long id) {
    agendamentosServiceImpl.excluir(id);
  }

  @GetMapping
  public List<Agendamentos> buscarAgendamentos() {
    return agendamentosServiceImpl.listar();
  }

  @PutMapping
  public void atualizarAgendamentos(@RequestBody Agendamentos agendamentos) {
    agendamentosServiceImpl.editar(agendamentos);
  }

}
