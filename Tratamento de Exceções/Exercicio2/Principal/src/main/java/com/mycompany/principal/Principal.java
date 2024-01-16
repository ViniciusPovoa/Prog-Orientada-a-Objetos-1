package com.mycompany.principal;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Principal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int vetor[] = new int[5];
        int op = 0;

        do {
            System.out.println("Escolha uma opção:");
            System.out.println("(1) Cadastrar um número");
            System.out.println("(2) Mostrar o vetor");
            try {
                op = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida, tente novamente.");
                sc.nextLine();
                continue;
            }

            switch (op) {
                case 1:
                    System.out.println("Em qual posição deseja cadastrar o número?");
                    int posicao = sc.nextInt();
                    if (posicao < 0 || posicao >= vetor.length) {
                        System.out.println("Posição inválida. Tente novamente.");
                        break;
                    }
                    if (vetor[posicao] != 0) {
                        System.out.println("Posição já está ocupada. Deseja sobrescrever? (s/n)");
                        String resposta = sc.next();
                        if (!resposta.equalsIgnoreCase("s")) {
                            break;
                        }
                    }
                    System.out.println("Qual número deseja cadastrar?");
                    int numero = sc.nextInt();
                    if (numero == -1) {
                        System.out.println("Programa finalizado.");
                        return;
                    }
                    vetor[posicao] = numero;
                    System.out.println("Valor " + numero + " cadastrado na posição " + posicao + ".");
                    break;

                case 2:
                    boolean vCadastrado = false;
                    for (int i = 0; i < vetor.length; i++) {
                        if (vetor[i] != 0) {
                            vCadastrado = true;
                            System.out.println("Valor " + vetor[i] + " na posição " + i + ".");
                        }
                    }
                    if (vCadastrado == false) {
                        System.out.println("Não existem valores cadastrados.");
                        System.out.println("Finalizando o programa...");
                    }

                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }

        } while (op != 2);

    }

}
