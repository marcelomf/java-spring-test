package br.com.convergencia.cpf.service;

import java.util.List;

import br.com.convergencia.cpf.domain.Pessoa;

public interface PessoaService {

    Pessoa create(Pessoa usuario);

    Pessoa delete(int id);

    List<Pessoa> findAll();

    Pessoa findById(int id);

    Pessoa findByCpf(String cpf);

    Pessoa update(int id, Pessoa usuario);
}
