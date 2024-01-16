
package com.mycompany.escritorio;

public class Escritorio {

    
    public static void main(String[] args) {
        
        Funcionario funcionario[] = new Funcionario[5];
        
        funcionario[0] = new Vendedor("Diogo", "001", 2500, 500);
        funcionario[1] = new Gerente("Duda", "002", 4500);
        funcionario[2] = new Vendedor("Victor", "003", 1500, 300);
        funcionario[3] = new Assistente("Gabriel", "004", 2000);
        funcionario[4] = new Gerente("Debora", "005", 5000);
        
       
        double salarioGerente = 0, salarioVendedor = 0, salarioAssist = 0;
        int contadorGerente = 0, contadorVendedor = 0, contadorAssistente = 0;
        
        
        System.out.println("==== Folha Salarial ====");
        System.out.println("\n 1) GERENTES: ");
        for(int i = 0; i < 5; i++){
            if(funcionario[i] instanceof Gerente){
                System.out.println(funcionario[i].mostraDados()+ "\nSalario: " +funcionario[i].calculaSalario());
                contadorGerente++;
                salarioGerente += funcionario[i].calculaSalario();
            }
        }
            
            System.out.println("\n 2) VENDEDOR: ");
            for(int i = 0; i < 5; i++){
            if(funcionario[i] instanceof Vendedor){
                System.out.println(funcionario[i].mostraDados()+ "\nSalario: " +funcionario[i].calculaSalario());
                contadorVendedor++;
                salarioVendedor += funcionario[i].calculaSalario();
            }
        }
           
            System.out.println("\n 3) ASSISTENTES: ");
            for(int i = 0; i < 5; i++){
            if(funcionario[i] instanceof Assistente){
                System.out.println(funcionario[i].mostraDados()+ "\nSalario: " +funcionario[i].calculaSalario());
                contadorAssistente++;
                salarioAssist += funcionario[i].calculaSalario();
            }
            
            
        }
            
        System.out.println("\nO total dos salarios de todos funcionarios eh: " +(salarioGerente + salarioVendedor + salarioAssist));
        System.out.println("\nMedia dos Gerentes: ");
        if(contadorGerente > 0){ 
            System.out.println(salarioGerente / contadorGerente);
        } else System.out.println ("\nNão há Gerentes!");
            System.out.println("\nMedia dos Vendedores: ");
        if(contadorVendedor > 0){ 
            System.out.println(salarioVendedor / contadorVendedor);
        } else System.out.println ("\nNão há Vendedores!");
            System.out.println("\nMedia dos Assistentes: ");
        if(contadorAssistente > 0){ 
            System.out.println(salarioAssist / contadorAssistente);
        } else System.out.println ("\nNão há Assistentes!");
        
    }
}
