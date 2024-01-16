package com.mycompany.programaconta;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProgramaConta {

   
    public static void main(String[] args) throws ClienteException {

        Scanner scanner = new Scanner(System.in);

        Conta conta[] = new Conta[5];

        int op = 0;

        do {
            System.out.println("\n\n===== MENU DE OPERAÇÕES =====");
            System.out.println("1) Cadastrar conta.");
            System.out.println("2) Mostrar informações da conta.");
            System.out.println("3) Depositar.");
            System.out.println("4) Sacar.");
            System.out.println("5) Sair. ");
            System.out.println("Escolha uma das opçoes acima: ");
            op = scanner.nextInt();

            switch (op) {

                case 1:
                    try {
                    for (int i = 0; i < 5; i++) {
                        System.out.println("\nDigite seu Nome: ");
                        String nome = scanner.next();
                        System.out.println("\nDigite sua Idade: ");
                        int idade = scanner.nextInt();
                        if( idade < 18){ throw new ClienteException("Cliente deve ser maior de idade!!");}
                        else idade = idade;
                        System.out.println("\nDigite um Numero de Conta: ");
                        int numeroDaConta = scanner.nextInt();
                        System.out.println("\nDigite seu Saldo Inicial: ");
                        double saldo = scanner.nextDouble();

                        scanner.nextLine();

                        conta[i] = new Conta(nome, idade, numeroDaConta, saldo);
                        System.out.println("\n\n==== CONTA CADASTRADA COM SUCESSO ====\n");
                        break;
                    }
                    
                    } catch (ArrayIndexOutOfBoundsException ex) {
                    System.out.println("\n\nErro ao cadastrar conta! Número de conta inválido!");
                }
                    break;


                case 2:
                 try {
                    System.out.println("\n\nDigite o número da conta:");
                    int numeroConta = scanner.nextInt();
                    scanner.nextLine();

                    int i = Conta.buscarConta(conta, numeroConta);

                    if (i == -1) {
                        System.out.println("\n\n===== CONTA NÃO ENCONTRADA =====");
                    } else {
                        System.out.println("\n\n==== DADOS DA CONTA ====");
                        conta[i].mostraDados();
                    }
                } catch (InputMismatchException eX) {
                    System.out.println("\n\nErro ao buscar conta! Número de conta inválido!");
                    scanner.nextLine();
                }
                break;

                case 3:
    try {
                    System.out.println("\n\nDigite o número da conta:");
                    int numeroConta = scanner.nextInt();
                    scanner.nextLine();

                    int i = Conta.buscarConta(conta, numeroConta);
                    if (i == -1) {
                        System.out.println("\n\n===== CONTA NÃO ENCONTRADA =====");
                        break;
                    }

                    System.out.println("\n\nDigite o valor a ser depositado:");
                    double valor = scanner.nextDouble();
                    scanner.nextLine();

                    conta[i].depositar(valor);
                } catch (InputMismatchException e) {
                    System.out.println("\n\nErro ao fazer depósito! Número de conta inválido!");
                    scanner.nextLine();
                } catch (ValorInvalidoException e) {
                    System.out.println("\n\nErro ao realizar depósito: " + e.getMessage());
                }
                break;

                case 4:
    try {
                    System.out.println("\n\nDigite o número da conta:");
                    int numeroConta = scanner.nextInt();
                    scanner.nextLine();

                    int i = Conta.buscarConta(conta, numeroConta);

                    if (i == -1) {
                        System.out.println("\n\n===== CONTA NÃO ENCONTRADA =====");
                    } else {
                        System.out.println("\n\nSaldo atual: " + conta[i].getSaldo());
                        System.out.println("\n\nDigite o valor a ser sacado:");
                        double valorSaque = scanner.nextDouble();

                        scanner.nextLine();

                        conta[i].sacar(valorSaque);
                    }
                } catch (InputMismatchException ex) {
                    System.out.println("\n\nErro ao realizar saque! Valor inválido digitado!");

                    scanner.nextLine();

                } catch (SaldoInsuficienteException ex) {
                    System.out.println("\n\nErro ao realizar saque!!! " + ex.getMessage());
                }
                break;

                case 5:
                    System.out.println("\n\n====== SAINDO DO PROGRAMA ======");

            }

        } while (op != 0);

    }

}
