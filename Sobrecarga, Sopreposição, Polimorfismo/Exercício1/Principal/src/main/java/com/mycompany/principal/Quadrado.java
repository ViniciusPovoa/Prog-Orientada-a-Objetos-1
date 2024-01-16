
package com.mycompany.principal;

public class Quadrado extends formaBid {
    
    private int lado;
    private String nome = "Quadrado";
    
    public Quadrado(String cor, int x, int y, int l){
        super(cor, x, y);
        this.lado = l;
    }
    
    public String exibeNome(){
        return nome;
    }
    
    
    public String exibeDados(){
      return super.exibeDados()+", lado: "+lado;
    }
        
    public double obterArea (){
       return lado * lado;
        
    }
    
}
