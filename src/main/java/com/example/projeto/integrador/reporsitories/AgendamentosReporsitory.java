package com.example.projeto.integrador.reporsitories;
import com.example.projeto.integrador.models.Agendamentos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgendamentosReporsitory extends JpaRepository<Agendamentos, Long> {
}
