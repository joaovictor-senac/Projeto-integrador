package com.example.projeto.integrador.reporsitories;

import com.example.projeto.integrador.models.Instrutor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InstrutorReporsitory extends JpaRepository<Instrutor, Long> {

  List <Instrutor> findInstrutorByEmails(String emails);


}
