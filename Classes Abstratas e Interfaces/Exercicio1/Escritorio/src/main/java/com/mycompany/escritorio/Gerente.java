
package com.mycompany.escritorio;


public class Gerente extends Funcionario {
    
    public Gerente(String nome, String matricula, double salarioBase){
        super(nome, matricula, salarioBase);
        
        
    }
    
    
    @Override
    public double calculaSalario(){
        return super.getSalarioBase() * 2;
    }
    
    
    
}
