package com.example.projeto.integrador.dto;

import com.example.projeto.integrador.models.Curso;
import com.example.projeto.integrador.models.Laboratorio;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AgendamentoDto {
  private LocalDate horaLocal;
  private String nomeAgendamentos;
  private Laboratorio laboratorio;
  private Curso curso;
  private Integer numeroLaboratorio;
  private String horaInicial;
  private String horaFinal;

}