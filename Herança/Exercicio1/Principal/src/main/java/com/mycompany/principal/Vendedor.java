
package com.mycompany.principal;

import java.util.Random;

public class Vendedor extends Funcionario { 

    private double comissao = 0.05;
    private double salario;
    private double salarioBase = 1000;
    private int valorAleatorio;
   
    
    public Vendedor(String nome, String rgFunc, double s, int nmrVendas){
        super(nome, rgFunc);
        this.salario = s;
        this.valorAleatorio = nmrVendas;
    }
    
    
    
    
    public void totalVendas(){
       Random gerador = new Random();
       this.valorAleatorio = gerador.nextInt(5) + 6;
      
    }
    
    public int vendasTeste(){
       totalVendas();
       return 1;
    }
    
    
   public void calculaSalario(){
    totalVendas();
    salario = salarioBase + (100 * this.valorAleatorio * comissao);
}

   

    
    public void mostrarVendedor(){
        System.out.println("Nome: " + getNome());
        System.out.println("RG: " + getrgFunc());
        System.out.println("Salário: " + salario);
        System.out.println("Total de Vendas: " + valorAleatorio);
        
    }  
    
    public void zerarVendas(){
        this.valorAleatorio = 0;
    }
}




