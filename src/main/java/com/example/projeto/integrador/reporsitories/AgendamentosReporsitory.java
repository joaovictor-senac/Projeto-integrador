package com.example.projeto.integrador.reporsitories;
import com.example.projeto.integrador.models.Agendamentos;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public interface AgendamentosReporsitory extends JpaRepository<Agendamentos, Long> {
    List <Agendamentos> findAgendamentosByDataInicial(LocalDate dataInicial);

    List <Agendamentos> findAgendamentosByHoraInicial(String horaInicial);
    List <Agendamentos> findAgendamentosByHoraFinal(String horaFinal);
}
