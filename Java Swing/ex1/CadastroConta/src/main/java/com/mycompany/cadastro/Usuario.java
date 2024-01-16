//Vinícius Horácio Marques Póvoa
package com.mycompany.cadastro;

public class Usuario {
    
    private String nome, cpf, nascimento, sexo, numConta, email, senha;
    private boolean noticias;

    public Usuario(String nome, String cpf, String nascimento, String sexo, String numConta, String email, String senha, Boolean noticias) {
        this.nome = nome;
        this.cpf = cpf;
        this.nascimento = nascimento;
        this.sexo = sexo;
        this.numConta = numConta;
        this.email = email;
        this.senha = senha;
        this.noticias = noticias;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNascimento() {
        return nascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public String getNumConta() {
        return numConta;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public Boolean getNoticias() {
        return noticias;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setNoticias(boolean noticias) {
        this.noticias = noticias;
    }
    
}
    
    
}
