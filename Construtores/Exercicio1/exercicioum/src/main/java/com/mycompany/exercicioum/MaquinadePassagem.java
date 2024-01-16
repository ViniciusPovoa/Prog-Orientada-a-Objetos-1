package com.mycompany.exercicioum;

import java.util.Scanner;

public class MaquinadePassagem {
    private String id;
    private int valorPassagem;
    private int qtdInserida;
    private int Total;
    
    public MaquinadePassagem(String i, int valor){
       setId(i);
       setValorPassagem(0);
       setqtdInserida(0);
       setTotal(valor);
    }

    public String getId() {
        return id;
    }

    public int getValorPassagem() {
        return valorPassagem;
    }

    public int getqtdInserida() {
        return qtdInserida;
    }

    public int getTotal() {
        return Total;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public void setqtdInserida(int Qtd) {
        this.qtdInserida = qtdInserida;
    }
    
    
    public void setValorPassagem(int valorPassagem) {
        this.valorPassagem = valorPassagem;
    }

 

    public void setTotal(int Total) {
        this.Total = Total;
    }
    public String mostraDados(){
        return "Máquina de Passagens "+id+": \nValor da passagem: "+valorPassagem+"\n"
                + "Quantidade Inserida: "+qtdInserida+"\nTotal Inserido: "+Total;
    }
    public void InserirDinheiro(int v){
        qtdInserida += v;
        Total += v;
        if(qtdInserida < valorPassagem){
            System.out.println("Valor insuficiente. Insira mais"+(valorPassagem - qtdInserida)+".");
        }else{
            qtdInserida -= valorPassagem;
            if(qtdInserida > 0){
                System.out.println("Troco: "+qtdInserida);
                qtdInserida = 0;
            }
        }
    }
    public void emiteTicket(){
        System.out.println("========TICKET========");
    }
}
