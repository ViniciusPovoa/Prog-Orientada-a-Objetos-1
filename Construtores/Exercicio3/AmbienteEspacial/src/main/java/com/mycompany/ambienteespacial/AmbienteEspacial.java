package com.mycompany.ambienteespacial;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class AmbienteEspacial {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

NaveEspacial[] nave = new NaveEspacial[5];
int opcao;
int valorAleatorio;
int contador = 0;

do {
    System.out.println("(1) Criar NaveEspacial");
    System.out.println("(2) Mostrar Naves existentes");
    System.out.println("(3) Parar NaveEspacial");
    System.out.println("(4) Ligar NaveEspacial");
    System.out.println("(5) Comparar NavesEspaciais");
    opcao = sc.nextInt();

    switch (opcao) {
        

        case 1 -> {
            Scanner sc1 = new Scanner(System.in);
            for (int i = 0; i < nave.length; i++) {
                nave[i] = new NaveEspacial("", 0);
                nave[i].criarNave(sc1);
                nave[i].navesLigadas();
            }
            break;
        }

        case 2 -> {
            for (int i = 0; i < nave.length; i++) {
                if (nave[i] != null) {
                    System.out.println(nave[i]);
                } else {
                    System.out.println("Nave " + (i + 1) + " não existe");
                }
            }
            break;
        }

        case 3 -> {
            Scanner scannerparar = new Scanner(System.in);
            System.out.println("Qual nave você deseja parar?");
            int parar = scannerparar.nextInt();
            for (int i = 0; i < nave.length; i++) {
                if (parar == i) {
                    nave[i].setValorAleatorio(0);
                    System.out.println("Nave " + nave[i].getNome() + " desligada com sucesso.");
                }
            }
            break;
        }
        
        case 4 -> {
            Scanner scannerligar = new Scanner(System.in);
            System.out.println("Qual nave você deseja ligar?");
            int ligar = scannerligar.nextInt();
            
            if (nave[ligar].getValorAleatorio() != 0) {
            System.out.println("Erro: a nave selecionada já está ligada. Por favor, selecione outra nave.");
            break;
        }
            
            for (int i = 0; i < nave.length; i++) {
                if(nave[i].navesLigadas() >= 3 && nave[i].getValorAleatorio() != 0){
                    System.out.println("Super população de Naves");
                    break;
                }  
                if (ligar == i) {
                    System.out.println("Qual valor da velocidade da Nave??");
                    int valor = scannerligar.nextInt();
                    nave[i].setValorAleatorio(valor);
                    System.out.println("Nave " + nave[i].getNome() + " ligada com velocidade = " + nave[i].getValorAleatorio() + '.');
                }
            }
            break;
        }

        case 5 -> {
                Scanner scannercomparar = new Scanner(System.in);
                 System.out.println("Qual nave você deseja comparar?");
                 System.out.println("Digite a primeira nave:");
                 int primeiranave = scannercomparar.nextInt();
                 NaveEspacial primeiraNave = nave[primeiranave];

                 System.out.println("Digite a segunda nave:");
                 int segundanave = scannercomparar.nextInt();
                 NaveEspacial segundaNave = nave[segundanave];
    
                 if (primeiraNave.getValorAleatorio() == 0 || segundaNave.getValorAleatorio() == 0) {
                  System.out.println("Erro: uma das naves selecionadas está desligada.");
                  } else {    
                 int resultado = NaveEspacial.compararNaves(primeiraNave, segundaNave);
                 if (resultado > 0) {
                  System.out.println("A nave " + primeiraNave.getNome() + " é mais rápida que a nave " + segundaNave.getNome());
                 } else if (resultado < 0) {
                  System.out.println("A nave " + segundaNave.getNome() + " é mais rápida que a nave " + primeiraNave.getNome());
                 } else {
                  System.out.println("As naves " + primeiraNave.getNome() + " e " + segundaNave.getNome() + " têm a mesma velocidade");
                 }
                 break;
                 }
                       }
        
        case 0 -> {
            System.out.println("Encerrando o programa...");
            System.out.println("Concluído!");
            break;
        }

        default -> {
            System.out.println("Opção inválida, tente novamente.");
            break;
        }
    }

} while (opcao != 0);

    }
}

