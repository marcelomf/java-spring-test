package br.com.convergencia.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import br.com.convergencia.login.domain.Pessoa;
import br.com.convergencia.login.service.PessoaService;

import java.util.List;

@RestController
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;

    @PostMapping("/pessoas")
    public Pessoa create(@RequestBody Pessoa pessoa){
        return pessoaService.create(pessoa);
    }

    @GetMapping("/pessoas/{id}")
    public Pessoa findOne(@PathVariable("id") int id){
        return pessoaService.findById(id);
    }

    @GetMapping("/pessoas/cpf/{cpf}")
    public Pessoa findOne(@PathVariable("cpf") String cpf){
        return pessoaService.findByCpf(cpf);
    }

    @PutMapping("/pessoas/{id}")
    public Pessoa update(@PathVariable("id") int id, @RequestBody Pessoa usuario){
        return pessoaService.update(id, usuario);
    }

    @DeleteMapping("/pessoas/{id}")
    public Pessoa delete(@PathVariable("id") int id) {
        return pessoaService.delete(id);
    }

    @GetMapping("/pessoas")
    public List<Pessoa> findAll(){
        return pessoaService.findAll();
    }
}