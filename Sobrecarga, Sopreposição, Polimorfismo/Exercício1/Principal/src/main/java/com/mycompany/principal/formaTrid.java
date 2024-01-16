
package com.mycompany.principal;

public abstract class formaTrid extends Forma{
    
    int x, y, z;
    
    
     public formaTrid(String cor, int x, int y, int z){
      super(cor);
      this.x = x;
      this.y = y;
      this.z = z;
  }
     
  public abstract double obterVolume();    
  
  public String exibeDados(){
      return super.exibeDados()+", coordenadas: ("+x+", "+y+")";
  }
  
}

    
    
  