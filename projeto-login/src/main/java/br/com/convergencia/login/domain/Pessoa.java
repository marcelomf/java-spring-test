package br.com.convergencia.login.domain;

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
    private String usuario;
    @Column
    private String senha;

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

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) throws Exception {
        if(usuario.length() <= 2) {
            throw new Exception("Usuário inválido! Deve conter pelo menos 3 caracteres.");
        }
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) throws Exception {
        if(senha.length() <= 2) {
            throw new Exception("Senha inválida! Deve conter pelo menos 3 caracteres.");
        }
        this.senha = senha;
    }
}