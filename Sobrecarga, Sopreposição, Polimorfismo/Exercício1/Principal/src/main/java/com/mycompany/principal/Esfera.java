
package com.mycompany.principal;

public class Esfera extends formaTrid{
    
    
    private int x;
    private int y;
    private int raio;
    
    public Esfera(String cor, int x, int y, int z, int raio){
        super(cor,x,y,z);
        this.raio = raio;
        
    }
    
    public double obterVolume(){
        return 4* (3.14) * (raio*raio*raio) / 3;
    }
    
    public boolean intercept(Esfera e) {
    double distance = Math.sqrt(Math.pow(this.x - e.x, 2) + Math.pow(this.y - e.y, 2) + Math.pow(this.z - e.z, 2));
    return distance <= this.raio + e.raio;
}

    
    
    public String exibeDados(){
      return super.exibeDados()+", raio: "+raio;
  }
  
    
}
