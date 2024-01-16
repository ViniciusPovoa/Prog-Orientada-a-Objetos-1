
package com.mycompany.principal;

import java.util.Random;

public class Administrador extends Funcionario{
    
    
    private double salario;
    private double horasExtras;
  
    public Administrador(String nome, String rgFunc, double s, int nmrHoras){
        super(nome, rgFunc);
        this.salario = s;
        this.horasExtras = nmrHoras;

    }
    
     public void totalHoras(){
       Random gerador = new Random();
       this.horasExtras = gerador.nextInt(5) + 6;
      
    }
    
   public void calculaSalario() {
    totalHoras();
    salario = (1000 +  10 * horasExtras);
}

    public void mostrarAdministrador(){
        System.out.println("Nome: " + getNome());
        System.out.println("RG: " + getrgFunc());
        System.out.println("Salário: " + salario);
        System.out.println("Total de Horas: " + horasExtras);
        
        }  
        
    }
    
    
    

