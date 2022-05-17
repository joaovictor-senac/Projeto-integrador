package com.example.projeto.integrador.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LaboratorioDto {
  private String quantidadde;
  private String nome;
  private Boolean status;
}
