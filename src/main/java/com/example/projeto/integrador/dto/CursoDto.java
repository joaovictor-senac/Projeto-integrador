package com.example.projeto.integrador.dto;

import com.example.projeto.integrador.models.Instrutor;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CursoDto {
  private String nome;
  Instrutor instrutor;
}
