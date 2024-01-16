
package com.mycompany.principio;

import java.util.Random;




public class FuncionarioComissionado extends Funcionario{
    
    
    private int nmroVendas;
    private int salarioFunc;
    private int salario;
    
    public FuncionarioComissionado(String nome, int cpf, int mat, int idade){
        super(nome, cpf, mat, idade);
        
    }
    
  
    
    
    
    public void totalVendas(){
        Random gerador = new Random();
        this.nmroVendas = gerador.nextInt(5)+6;
    }
    
    
    public int calculaSalario(){
        totalVendas();
        return salario = 1000 + 10 * nmroVendas;
    }
    
    
   public int getSalario(){
       return salario;
   }
}
