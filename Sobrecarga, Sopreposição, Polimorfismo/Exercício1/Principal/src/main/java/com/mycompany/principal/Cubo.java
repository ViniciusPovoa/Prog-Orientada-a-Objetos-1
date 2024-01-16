
package com.mycompany.principal;

public class Cubo extends formaTrid{
    
    private int x;
    private int y;
    private int lado;
    
    
    
    public Cubo(String cor, int x, int y, int z, int l){
        super(cor,x,y,z);
        this.lado = l;
    }
    
    public double obterVolume(){
        return lado * lado * lado;
    }
    
    public String exibeDados(){
      return super.exibeDados()+", lado: "+lado;
    }   
}
