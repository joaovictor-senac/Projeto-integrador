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

  @Column(name = "datainicio")
  private LocalDate horaLocal;

  @Column(name = "nomeAgendamentos")
  private String nomeAgendamentos;

  @Column(name = "laboratorio")

  @Transient
  private Laboratorio laboratorio;

  @Transient
  private Curso curso;

  @Transient
  private Integer numeroLaboratorio;

  @Column(name = "horaInicial")
  private String horaInicial;

  @Column(name = "horaFinal")
  private String horaFinal;

}
