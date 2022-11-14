package br.com.convergencia.cpf;

import java.util.List;

public interface PessoaService {

    Pessoa create(Pessoa usuario);

    Pessoa delete(int id);

    List<Pessoa> findAll();

    Pessoa findById(int id);

    Pessoa update(int id, Pessoa usuario);
}
