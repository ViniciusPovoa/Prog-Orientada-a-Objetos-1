package com.mycompany.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        int op, opcao;

        Scanner sc = new Scanner(System.in);

        Funcionario[] func = new Funcionario[5];
        Vendedor[] vend = new Vendedor[5];
        Administrador[] adm = new Administrador[5];

        do {
            System.out.println("====== SISTEMA DE CADASTRO ======");
            System.out.println("(1) Vendedores");
            System.out.println("(2) Administradores");
            System.out.println("Digite a opcao desejada:");
            op = sc.nextInt();

            switch (op) {

                case 1:

                    System.out.println("(1) Cadastrar Funcionário");
                    System.out.println("(2) Mostrar Funcionários");
                    System.out.println("(3) Zerar Vendas dos Vendedores");
                    opcao = sc.nextInt();

                    switch (opcao) {

                        case 1:
                            for (int i = 0; i < 5; i++) {
                                System.out.println("Digite o nome do funcionario");
                                String nome = sc.next();
                                System.out.println("Digite o RG do funcionario");
                                String rg = sc.next();
                                func[i] = new Funcionario(nome, rg);
                                vend[i] = new Vendedor(nome, rg, 1000, 0);
                                vend[i].calculaSalario();
                            }
                            break;

                        case 2:
                            for (int i = 0; i < vend.length; i++) {
                                if (vend[i] != null) {
                                    vend[i].mostrarVendedor();
                                }
                            }
                            break;

                        case 3:
                            for (int i = 0; i < 5; i++) {
                                vend[i].zerarVendas();
                            }
                            System.out.println("Vendas foram zeradas.");
                            break;
                        default:
                            System.out.println("Opção inválida.");
                            break;

                    }
                    break;

                case 2:

                    System.out.println("(1) Cadastrar Funcionário");
                    System.out.println("(2) Mostrar Funcionários");
                    opcao = sc.nextInt();

                    switch (opcao) {

                        case 1:
                            for (int i = 0; i < 5; i++) {
                                System.out.println("Digite o nome do funcionario");
                                String nome = sc.next();
                                System.out.println("Digite o RG do funcionario");
                                String rg = sc.next();
                                func[i] = new Funcionario(nome, rg);
                                adm[i] = new Administrador(nome, rg, 1000, 0);
                                adm[i].calculaSalario();
                            }
                            break;

                        case 2:
                            for (int i = 0; i < adm.length; i++) {
                                if (adm[i] != null) {
                                    adm[i].mostrarAdministrador();
                                }
                            }
                            break;

                        default:
                            System.out.println("Opção inválida.");
                            break;

                    }
                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;

            }

        } while (op != 3);

        sc.close();
        
    }
}
