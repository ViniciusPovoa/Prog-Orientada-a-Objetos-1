
package com.mycompany.principal;


public class Triangulo extends formaBid {
    
    private int altura;
    private int base;
    private String nome = "Triangulo";
    
    
    public Triangulo(String cor, int x, int y, int base, int altura) {
        super(cor,x,y);
        this.base = base;
        this.altura = altura;
        
    }
    
    
    public String exibeNome(){
       return nome; 
       
    }
    
    
    public String exibeDados(){
      return super.exibeDados()+", altura: "+altura+", base: "+base+"";
    }
        
    public double obterArea (){
       return base * altura / 2;
        
    }
    
    
    
    
    
    
}
