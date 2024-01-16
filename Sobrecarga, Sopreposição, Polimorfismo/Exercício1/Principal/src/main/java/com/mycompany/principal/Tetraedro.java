
package com.mycompany.principal;

public class Tetraedro extends formaTrid {
    
    private int x,y,z, base, alturaBase, altura;
    
    public Tetraedro(String cor, int x, int y, int z, int base, int alturaB, int altura){
        super(cor,x,y,z);
        this.base = base;
        this.alturaBase = alturaB;
        this.altura = altura;
    }
    
    
    public double obterVolume(){
        return 1 * (alturaBase * altura) / 3;
        
    }
    
    public String exibeDados(){
      return super.exibeDados()+", base: "+base;
    }   
    
}
