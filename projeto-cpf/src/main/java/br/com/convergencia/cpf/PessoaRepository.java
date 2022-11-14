package br.com.convergencia.cpf;

import org.springframework.data.jpa.repository.*;

import java.util.List;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {

    void delete(Pessoa pessoa);

    List<Pessoa> findAll();

    Pessoa findById(int id);

    Pessoa save(Pessoa pessoa);
}