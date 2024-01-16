/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.teste;

public class Dvds extends Informacoes{
    
    private String atores;
    private String diretor;
    private int tempo;
    private String genero;
    private int faixas;
    
 public Dvds(String nome, String tipo, String genero, int preco, String atores, String diretor, int tempo) {
    super(nome, tipo, genero, preco);
    this.atores = atores;
    this.diretor = diretor;
    this.tempo = tempo;

}
 
 public String getAtores() {
    return atores;
}

public void setAtores(String atores) {
    this.atores = atores;
}

public String getDiretor() {
    return diretor;
}

public void setDiretor(String diretor) {
    this.diretor = diretor;
}

public int getTempo() {
    return tempo;
}

public void setTempo(int tempo) {
    this.tempo = tempo;
}

public int getFaixas() {
    return faixas;
}


 public void getDvds() {
    System.out.println("Nome : " + getNome());
    System.out.println("Tipo : " + getTipo());
    System.out.println("Genero : " + getGenero());
    System.out.println("Preco : " + getPreco());
    System.out.println("Atores : " + getAtores());
    System.out.println("Diretor : " + getDiretor());
    System.out.println("Tempo : " + getTempo());
    System.out.println();
}
}


