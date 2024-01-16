
package com.mycompany.exercicioum;

import java.util.Scanner;

public class Exercicioum {

 

    public static void main(String a[]){
        MaquinadePassagem m = new MaquinadePassagem("M01", 3);
        Scanner leitor = new Scanner(System.in);
        int opcao;
        
       do{
           System.out.println("Menu: ");
           System.out.println("1 - Comprar Ticket");
           System.out.println("2 - Verificar Montante");
           System.out.println("3 - Sair");
           opcao = leitor.nextInt();
           
           switch(opcao){
               case 1:
                   System.out.println("Insira o valor: ");
                   int v = leitor.nextInt();
                   m.InserirDinheiro(v);
                   break;
               case 2:
                   System.out.println(m.mostraDados());
                   break;
           }
           
       }while(opcao != 3);
    }
}