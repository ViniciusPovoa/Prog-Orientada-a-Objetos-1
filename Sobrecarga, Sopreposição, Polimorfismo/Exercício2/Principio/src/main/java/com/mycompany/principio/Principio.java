package com.mycompany.principio;

import java.util.Scanner;

public class Principio {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int op;

        FuncionarioComissionado[] funcc = null;
        FuncionarioNoturno[] funcn = null;

        do {
            System.out.println("Digite a opcao desejada");
            System.out.println("(1) Cadastrar Funcionarios Comissionado");
            System.out.println("(2) Pesquisar Funcionario Comissionado por CPF");
            System.out.println("(3) Cadastrar Funcionarios Noturno");
            System.out.println("(4) Pesquisar Funcionario Noturno por CPF");
            System.out.println("(5) Mostrar maior salário Funcionario Comissionado");
            System.out.println("(6) Mostrar maior salário Funcionario Noturno");
            System.out.println("(7) Mostrar folha de pagamentos");
            op = sc.nextInt();

            switch (op) {

                case 1:
                    System.out.println("Deseja cadastrar quantos funcionarios?");
                    int qtdd = sc.nextInt();

                    funcc = new FuncionarioComissionado[qtdd];

                    for (int i = 0; i < qtdd; i++) {
                        System.out.println("Digite o nome do funcionário: ");
                        String nome = sc.next();
                        System.out.println("Digite o CPF do funcionário: ");
                        int cpf = sc.nextInt();
                        System.out.println("Digite a Matrícula: ");
                        int mat = sc.nextInt();
                        System.out.println("Digite a Idade do funcionário: ");
                        int idade = sc.nextInt();
                        funcc[i] = new FuncionarioComissionado(nome, cpf, mat, idade);
                    }

                    break;

                case 2:
                    if (funcc == null) {
                        System.out.println("Não há funcionários cadastrados.");
                        break;
                    }
                    System.out.println("Digite o CPF do funcionário que deseja buscar:");
                    int cpfBusca = sc.nextInt();
                    boolean encontrado = false;
                    for (FuncionarioComissionado f : funcc) {
                        if (f.getCpf() == cpfBusca) {
                            System.out.println("Funcionário encontrado!");
                            System.out.println("==============================");
                            System.out.println("Nome: " + f.getNome());
                            System.out.println("CPF: " + f.getCpf());
                            System.out.println("Matrícula: " + f.getMatricula());
                            System.out.println("Idade: " + f.getIdade());
                            System.out.println("Salário: " + f.calculaSalario());
                            System.out.println("==============================");

                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Funcionário não encontrado.");
                    }
                    break;

                case 3:
                    System.out.println("Deseja cadastrar quantos funcionarios?");
                    int qtddnoturno = sc.nextInt();

                    funcn = new FuncionarioNoturno[qtddnoturno];

                    for (int i = 0; i < qtddnoturno; i++) {
                        System.out.println("Digite o nome do funcionário: ");
                        String nome = sc.next();
                        System.out.println("Digite o CPF do funcionário: ");
                        int cpf = sc.nextInt();
                        System.out.println("Digite a Matrícula: ");
                        int mat = sc.nextInt();
                        System.out.println("Digite a Idade do funcionário: ");
                        int idade = sc.nextInt();
                        funcn[i] = new FuncionarioNoturno(nome, cpf, mat, idade);
                    }

                    break;

                case 4:
                    if (funcn == null) {
                        System.out.println("Não há funcionários cadastrados.");
                        break;
                    }
                    System.out.println("Digite o CPF do funcionário que deseja buscar:");
                    int cpfBuscan = sc.nextInt();
                    boolean encontradonoturno = false;
                    for (FuncionarioNoturno f : funcn) {
                        if (f.getCpf() == cpfBuscan) {
                            System.out.println("Funcionário encontrado!");
                            System.out.println("==============================");
                            System.out.println("Nome: " + f.getNome());
                            System.out.println("CPF: " + f.getCpf());
                            System.out.println("Matrícula: " + f.getMatricula());
                            System.out.println("Idade: " + f.getIdade());

                            System.out.println("==============================");
                            encontradonoturno = true;
                            break;
                        }
                    }
                    if (!encontradonoturno) {
                        System.out.println("Funcionário não encontrado.");
                    }
                    break;

                case 5:

                    if (funcc == null) {
                        System.out.println("Não há funcionários cadastrados.");
                        break;
                    }

                    int maiorSalarioComissionado = 0;
                    for (FuncionarioComissionado f : funcc) {
                        int salario = f.calculaSalario();
                        if (salario > maiorSalarioComissionado) {
                            maiorSalarioComissionado = salario;
                        }
                    }
                    System.out.println("Maior salário dos funcionários comissionados: " + maiorSalarioComissionado);
                    break;

                case 6:

                    if (funcn == null) {
                        System.out.println("Não há funcionários cadastrados.");
                        break;
                    }

                    int maiorSalarioNoturno = 0;
                    for (FuncionarioNoturno f : funcn) {
                        int salario = f.calculaSalario();
                        if (salario > maiorSalarioNoturno) {
                            maiorSalarioNoturno = salario;
                        }
                    }
                    System.out.println("Maior salário dos funcionários noturnos: " + maiorSalarioNoturno);
                    break;

                case 7:

                    double totalSalarios = 0.0;

                    for (FuncionarioNoturno f : funcn) {
                        System.out.println("======== Noturno ========");
                        System.out.println("Nome: " + f.getNome());
                        System.out.println("CPF: " + f.getCpf());
                        System.out.println("Matrícula: " + f.getMatricula());
                        System.out.println("Idade: " + f.getIdade());
                        double salario = f.calculaSalario();
                        System.out.println("Salário: " + salario);
                        totalSalarios += salario;
                        System.out.println("===================");
                    }

                    for (FuncionarioComissionado f : funcc) {
                        System.out.println("======== COMISSIONADO ========");
                        System.out.println("Nome: " + f.getNome());
                        System.out.println("CPF: " + f.getCpf());
                        System.out.println("Matrícula: " + f.getMatricula());
                        System.out.println("Idade: " + f.getIdade());
                        double salario = f.calculaSalario();
                        System.out.println("Salário: " + salario);
                        totalSalarios += salario;
                        System.out.println("===================");
                    }

                    System.out.println("============ FOLHA DE PAGAMENTO TOTAL ============");
                    System.out.println("Total de salários: " + totalSalarios);

            }
        } while (op != 8);
    }
}
