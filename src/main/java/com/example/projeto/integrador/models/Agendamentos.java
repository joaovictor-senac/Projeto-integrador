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
@EqualsAndHashCode(of = "id_agendamentos")
public class Agendamentos {

  @Id
  @Column(name = "id_agendamentos")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "dataInicio")
  private LocalDate horaLocal;

  @Column(name = "nomeAgendamentos")
  private String nomeAgendamentos;

  @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH, CascadeType.PERSIST}, fetch = FetchType.LAZY)
  @JoinTable(name = "agendamentos_instrutor",
          joinColumns = @JoinColumn(name = "id_instrutor"),
          inverseJoinColumns = @JoinColumn(name = "id_agendamentos"))
  private Instrutor instrutor;

  @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH, CascadeType.PERSIST}, fetch = FetchType.LAZY)
  @JoinTable(name = "agendamentos_laboratorio",
          joinColumns = @JoinColumn(name = "id_laboratorio"),
          inverseJoinColumns = @JoinColumn(name = "id_agendamentos"))
  private Laboratorio laboratorio;

  @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH, CascadeType.PERSIST}, fetch = FetchType.LAZY)
  @JoinTable(name = "agendamentos_curso",
          joinColumns = @JoinColumn(name = "id_curso"),
          inverseJoinColumns = @JoinColumn(name = "id_agendamentos"))
  private Curso curso;

  @Column(name = "numeroDoLaboratorio")
  private Integer numeroLaboratorio;

  @Column(name = "horaInicial")
  private String horaInicial;

  @Column(name = "horaFinal")
  private String horaFinal;

}
