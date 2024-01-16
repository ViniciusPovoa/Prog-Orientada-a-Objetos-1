package com.mycompany.expoob;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Scanner;

public class Expoob {

    public static void main(String[] args) {

        ArrayList<Empregado> empregados = new ArrayList<>();
        Map<String, Empregado> empregadosMap = new HashMap<>();

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
            System.out.println("4) Buscar maiores e menores salarios");
            System.out.println("5) Sair");
            System.out.println("\nEscolha uma das opções acima: ");
            op = scanner.nextInt();
            scanner.nextLine();

            switch (op) {

                case 1:
                    for (int i = 0; i < 5; i++) {
                        System.out.println("\n\n==== CADASTRO DE EMPREGADO ====");
                        System.out.println("\n\nDigite o CPF: ");
                        cpf = scanner.nextLine();
                        System.out.println("\nDigite a idade: ");
                        idade = scanner.nextInt();
                        System.out.println("Digite o salário: ");
                        salario = scanner.nextDouble();

                        scanner.nextLine();
                        Empregado empregado = new Empregado(cpf, idade, salario);
                        empregadosMap.put(cpf, empregado);
                        empregados.add(empregado);
                    }
                    break;

                case 2:
                    System.out.println("\n\n==== EMPREGADOS CADASTRADOS ====");
                    for (Empregado empregado : empregados) {
                        System.out.println(empregado);
                    }
                    break;

                case 3:
                    System.out.println("\n\n==== BUSCA POR CPF ====");
                    System.out.print("Digite o CPF do empregado a ser buscado: ");
                    String cpfBusca = scanner.nextLine();
                    Empregado empregadoBusca = empregadosMap.get(cpfBusca);

                    if (empregadoBusca != null) {
                        System.out.println("Empregado encontrado:");
                        System.out.println("CPF: " + empregadoBusca.getCpf());
                        System.out.println("Idade: " + empregadoBusca.getIdade());
                        System.out.println("Salário: " + empregadoBusca.getSalario());
                    } else {
                        System.out.println("Empregado não encontrado.");
                    }
                    break;

                case 4:
                    System.out.println("\n\n==== Funcionários com Menor e Maior Salários ====");
                    double menorSalario = Double.MAX_VALUE;
                    double maiorSalario = Double.MIN_VALUE;
                    String cpfMenorSalario = null;
                    String cpfMaiorSalario = null;

                    for (Map.Entry<String, Empregado> entry : empregadosMap.entrySet()) {
                        String cpfEmpregado = entry.getKey();
                        Empregado empregado = entry.getValue();
                        double salarioEmpregado = empregado.getSalario();

                        if (salarioEmpregado < menorSalario) {
                            menorSalario = salarioEmpregado;
                            cpfMenorSalario = cpfEmpregado;
                        }

                        if (salarioEmpregado > maiorSalario) {
                            maiorSalario = salarioEmpregado;
                            cpfMaiorSalario = cpfEmpregado;
                        }
                    }

                    System.out.println("CPF do Empregado com menor salário: " + cpfMenorSalario);
                    System.out.println("CPF do Empregado com maior salário: " + cpfMaiorSalario);
                    break;

                case 5:
                    System.out.println("Saindo do programa...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (op != 5);
    }

    private static Empregado buscarCpf(String cpf, ArrayList<Empregado> empregados) {
        for (Empregado empregado : empregados) {
            if (empregado.getCpf().equals(cpf)) {
                return empregado;
            }
        }
        return null;
    }
}
