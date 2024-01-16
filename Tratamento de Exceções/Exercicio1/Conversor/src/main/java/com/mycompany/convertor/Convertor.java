
package com.mycompany.convertor;

import java.util.Scanner;
import java.lang.Exception;
        
public class Convertor {

    public static void main(String[] args) {
        int i = 0;
        
        while (i <= 3){
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Digite o valor");
                float valor = sc.nextFloat();
                
          
            } catch(Exception ex) {
                i++;
                
                if(i == 3) {
                    System.out.println("Total de tentativas acabou");
                    break;
                }else {
                    System.out.println("Voce digitou um valor que não pode ser convertido, digite novamente");
                }
            }
        }
    }
}
