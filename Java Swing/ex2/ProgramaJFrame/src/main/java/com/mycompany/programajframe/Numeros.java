//Vinícius Horácio Marques Póvoa

package com.mycompany.programajframe;


public class Numeros {
    
    private int numeros, maior, menor, media, numRepetidos;

    public Numeros(int numeros, int maior, int menor, int media) {
        this.numeros = numeros;
        this.maior = maior;
        this.menor = menor;
        this.media = media;
        
    }

    public int getNumeros() {
        return numeros;
    }

    public int getMaior() {
        return maior;
    }

    public int getMenor() {
        return menor;
    }

    public int getMedia() {
        return media;
    }

    

    public void setNumeros(int numeros) {
        this.numeros = numeros;
    }

    public void setMaior(int maior) {
        this.maior = maior;
    }

    public void setMenor(int menor) {
        this.menor = menor;
    }

    public void setMedia(int media) {
        this.media = media;
    }

}
