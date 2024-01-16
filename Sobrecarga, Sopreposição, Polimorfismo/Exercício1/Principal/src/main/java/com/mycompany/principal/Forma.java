
package com.mycompany.principal;

public class Forma {
    
    private String cor;
    private int id;
    private static int ct = 0;
    
    
    public Forma (String cor){
        id = ct;
        ct++;
        this.cor = cor;
       
    }
    
    
    
    public String exibeDados(){
        return "ID: "+id+", Cor: "+cor;
    }
   
    
    
    
    
    
    
}
