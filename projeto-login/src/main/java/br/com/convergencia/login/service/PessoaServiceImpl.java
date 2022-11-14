package br.com.convergencia.login.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.convergencia.login.domain.Pessoa;
import br.com.convergencia.login.repository.PessoaRepository;

import java.util.List;

@Service
public class PessoaServiceImpl implements PessoaService {

    @Autowired
    private PessoaRepository repository;

    @Override
    public Pessoa create(Pessoa pessoa) {
        return repository.save(pessoa);
    }

    @Override
    public Pessoa delete(int id) {
        Pessoa pessoa = findById(id);
        if(pessoa != null){
            repository.delete(pessoa);
        }
        return pessoa;
    }

    @Override
    public List<Pessoa> findAll() {
        return repository.findAll();
    }

    @Override
    public Pessoa findById(int id) {
        return repository.findById(id);
    }

    public Pessoa findByCpf(String cpf) {
        return repository.findByCpf(cpf);
    }

    @Override
    public Pessoa update(int id, Pessoa pessoa) {
        pessoa.setId(id);
        return repository.save(pessoa);
    }
}