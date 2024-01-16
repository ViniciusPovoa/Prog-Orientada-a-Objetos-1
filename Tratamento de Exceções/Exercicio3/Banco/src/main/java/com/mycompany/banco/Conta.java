package com.mycompany.programaconta;

public class Conta {

    private String nome;
    private double saldo;
    private int numeroDaConta;
    private int idade;

    public Conta(String nome, int idade, int numeroDaConta, double saldo) throws ClienteException {
        this.nome = nome;
        this.saldo = saldo;
        this.idade = idade;
        this.numeroDaConta = numeroDaConta;

    }

    public String getNome() {
        return nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setNumeroDaConta(int numero) {
        this.numeroDaConta = numeroDaConta;
    }

    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor > this.saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente para realizar a operação!");
        } else {
            this.saldo -= valor;
            System.out.println("Saque no valor de " + valor + " realizado com sucesso!");
        }
    }

    public void depositar(double valor) throws ValorInvalidoException {
        if (valor <= 0) {
            throw new ValorInvalidoException("Valor de depósito inválido!");
        } else {
            this.saldo += valor;
            System.out.println("Depósito no valor de " + valor + " realizado com sucesso!");
        }
    }

    public void visualizarSaldo() {
        System.out.println("Saldo atual: " + this.saldo);
    }

    public static int buscarConta(Conta[] c, int numeroDaConta) {
        for (int i = 0; i < c.length; i++) {
            if (c[i] != null && c[i].getNumeroDaConta() == numeroDaConta) {
                return i;
            }
        }
        return -1; 
    }

    public void mostraDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Número da Conta: " + numeroDaConta);
        System.out.println("Saldo: " + saldo);
    }

}
