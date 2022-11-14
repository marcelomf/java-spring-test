package br.com.convergencia.cpf.repository;

import org.springframework.data.jpa.repository.*;

import br.com.convergencia.cpf.domain.Pessoa;

import java.util.List;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {

    void delete(Pessoa pessoa);

    List<Pessoa> findAll();

    Pessoa findById(int id);

    Pessoa save(Pessoa pessoa);
}