package com.mycompany.principal;

public class Tempo {
    
    private double hora;
    private double minuto = 0;
    private double segundo;
    
    
    public Tempo(double hora, double minuto, double segundo){
     
       this.hora = hora;
       this.minuto = minuto;
       this.segundo = segundo;
      
    }
    
    public void setHora(double hora) {
    if (hora > 23) {
        this.hora = 0;
        System.out.println("Não foi possível agregar esse valor para Hora");
    } else if (hora < 0) {
        this.hora = 0;
        System.out.println("Não foi possível agregar esse valor para Hora");
    } else {
        this.hora = hora;
    }
}
    
    public void setMinuto(double minuto){
        if (minuto >= 60) {
        hora++;
        this.minuto = 0;
       
        System.out.println("Não foi possível agregar esse valor para Minuto");
    } else if (minuto < 0) {
        this.minuto = 0;
        System.out.println("Não foi possível agregar esse valor para Minuto");
    } else {
        this.minuto = minuto;
        }
    }
    
    public void setSegundo(double segundo){
        if (segundo > 60) {
        incMinuto();
        this.segundo = 0;
        System.out.println("Não foi possível agregar esse valor para Segundo");
    } else if (segundo < 0) {
        this.segundo = 0;
        System.out.println("Não foi possível agregar esse valor para Segundo");
    } else {
        this.segundo = segundo;
        }
    }
    
    public double getHora(){
        return hora;
    }
    
    public double getMinuto(){
        return minuto;
    }
    
    public double getSegundo(){
        return segundo;
    }

    public String mostraMinuto(){
        return "Minuto : " + minuto;
    }
    
    public String mostraMinutoAntes(){
        minuto--;
        return "Minuto Antes : " + minuto;
    }
  
    private boolean incrementouMinuto = false;

    public void incMinuto() {
    minuto++;
    if(minuto > 60){
        hora++;
        minuto = 0;
    }
    incrementouMinuto = true;
}
    
   
    
    private boolean decrementouMinuto = false;
     
    
    public void decMinuto() {
    minuto--;
    if(minuto < 0){
        minuto = 0;
    }
    decrementouMinuto = true;
}
    

    public String mostraDados() {
        
    if(incrementouMinuto == true){
        minuto++;
    }
    
  
    return "Hora / Minuto / Segundo: " + hora + " / " + minuto + " / " + segundo;
    } 
    
     public String mostrarHoraAM() {
         hora = hora - 12;
         return "Hora / Minuto /" + hora + " / " + minuto;
      
     }
}