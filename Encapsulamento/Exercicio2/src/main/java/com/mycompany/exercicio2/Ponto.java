
package com.mycompany.exercicio2;

public class Ponto {
    private double x;
    private double y;
    
    
    public double getX(){
        return x;
        
    }
    
    public double getY(){
        return y;
        
    }
    
    public void setX(double x){
        if(x<0){
            x=0; 
        } else this.x = x;
    }
    
    public void setY(double y){
        if(y<0){
            y = 0;
        } else this.y = y;
    }
    
    public double distancia(Ponto p){
        double distY = getY() - p.getY();
        double distX = getX() - p.getX();
        return Math.sqrt((distX*distX)+ (distY*distY));
    }
}
    
    
    
  
