/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.teste;

/**
 *
 * @author Vinicius
 */
public class Cds extends Informacoes {
    private String cantor;
    private int faixas;
    
    public Cds(String nome, String tipo, String genero, int preco, String cantor, int faixas) {
        super(nome, tipo, genero, preco);
        this.cantor = cantor;
        this.faixas = faixas;
    }
    
    public void getCds(){
    System.out.println("Nome : " + getNome());
    System.out.println("Tipo : " + getTipo());
    System.out.println("Genero : " + getGenero());
    System.out.println("Preco : " + getPreco());
    System.out.println("Cantor : " + getCantor());
    System.out.println("Número de faixas : " + getFaixas()); 
    System.out.println();
        
    }
    
    
    
    public String getCantor() {
        return cantor;
    }
    
    public void setCantor(String cantor) {
        this.cantor = cantor;
    }
    
    public int getFaixas() {
        return faixas;
    }
    
    public void setFaixas(int faixas) {
        this.faixas = faixas;
    }
}
