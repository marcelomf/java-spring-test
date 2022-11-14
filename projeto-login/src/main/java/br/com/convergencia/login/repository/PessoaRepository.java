package br.com.convergencia.login.repository;

import org.springframework.data.jpa.repository.*;

import br.com.convergencia.login.domain.Pessoa;

import java.util.List;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {

    void delete(Pessoa pessoa);

    List<Pessoa> findAll();

    Pessoa findById(int id);

    Pessoa findByCpf(String cpf);

    Pessoa save(Pessoa pessoa);
}