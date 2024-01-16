package com.mycompany.principal;
import java.util.Scanner;

//Professor, eu não fiz com valores pré colocados porque achei mais interessante um programa mais dinâmico, por isso está dessa forma.


public class Principal {

    public static void main(String[] args) {
        
         Scanner scanner = new Scanner(System.in);
        
      
        int opcao;
        Tempo t = null;
        
        do {
        System.out.println("======== Selecione uma opção: ========");
        System.out.println("(1) Cadastrar Hora ");
        System.out.println("(2) Mostrar dados ");
        System.out.println("(3) Aumentar minuto ");
        System.out.println("(4) Diminuir minuto ");
        System.out.println("(5) Mostrar hora em formato AM ");
        opcao = scanner.nextInt();

       
        
        switch(opcao) {
    case 1 ->    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Opção 1 selecionada.");
        System.out.println("Digite o valor da hora");
        double valorH = sc.nextDouble();
        System.out.println("Digite o valor do minuto");
        double valorM = sc.nextDouble();
        System.out.println("Digite o valor do segundo");
        double valorS = sc.nextDouble();
        
        t = new Tempo(valorH, valorM, valorS);
        t.setHora(valorH);
        t.setSegundo(valorS);
        t.setMinuto(valorM);
                 }
    case 2 ->    {
        System.out.println("Opção 2 selecionada.");
        if (t == null) {
            System.out.println("É necessário cadastrar a hora antes de mostrar os dados!");
        } else {
            System.out.println(t.mostraDados());
        }    }

    case 3 ->    {
        System.out.println("Opção 3 selecionada.");
        if (t == null) {
            System.out.println("É necessário cadastrar a hora antes de mostrar os dados!");
        } else {
            t.incMinuto();
            System.out.println(t.mostraMinuto());
            System.out.println(t.mostraMinutoAntes());
        }        }
        
    case 4 ->    {
        System.out.println("Opção 4 selecionada.");
        if (t == null) {
            System.out.println("É necessário cadastrar a hora antes de mostrar os dados!");
        } else {
            t.decMinuto();
            System.out.println(t.mostraMinuto());
        }        }
    case 5 ->    {
        System.out.println("Opção 5 selecionada.");
        if (t == null) {
            System.out.println("É necessário cadastrar a hora antes de mostrar os dados!");
        } else {
            System.out.println(t.mostrarHoraAM());
        }        }    
        
        
    default ->   {
        System.out.println("Opção inválida - Programa sendo fechado...");
        System.out.println("Concluído.");
                 }
            }
        } while (opcao != 0);
    }

        
        
        
        
       

    }  
