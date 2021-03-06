package com.example.projeto.integrador.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id_curso")
@Table(name = "curso")
public class Curso {

  @Id
  @Column(name = "id_curso")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "nome")
  private String nome;

  @Column(name = "quantidadeAlunos")
  private Integer quantidadeAlunos;

}
