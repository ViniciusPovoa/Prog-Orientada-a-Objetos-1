
package com.mycompany.empregado;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PrincipalEmpregado {

    public static void main(String[] args) {

        ArrayList<Empregado> empregado = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        int op = 0;
        String cpf;
        int idade;
        double salario;

        do {
            System.out.println("\n\n===== MENU =====");
            System.out.println("1) Cadastrar empregado");
            System.out.println("2) Mostrar empregados cadastrados");
            System.out.println("3) Busca por CPF");
            System.out.println("4) Buscar maiores salarios");
            System.out.println("5) Ordenar empregados por idade");
            System.out.println("6) Sair");
            System.out.println("\nEscolha uma das opçoes acima: ");
            op = scanner.nextInt();

            switch (op) {

                case 1:
                    for (int i = 0; i < 5; i++) {
                        System.out.println("\n\n Cadastre a sua conta");
                        System.out.println("\n\nDigite seu CPF: ");
                        cpf = scanner.next();
                        System.out.println("\nDigite sua Idade: ");
                        idade = scanner.nextInt();
                        System.out.println("Digite seu Salário: ");
                        salario = scanner.nextDouble();

                        scanner.nextLine();

                        empregado.add(new Empregado(cpf, idade, salario));
                        break;

                    }
                    break;

                case 2:
                    System.out.println("\n\nEmpregados já cadastrados");

                    for (Empregado emp : empregado) {
                        System.out.println("- " + emp.mostraDados());
                    }
                    break;

                case 3:
                    System.out.println("\n\nBuscando CPF");
                    System.out.println("Digite o CPF: ");
                    cpf = scanner.next();

                    scanner.nextLine();

                    Empregado emp = buscarCpf(cpf, empregado);

                    if (emp != null) {
                        System.out.println("- " + emp);
                    } else {
                        System.out.println("Empregado não encontrado!!!");
                    }
                    break;

                case 4:
                    System.out.println("\n\nMaiores salários:");
                    salario = scanner.nextDouble();

                    for (Empregado e : empregado) {
                        if (e.getSalario() > salario) {
                            System.out.println("- " + e);
                        }
                    }
                    break;

                case 5:
                    Collections.sort(empregado);
                    System.out.println("Empregados ordenados");
                    for(Empregado em : empregado){
                        System.out.println("- " +em.mostraDados());
                    }
                    break;

                case 6:
                    System.out.println("Programa finalizado...");
                    break;

            }

        } while (op != 0);
    }

    private static Empregado buscarCpf(String cpf, ArrayList<Empregado> empregado) {
        for (Empregado emp : empregado) {
            if (emp.getCpf().equals(cpf)) {
                return emp;
            }
        }
    return null;
    }
   

}