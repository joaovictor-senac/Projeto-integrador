package com.example.projeto.integrador.reporsitories;

import com.example.projeto.integrador.models.Laboratorio;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LaboratorioReporsitory extends JpaRepository<Laboratorio, Long> {
  List <Laboratorio> findLaboratorioByNome(String nome);
}
