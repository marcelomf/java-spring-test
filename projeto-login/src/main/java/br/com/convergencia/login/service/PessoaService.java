package br.com.convergencia.login.service;

import java.util.List;

import br.com.convergencia.login.domain.Pessoa;

public interface PessoaService {

    Pessoa create(Pessoa usuario) throws Exception;

    Pessoa delete(int id);

    List<Pessoa> findAll();

    Pessoa findById(int id);

    Pessoa findByCpf(String cpf);

    Pessoa update(int id, Pessoa usuario);
}
