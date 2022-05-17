package com.example.projeto.integrador.controllers;

import com.example.projeto.integrador.models.Agendamentos;
import com.example.projeto.integrador.service.AgendamentosServiceImpl;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Service
@RestController
@RequestMapping(value = "/agendamentos")
public class AgendamentosController {

  final AgendamentosServiceImpl agendamentosServices;

  public AgendamentosController(AgendamentosServiceImpl agendamentosServices) {
    this.agendamentosServices = agendamentosServices;
  }


  @PostMapping
  public ResponseEntity<Object> salvarAgendamentos(@RequestBody Agendamentos agendametos){
    Agendamentos response = agendamentosServices.Salvar(agendametos);
    return ResponseEntity.status(HttpStatus.CREATED).body(response);
  }
}
