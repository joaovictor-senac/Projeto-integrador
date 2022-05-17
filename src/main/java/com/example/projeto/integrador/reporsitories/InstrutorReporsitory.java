package com.example.projeto.integrador.reporsitories;

import com.example.projeto.integrador.models.Instrutor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstrutorReporsitory extends JpaRepository<Instrutor, Long> {
}
