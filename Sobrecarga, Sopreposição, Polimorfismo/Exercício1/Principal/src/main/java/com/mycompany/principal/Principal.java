
package com.mycompany.principal;

import java.util.Scanner;

public class Principal {
    
    public static void main(String a[]){

    Scanner sc = new Scanner(System.in);
    
    Forma f[] = new Forma[8];
    
    f[0] = new Circulo("Amarelo - Circulo", 2, 3, 5);
    f[1] = new Quadrado("Azul - Quadrado", 2 ,4, 6);
    f[2] = new Triangulo("Vermelho - Triangulo", 3 ,5, 7, 5);
    f[3] = new Triangulo("Vermelho - Triangulo", 3 ,5, 7, 5);
    f[4] = new Esfera("Roxo - Esfera", 4, 5, 3, 2);
    f[5] = new Esfera("Roxo - Esfera", 4, 5, 3, 2);
    f[6] = new Cubo("Rosa - Cubo", 3, 6, 7, 8);
    f[7] = new Tetraedro("Verde - Tetraedro", 8, 9, 5, 1, 2, 3);
    
    
    
    int opcao;
    
    
    do { 
       System.out.println("Digite a opcao desejada"); 
       System.out.println("(1) Mostrar Dados"); 
       System.out.println("(2) Mostrar Area das Bidimensionais");
       System.out.println("(3) Mostrar Area das Tridimensionais");
       System.out.println("(4) Os Circulos se Interceptam");
       opcao = sc.nextInt();
       
       switch(opcao){
        
        case 1 : 
            
            for(int i = 0; i < 8; i++){
               System.out.println(f[i].exibeDados());
            }
            break;
            
        case 2 : 
            
            for(int i = 0; i < 4; i++){
                if (i == 0){
                   System.out.println("Circulo :");     
               }
                if (i == 1){
                   System.out.println("Quadrado :");     
               } 
                 if (i == 2){
                   System.out.println("Triangulo :");     
               }
                
               System.out.println("Area : "+  + ((formaBid) f[i]).obterArea());
            }
            break;
         
        case 3 :
            
            for(int i = 4; i < 8; i++){
                if (i == 4){
                   System.out.println("Esfera :");     
               }
                if (i == 6){
                   System.out.println("Cubo :");     
               } 
                 if (i == 7){
                   System.out.println("Tetraedro :");     
               }
               System.out.println("Volume : "+ ((formaTrid) f[i]).obterVolume());
            }
            break;
            
        case 4:
    for (int i = 0; i < f.length - 1; i++) {
        for (int j = i + 1; j < f.length; j++) {
            if (f[i] instanceof Circulo && f[j] instanceof Circulo) {
                Circulo c1 = (Circulo) f[i];
                Circulo c2 = (Circulo) f[j];
                if (c1.intercept(c2)) {
                    System.out.println("Os dois circulos se interceptam");
                }
            } else if (f[i] instanceof Esfera && f[j] instanceof Esfera) {
                Esfera e1 = (Esfera) f[i];
                Esfera e2 = (Esfera) f[j];
                if (e1.intercept(e2)) {
                    System.out.println("As duas esferas se interceptam");
                }
            }
        }
    }
    break;
  
        
    }
    }while (opcao != 5);
    
    
    
    }
}

