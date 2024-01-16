
package com.mycompany.principio;

import java.util.Random;

public class FuncionarioNoturno extends Funcionario{
    
    
    private int nmroHoras;
    private int salarioFunc;
    private int salario;
    
    public FuncionarioNoturno(String nome, int cpf, int mat, int idade){
        super(nome, cpf, mat, idade);
        
    }
    
    
    public void totalVendas(){
        Random gerador = new Random();
        this.nmroHoras = gerador.nextInt(5)+6;
    }
    
    
    public int calculaSalario(){
        totalVendas();
        return salario = 1000 + 10 * nmroHoras;
    }
}
