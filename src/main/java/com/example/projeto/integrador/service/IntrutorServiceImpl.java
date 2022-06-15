package com.example.projeto.integrador.service;

import com.example.projeto.integrador.models.Instrutor;
import com.example.projeto.integrador.reporsitories.InstrutorReporsitory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IntrutorServiceImpl implements InstrutorService {

  final InstrutorReporsitory instrutorReporsitory;

  public IntrutorServiceImpl(InstrutorReporsitory instrutorReporsitory) {
    this.instrutorReporsitory = instrutorReporsitory;
  }

  @Override
  public Instrutor salvar(Instrutor instrutor) throws Exception {
    List <Instrutor> email = instrutorReporsitory.findInstrutorByEmails(instrutor.getEmails());
    if (email != null && email.size() > 0 ) {
      throw new Exception("esse email ja foi cadastrado" + instrutor.getEmails());
    }
    return instrutorReporsitory.save(instrutor);
  }

  @Override
  public Instrutor editar(Instrutor instrutor) {
    return instrutorReporsitory.save(instrutor);
  }

  @Override
  public void delete(Long id) {
    instrutorReporsitory.deleteById(id);
  }

  @Override
  public List<Instrutor> listar() {
    return instrutorReporsitory.findAll();
  }
}
