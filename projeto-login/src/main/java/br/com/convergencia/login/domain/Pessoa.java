package br.com.convergencia.login.domain;

import java.security.MessageDigest;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
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

        MessageDigest sha256 = MessageDigest.getInstance("SHA-256");        
        byte[] passBytes = senha.getBytes();
        byte[] passHash = sha256.digest(passBytes);

        StringBuilder hexString = new StringBuilder(2 * passHash.length);
        for (int i = 0; i < passHash.length; i++) {
            String hex = Integer.toHexString(0xff & passHash[i]);
            if(hex.length() == 1) {
                hexString.append('0');
            }
            hexString.append(hex);
        }
        this.senha = hexString.toString();
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) throws Exception {
        this.situacao = situacao;
    }
}