
package com.mycompany.exercicio2;

public class Exercicio2 {

    public static void main(String[] args) {
        Ponto p1 = new Ponto();
        Ponto p2 = new Ponto();
        p1.setX(3);
        p1.setY(5);
        p2.setX(4);
        p2.setY(6);
        
        
        System.out.println("A  distancia entre p1 e p2 eh: " +p1.distancia(p2));
        
              
    }
}
