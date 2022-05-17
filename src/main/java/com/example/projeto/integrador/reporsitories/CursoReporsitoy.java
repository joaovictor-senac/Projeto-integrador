package com.example.projeto.integrador.reporsitories;

import com.example.projeto.integrador.models.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoReporsitoy extends JpaRepository<Curso, Long> {
}
