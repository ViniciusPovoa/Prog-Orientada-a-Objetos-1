
package com.mycompany.contatosmap;


import java.io.Serializable;



public class ContatosTreeMap implements Serializable{
    
    private String nome;
    private int idade;
    private String sexo;
    private String profissao;
    private String telefone;
    private String email;

    public ContatosTreeMap(String nome, int idade, String sexo, String profissao, String telefone, String email) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.profissao = profissao;
        this.telefone = telefone;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getSexo() {
        return sexo;
    }

    public String getProfissao() {
        return profissao;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    @Override
    public String toString(){
        return "\n\nNome: " + nome + "\nIdade: " + idade + " anos \nSexo: " + sexo + "\nProfissao: " + profissao + "\nTelefone: " + telefone + "\nE-mail: " + email;
    }
    
    
    
}
