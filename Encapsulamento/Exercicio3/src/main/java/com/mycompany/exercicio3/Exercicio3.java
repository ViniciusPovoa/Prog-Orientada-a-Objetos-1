
package com.mycompany.exercicio3;


import java.util.Scanner;

class Exercicio3 {

    public static void main(String[] args) {
       Ponto p = new Ponto();
       Circulo ctr = new Circulo();
       Scanner sc = new Scanner(System.in);
       
       ctr.setRaio(5);
       p.setX(10);
       p.setY(5);
       
       System.out.println("Dê um nome para seu círculo");
       String nome = sc.next();
       ctr.setNome(nome);

       
       System.out.println("============================================");
       System.out.println("Dados do circulo de raio: " +ctr.getRaio());
       System.out.println("Nome do circulo: "+ctr.getNome());
       System.out.println("Diâmetro: " +ctr.diametro());
       System.out.println("Circunferencia: "+ctr.perimetro());
       System.out.println("Area: " +ctr.calcArea());
       System.out.println("============================================");
    }
}