
package com.mycompany.principal;

public abstract class formaBid extends Forma {
    
   int x, y;
    
  public formaBid(String cor, int x, int y){
      super(cor);
      this.x = x;
      this.y = y;
     
  }
  
   public abstract String exibeNome();
  
  
  public abstract double obterArea();
  
  
  
  
  
  public String exibeDados(){
      return super.exibeDados()+", coordenadas: ("+x+", "+y+")";
  }
  
 
  
}
