
package com.mycompany.principal;

public class Circulo extends formaBid {
    
    private int x;
    private int y;
    private int raio;
    private String nome = "Circulo";
    
    
 public Circulo(String cor, int x, int y, int raio){
     super(cor, x, y);
     this.raio = raio;
     
 }   
 
 public String exibeNome(){
     return nome;
     
     
 } 
 
public boolean intercept(Circulo c) {
    double d = Math.sqrt(Math.pow((this.x - c.x), 2) + Math.pow((this.y - c.y), 2));
    return d <= this.raio + c.raio;
}


 
 
 
 public String exibeDados(){
      return super.exibeDados()+", raio: "+raio;
    }


    public double obterArea(){
    return 3.14 * (raio*raio);

}

}
