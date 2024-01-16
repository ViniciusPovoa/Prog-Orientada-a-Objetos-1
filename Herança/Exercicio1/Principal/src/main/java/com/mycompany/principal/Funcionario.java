
package com.mycompany.principal;

public class Funcionario {
    
    private String nome;
    private String rgFunc;
    
    
    public Funcionario (String n, String RG){
        this.nome = n;
        this.rgFunc = RG;
    }
    
    
  public String getNome(){
      return nome;
      
  }  
    
    public String getrgFunc(){
      return rgFunc;
      
  }  
    
    
}
