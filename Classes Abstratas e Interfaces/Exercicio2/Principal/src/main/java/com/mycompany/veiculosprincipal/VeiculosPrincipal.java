package com.mycompany.veiculosprincipal;

public class VeiculosPrincipal {

    public static void main(String[] args) {

        Veiculo v[] = new Veiculo[5];

        v[0] = new Carro("Fiat", "Palio", "Azul", 150);
        v[1] = new Moto("Honda", "CB1000", "Preto", 300);
        v[2] = new Carro("Volkswagen", "Golf", "Vermelho", 200);
        v[3] = new Moto("Honda", "Titan 150", "Rosa", 110);
        v[4] = new Carro("Chevrolet", "Corsa", "Amarelo", 180);

        int pMaior = 0;
        int pMenor = 500;
        String menosPotente = null;
        String maisPotente = null;

        for (int i = 0; i < 5; i++) {
            System.out.println("(" + i + ")" + v[i].mostraDados());
            if (v[i].cor().equals("Vermelho")) {
                if (v[i].potencia() > pMaior) {
                    pMaior = v[i].potencia();
                    maisPotente = v[i].marca();
                }
                if (v[i].potencia() < pMenor) {
                    pMenor = v[i].potencia();
                    menosPotente = v[i].marca();
                }

            }

        }

        System.out.println("\nO veiculo da marca: " + maisPotente + " com potencia de: " + pMaior + " é o veiculo de maior potencia");
        System.out.println("\nO veiculo da marca: " + menosPotente + " com potencia de: " + pMenor + " é o veiculo de menor potencia");

    }
}
