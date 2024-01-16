
package com.mycompany.produtosprincipal;


public class Cafe implements Produto {
    
     private String id;
    private int anoProducao;
    private int unidadeVenda;
    private String categoria;
    private double preco;

    public Cafe(String id, int anoProducao, int unidadeVenda, String categoria, double preco) {
        this.id = id;
        this.anoProducao = anoProducao;
        this.unidadeVenda = unidadeVenda;
        this.categoria = categoria;
        this.preco = preco;
    }
    
    @Override
    public String getId(){
        return id;
    }

    @Override
    public int getAnoProducao() {
        return anoProducao;
    }

    @Override
    public int getUnidadeVenda() {
        return unidadeVenda;
    }

    @Override
    public String getCategoria() {
        return categoria;
    }

    @Override
    public double getPreco() {
        return preco;
    }
    
    @Override
    public String mostraDados(){
        return "\nID: " +id+ "\nAno de Produção: " +anoProducao+ "\nUnidade de Venda: " +unidadeVenda+ "\nCategoria: " +categoria+ "\nPreço: " +preco;
    }
    
           
}
