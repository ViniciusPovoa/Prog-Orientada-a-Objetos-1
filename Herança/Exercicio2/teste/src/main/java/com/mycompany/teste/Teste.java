
package com.mycompany.teste;

import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {
        int opcao;
        Scanner sc = new Scanner(System.in);
        Dvds[] dvds = new Dvds[5];
        Informacoes[] info = new Informacoes[5];
        Cds[] cds = new Cds[5];
        Fitasvhs[] fita = new Fitasvhs[5];

        do {
            System.out.println("(1) Adicionar DVDs ao Sistema");
            System.out.println("(2) Mostrar DVDs cadastrados");
            System.out.println("(3) Adicionar CDs ao Sistema");
            System.out.println("(4) Mostrar CDs cadastrados");
            System.out.println("(5) Fita VHS");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    Scanner sc1 = new Scanner(System.in);
                    for (int i = 0; i < 2; i++) {
                        System.out.println("Digite o nome do filme");
                        String nome = sc1.next();
                        System.out.println("Digite o tipo do DVD (áudio ou vídeo)");
                        String tipo = sc1.next();
                        System.out.println("Digite o gênero");
                        String genero = sc1.next();
                        System.out.println("Digite o preco");
                        int preco = sc1.nextInt();
                        System.out.println("Digite os nomes dos atores (com espaço)");
                        String ator = sc1.next();
                        System.out.println("Digite o nome do diretor");
                        String diretor = sc1.next();
                        System.out.println("Digite o tempo de duracao em minutos");
                        int tempo = sc1.nextInt();
                        dvds[i] = new Dvds(nome, tipo, genero, preco, ator, diretor, tempo);
                    }
                    break;

                case 2:
                    for (int i = 0; i < 2; i++) {
                        System.out.println("======= FILME  " + (i + 1) + " =======");
                        dvds[i].getDvds();
                    }
                    break;

                case 3:
                    Scanner sc2 = new Scanner(System.in);
                    for (int i = 0; i < 2; i++) {
                        System.out.println("Digite o nome do cd: ");
                        String nomecd = sc2.next();
                        System.out.println("Digite o tipo: ");
                        String tipocd = sc2.next();
                        System.out.println("Digite o gênero: ");
                        String generocd = sc2.next();
                        System.out.println("Digite o preco: ");
                        int precocd = sc2.nextInt();
                        System.out.println("Digite o nome do cantor: ");
                        String nomecantor = sc2.next();
                        System.out.println("Digite o numero de faixas: ");
                        int faixas = sc2.nextInt();
                        cds[i] = new Cds(nomecd, tipocd, generocd, precocd, nomecantor, faixas);
                    }
                    break;
                    
                    
                case 4:
                    
                     for (int i = 0; i < 2; i++) {
                        System.out.println("======= CDs  " + (i + 1) + " =======");
                        cds[i].getCds();
                    }
                    break;


                case 5:
                    Scanner sc3 = new Scanner(System.in);
                    fita[0] = new Fitasvhs("A Origem", true);
                    fita[1] = new Fitasvhs("O Labirinto do Fauno", false);
                    fita[2] = new Fitasvhs("Clube da Luta", true);
                    fita[3] = new Fitasvhs("A Chegada", false);
                    fita[4] = new Fitasvhs("O Grande Hotel Budapeste", true);
                    
                    System.out.println("Vídeo 1: " +fita[0].getVideos() + " | Fita rebobinada: "+fita[0].rodando());
                    System.out.println("Vídeo 2: " +fita[1].getVideos() + " | Fita rebobinada: "+fita[1].rodando());
                    System.out.println("Vídeo 3: " +fita[2].getVideos() + " | Fita rebobinada: "+fita[2].rodando());
                    System.out.println("Vídeo 4: " +fita[3].getVideos() + " | Fita rebobinada: "+fita[3].rodando());
                    System.out.println("Vídeo 5: " +fita[4].getVideos() + " | Fita rebobinada: "+fita[4].rodando());
                        System.out.println("Deseja locar qual vídeo?");
                        int op = sc3.nextInt();
                        
                        if((op==1) && (fita[0].rodando() == false)){
                            System.out.println("Rebobinando a fita...");
                            System.out.println("Fita rebobinada!");
                        }
                        
                        else if ((op == 1) && (fita[0].rodando() == true)){
                            System.out.println("Fita locada!");
                         
                        }
                        
                       else
                        
                       if((op==2) && (fita[1].rodando() == false)){
                            System.out.println("Rebobinando a fita...");
                            System.out.println("Fita rebobinada!");
                        }
                        
                        else if ((op == 2) && (fita[1].rodando() == true)){
                           System.out.println("Fita locada!");
                           
                        }
                        
                        else
                            
                        if((op==3) && (fita[2].rodando() == false)){
                        System.out.println("Rebobinando a fita...");
                        System.out.println("Fita rebobinada!");
                        }
                        
                        else if ((op == 3) && (fita[2].rodando() == true)){
                            System.out.println("Fita locada!");
                                    
                            
                        }
                        
                        else 
                        
                        if((op==4) && (fita[3].rodando() == false)){
                        System.out.println("Rebobinando a fita...");
                        System.out.println("Fita rebobinada!");
                        }
                        
                        else if ((op == 4) && (fita[3].rodando() == true)){
                            System.out.println("Fita locada!");
                    
                        }
                        
                        if((op==5) && (fita[4].rodando() == false)){
                        System.out.println("Rebobinando a fita...");
                        System.out.println("Fita rebobinada!");
                        }
                        
                        else if ((op == 5) && (fita[4].rodando() == true)){
                            System.out.println("Fita locada!");
                    
                        }
                    break;
                    }
                 
            }while (opcao != 6);
        } 
    }


