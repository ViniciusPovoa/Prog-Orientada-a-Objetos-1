
package com.mycompany.contatos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;


public class GestaoContatos implements Serializable {
    
    ArrayList<Contatos> familia = new ArrayList<>();
    ArrayList<Contatos> amigos = new ArrayList<>();
    ArrayList<Contatos> profissional = new ArrayList<>();
    
    
    
    public void adicionaContato(Contatos contato, char categoria) throws CategoriaInvalidaException {
         ArrayList<Contatos> lista;

        switch (categoria) {
            case 'f':
                lista = familia;
                break;
            case 'a':
                lista = amigos;
                break;
            case 'p':
                lista = profissional;
                break;
            default:
                throw new CategoriaInvalidaException("==== CATEGORIA INVÁLIDA! TENTE NOVAMENTE! ====");
        }

        lista.add(contato);
    }
    
    public void eliminaContato(String nome) throws ContatoNaoEncontradoException{
         boolean encontrado = false;
    
    
     for (ArrayList<Contatos> lista : new ArrayList[]{familia, amigos, profissional}) {
            for (Contatos contato : lista) {
                if (contato.getNome().equalsIgnoreCase(nome)) {
                    lista.remove(contato);
                    encontrado = true;
                    break;
                }
            }
        }

        if (!encontrado) {
            throw new ContatoNaoEncontradoException("O CONTATO '" + nome + "' NÃO FOI ENCONTRADO! TENTE NOVAMENTE!");
        }
    }

    public ArrayList<Contatos> listaContatos(char categoria) throws CategoriaInvalidaException {
        ArrayList<Contatos> lista;

        switch (categoria) {
            case 'f':
                lista = familia;
                break;
            case 'a':
                lista = amigos;
                break;
            case 'p':
                lista = profissional;
                break;
            default:
                throw new CategoriaInvalidaException("==== CATEGORIA INVÁLIDA! TENTE NOVAMENTE ====");
        }

        return lista;
    }


    @Override
     public String toString() {
    String string = "Familia:\n";
    for (Contatos contato : familia) {
        string += contato.toString() + "\n";
    }
    string += "\nAmigos:\n";
    for (Contatos contato : amigos) {
        string += contato.toString() + "\n";
    }
    string += "\nProfissional:\n";
    for (Contatos contato : profissional) {
        string += contato.toString() + "\n";
    }
    return string;
}
    
      public Contatos maisVelho() {
        Contatos maisVelho = null;

        for (ArrayList<Contatos> listaContatos : Arrays.asList(familia, amigos, profissional)) {
            for (Contatos contato : listaContatos) {
                if (maisVelho == null || contato.getIdade() > maisVelho.getIdade()) {
                    maisVelho = contato;
                }
            }
        }

        return maisVelho;
    }
     
     public Contatos maisNovo() {
        Contatos maisNovo = null;

        for (ArrayList<Contatos> listaContatos : Arrays.asList(familia, amigos, profissional)) {
            for (Contatos contato : listaContatos) {
                if (maisNovo == null || contato.getIdade() < maisNovo.getIdade()) {
                    maisNovo = contato;
                }
            }
        }

        return maisNovo;
    }
    
    
}
