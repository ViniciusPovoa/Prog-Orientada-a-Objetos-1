package com.mycompany.produtosprincipal;

import java.util.Scanner;

public class ProdutosPrincipal {

    public static void main(String[] args) {

        Produto v[] = new Produto[20];

        Scanner scanner = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("\n====MENU DO PROGRAMA====");
            System.out.println("(1) Cadastrar produto ");
            System.out.println("(2) Mostrar produtos cadastrados ");
            System.out.println("(3) Calcular quantidade e o preço total de um produto ");
            System.out.println("(4) Calcular o total de todos produtos inseridos  ");
            System.out.println("OPCAO: ");
            opcao = scanner.nextInt();

            switch (opcao) {

                case 1:
                    System.out.print("Digite o ID do produto: ");
                    String id = scanner.next();
                    System.out.print("Digite o ano de produção: ");
                    int anoProducao = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Digite a unidade de venda: ");
                    int unidadeVenda = scanner.nextInt();
                    System.out.print("Digite a categoria do produto: ");
                    String categoria = scanner.next();
                    System.out.print("Digite o preço do produto: ");
                    double preco = scanner.nextDouble();

                    for (int i = 0; i < 20; i++) {
                        if (categoria.equalsIgnoreCase("eletrodomestico")) {
                            v[i] = new Eletrodomestico(id, anoProducao, unidadeVenda, categoria, preco);
                            System.out.println("Eletrodoméstico cadastrado com sucesso!");
                        } else if (categoria.equalsIgnoreCase("vinho")) {
                            v[i] = new Vinho(id, anoProducao, unidadeVenda, categoria, preco);
                            System.out.println("Vinho cadastrado com sucesso!");
                        } else if (categoria.equalsIgnoreCase("cafe")) {
                            v[i] = new Cafe(id, anoProducao, unidadeVenda, categoria, preco);
                            System.out.println("Café cadastrado com sucesso!");
                        } else {
                            System.out.println("Categoria inválida!");
                        }

                    }
                    break;

                case 2:
                    for (int i = 0; i < 20; i++) {
                        System.out.println("\n(" + i + ")" + v[i].mostraDados());

                    }
                    break;

                case 3:
                    int qntdCateg = 0;
                    double precoTotalCateg = 0;

                    System.out.println("Escolha a categoria do produto: ");
                    String consulta = scanner.next();

                    for (int i = 0; i < 20; i++) {
                        if (v[i].getCategoria().equalsIgnoreCase(consulta)) {
                            qntdCateg += v[i].getUnidadeVenda();
                            precoTotalCateg += v[i].getPreco() * v[i].getUnidadeVenda();
                        }
                    }

                    System.out.println("\nQtdd de produtos da categoria " + consulta + ": " + qntdCateg);
                    System.out.println("Preço total dos produtos da categoria " + consulta + ": " + precoTotalCateg);
                    break;

                case 4:
                    int qntdTotal = 0;
                    double precoTotal = 0;

                    for (int i = 0; i < 20; i++) {
                        if (v[i] != null) {
                            qntdTotal += v[i].getUnidadeVenda();
                            precoTotal += v[i].getPreco() * v[i].getUnidadeVenda();
                        }
                    }

                    System.out.println("\nQtdd total de produtos: " + qntdTotal);
                    System.out.println("Preço total dos produtos: " + precoTotal);
                    break;

            }
        } while (opcao != 5);
    }
}
