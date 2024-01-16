
package com.mycompany.ambienteespacial;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class NaveEspacial {
    
    private String nome;
    private int valorAleatorio;
    private int objetosCriados = 0;
    private int contador = 0;
    NaveEspacial[] nave = new NaveEspacial[5];

    
    
    public NaveEspacial(String nome, int valorAleatorio){
    this.valorAleatorio = valorAleatorio;
    this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
    
    public int getValorAleatorio(){
        return valorAleatorio;
    }
    
    public void criarNave(Scanner scanner) {
        System.out.println("Digite o nome da Nave");
        nome = scanner.nextLine();
        Random gerador = new Random();
        valorAleatorio = gerador.nextInt(6) + 5;
        System.out.println("Nave " + nome + " criada com sucesso");
    }
    
    public int navesLigadas(){
        contador++;
        return contador;
    }           
  
    
    public void setValorAleatorio(int valorAleatorio){
        this.valorAleatorio = valorAleatorio;
    }
    
    
    public void mostrarNave(){
        for(int i=0; i<5; i++) {
                        System.out.println(""+nave[i]);
                        if(valorAleatorio == 0) {
                            System.out.println("Nave Inoperante");
                        }
                    }
    
    }
    
    public static int compararNaves(NaveEspacial nave1, NaveEspacial nave2) {
        if (nave1.getValorAleatorio() > nave2.getValorAleatorio()) {
            return 1;
        } else if (nave1.getValorAleatorio() < nave2.getValorAleatorio()) {
            return -1;
        } else {
            return 0;
        }
    }

   public String toString() {
    return "NaveEspacial : | Nome: " + nome + " | Velocidade: " + valorAleatorio;
}


  
  
   
  
        
        
    
    
    
        
        
        
        
    }
    
    
    

