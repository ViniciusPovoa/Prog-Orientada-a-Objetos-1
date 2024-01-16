/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio3;


public class Circulo {
    
    private double raio;
    private String nome;
    private Ponto ctr;
    private double area;
    
    public void setCentro(Ponto centro){
        this.ctr = ctr;
    }
    
    public Ponto getCentro(){
        return ctr;
    }
    
    public void setRaio(double r){
        if(r>0)
            raio=r;
    }
    
    public double getRaio(){
        return raio;
    }
    
    public void exibeDados(){
        System.out.println("Raio:"+getRaio());
    }
    
    public double diametro(){
        return raio * 2;
    }
    
    public double calcArea(){
    return area =  Math.PI * raio * raio;
    }
    
    public double perimetro(){
        return 2*Math.PI*raio;
    }
    
    public void setNome(String nome) {
        if(!nome.trim().isEmpty())
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    
}
    
    
    
    

    
