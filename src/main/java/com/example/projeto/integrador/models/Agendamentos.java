package com.example.projeto.integrador.models;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import  java.time.LocalDate;

@Entity
@Data
@Table(name = "agendamentos")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Agendamentos {

  @Id
  @Column(name = "id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "dataInicio")
  private LocalDate horaLocal;

  @Column(name = "nomeAgendamentos")
  private String nomeAgendamentos;

  @Transient
  private Laboratorio laboratorio;

  @Transient
  private Curso curso;

  @Column(name = "numeroDoLaboratorio")
  private Integer numeroLaboratorio;

  @Column(name = "horaInicial")
  private String horaInicial;

  @Column(name = "horaFinal")
  private String horaFinal;

}
