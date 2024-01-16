
package com.mycompany.principio;


public class Funcionario {
    
    private int cpf;
    private String nome;
    private int matricula;
    private int idade;
    private int salario = 1000;
    
    
    public Funcionario (String nome, int cpf, int matricula, int idade){
        this.cpf = cpf;
        this.nome = nome;
        this.matricula = matricula;
        this.idade = idade;
        
    }
    
    public int getCpf(){
        return cpf;
    }
    
     public String getNome(){
        return nome;
        
    }
     
     public int getMatricula(){
         return matricula;
     }
     
     public int getIdade(){
         return idade;
     } 
}
