package br.com.convergencia.cpf.domain;

import javax.persistence.*;

@Entity
@Table(name = "pessoa")
public class Pessoa {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String nome;
    @Column
    private String cpf;
    @Column
    private String situacao;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws Exception {
        if(nome.length() <= 2) {
            throw new Exception("Nome inválido! Deve conter pelo menos 3 caracteres.");
        }
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) throws Exception {
        if(cpf.length() <= 7) {
            throw new Exception("Cpf inválido! Deve conter pelo menos 8 caracteres.");
        }
        if(!cpf.matches("\\d+")) {
            throw new Exception("Cpf inválido! Deve conter apenas números.");
        }
        this.cpf = cpf;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) throws Exception {
        if(!situacao.matches("ativo|inativo")) {
            throw new Exception("Situação inválida! Deve ser ativo ou inativo.");
        }
        this.situacao = situacao;
    }
}