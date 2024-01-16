
package com.mycompany.expoob;

import java.util.ArrayList;



public class Empregado implements Comparable<Empregado> {

    private String cpf;
    private int idade;
    private double salario;

    public Empregado(String cpf, int idade, double salario) {
        this.cpf = cpf;
        this.idade = idade;
        this.salario = salario;
    }

    public String getCpf() {
        return cpf;
    }

    public int getIdade() {
        return idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String mostraDados(){
        return "\n\nCPF: " +cpf+ "\nIDADE: " +idade+ "\nSALARIO: " +salario;

    }

    @Override
    public int compareTo(Empregado empregado) {
        if (this.idade < empregado.getIdade()) {
            return -1;
        } else if (this.idade > empregado.getIdade()) {
            return 1;
        }
        return 0;
    }



 }
