
package com.mycompany.contatos;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class PrincipalContatos {

    public static void main(String[] args) {

        GestaoContatos gestaoContatos = new GestaoContatos();

        Scanner scanner = new Scanner(System.in);

        int op;

        do {
            System.out.println("\n\n===== MENU =====");
            System.out.println("\n\n1) Adicionar contato");
            System.out.println("2) Remover contato");
            System.out.println("3) Listar os contatos");
            System.out.println("4) Salvar os contatos em arquivo");
            System.out.println("5) Olhar o contato mais velho");
            System.out.println("6) Olhar o contato mais novo");
            System.out.println("7) Sair");
            System.out.println("\nEscolha uma das opções acima: ");
            op = scanner.nextInt();

            switch (op) {

                case 1:
                    System.out.println("\n\n==== ADICIONANDO CONTATO ====");
                    System.out.println("\nNome: ");
                    String nome = scanner.next();
                    System.out.println("\nIdade: ");
                    int idade = scanner.nextInt();
                    System.out.println("\nSexo: ");
                    String sexo = scanner.next();
                    System.out.println("\nProfissão: ");
                    String profissao = scanner.next();
                    System.out.println("\nTelefone: ");
                    String telefone = scanner.next();
                    System.out.println("\nEmail: ");
                    String email = scanner.next();

                    scanner.nextLine();

                    Contatos contato = new Contatos(nome, idade, sexo, profissao, telefone, email);
                    System.out.println("\n\nEscolha pra qual categoria esse contato vai entrar: ");
                    System.out.println("F - Família  \nA - Amigos \nP - Profissional: ");
                    System.out.println("\nEscolha uma opçao: ");
                    char categoria = scanner.next().charAt(0);

                    try {
                        gestaoContatos.adicionaContato(contato, categoria);
                        System.out.println("\n\n==== CONTATO ADICIONADO COM SUCESSO ====");
                    } catch (CategoriaInvalidaException ex) {
                        System.out.println("\n\nCATEGORIA INVÁLIDA! TENTE NOVAMENTE!");
                    }
                    break;

                case 2:
                    System.out.println("\n\n==== REMOVENDO CONTATO ====");
                    System.out.println("\nDigite o nome do contato que deseja remover: ");
                    nome = scanner.next();

                    try {
                        gestaoContatos.eliminaContato(nome);
                        System.out.println("\n\n==== CONTATO REMOVIDO COM SUCESSO ====");
                    } catch (ContatoNaoEncontradoException e) {
                        System.out.println("\n\nCONTATO NÃO ENCONTRADO! TENTE NOVAMENTE!");
                    }
                    break;

                case 3:
                    System.out.println("\n\nEscolha qual categoria deseja ver os contatos listados: ");
                    System.out.println("F - Família  \nA - Amigos \nP - Profissional): ");
                    System.out.println("\nEscolha uma opçao: ");
                    categoria = scanner.next().charAt(0);

                    try {
                        ArrayList<Contatos> contatos = gestaoContatos.listaContatos(categoria);
                        for (Contatos cont : contatos) {
                            System.out.println(cont);
                        }
                    } catch (CategoriaInvalidaException ex) {
                        System.out.println("\n\nCATEGORIA INVÁLIDA! TENTE NOVAMENTE!");
                    }
                    break;

                     
                    
            
            case 4:
                    System.out.println("\n\n==== SALVANDO CONTATOS NO ARQUIVO ====");
                    System.out.println("\nNome do arquivo: ");
                    String arquivo = scanner.next();

                    try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(arquivo))) {
                        outputStream.writeObject(gestaoContatos);
                        System.out.println("\n\n==== CONTATOS SALVOS COM SUCESSO =====");
                    } catch (IOException e) {
                        System.out.println("\n\nERRO AO SALVAR CONTATOS: " + e.getMessage());
                    }
                    break;

                case 5:
                    System.out.println("\n\n==== CONTATO MAIS VELHO ====");
                    Contatos maisVelho = gestaoContatos.maisVelho();
                    if (maisVelho != null) {
                        System.out.println("\nContato mais velho: " + maisVelho);
                    } else {
                        System.out.println("\n\nNENHUM CONTATO ENCONTRADO.");
                    }
                   break;

                case 6:
                    System.out.println("\n\n==== CONTATO MAIS NOVO ====");
                    Contatos maisNovo = gestaoContatos.maisNovo();
                    if (maisNovo != null) {
                        System.out.println("Contato mais novo: " + maisNovo);
                    } else {
                        System.out.println("\n\nNENHUM CONTATO ENCONTRADO!.");
                    }
                    break;

                case 7:
                    System.out.println("\n\n===== ENCERRANDO PROGRAMA =====");
                    break;

                default:
                    System.out.println("\n\nOPÇÃO INVÁLIDA! TENTE NOVAMENTE!");
                    break;

            }

        } while (op != 7);

        
        }
    }
