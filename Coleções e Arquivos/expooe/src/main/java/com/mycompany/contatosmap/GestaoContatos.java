
package com.mycompany.contatosmap;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.TreeMap;


public class GestaoContatosTreeMap implements Serializable {
    
   TreeMap<Character, ArrayList<ContatosTreeMap>> contatosPorCategoria;

    public GestaoContatosTreeMap() {
        contatosPorCategoria = new TreeMap<>();
    }
    
    
    public void adicionaContato(ContatosTreeMap contato, char categoria) throws CategoriaInvalidaException {
          if (categoria == 'f' || categoria == 'a' || categoria == 'p') {
            ArrayList<ContatosTreeMap> lista = contatosPorCategoria.get(categoria);
            if (lista == null) {
                lista = new ArrayList<>();
                contatosPorCategoria.put(categoria, lista);
            }
            
            lista.add(contato);
        
          } else {
            throw new CategoriaInvalidaException("CATEGORIA INVÁLIDA! TENTE NOVAMENTE!");
        }
    }
    
    
    public void eliminaContato(String nome) throws ContatoNaoEncontradoException {
        boolean encontrado = false;

        for (ArrayList<ContatosTreeMap> listaContatos : contatosPorCategoria.values()) {
            for (ContatosTreeMap contato : listaContatos) {
                if (contato.getNome().equalsIgnoreCase(nome)) {
                    listaContatos.remove(contato);
                    encontrado = true;
                    break;
                }
            }
            if (encontrado) {
                break;
            }
        }

        if (!encontrado) {
            throw new ContatoNaoEncontradoException("O CONTATO '" + nome + "' NÃO FOI ENCONTRADO! TENTE NOVAMENTE!");
        }
    }


     public TreeMap<Character, ArrayList<ContatosTreeMap>> listaContatos()  throws CategoriaInvalidaException {
        return contatosPorCategoria;
    }
     
     
     
    
       public ContatosTreeMap maisVelho() {
        ContatosTreeMap maisVelho = null;
        for (ArrayList<ContatosTreeMap> listaContatos : contatosPorCategoria.values()) {
            for (ContatosTreeMap contato : listaContatos) {
                if (maisVelho == null || contato.getIdade() > maisVelho.getIdade()) {
                    maisVelho = contato;
                }
            }
        }
        return maisVelho;
    }
       
       
       
      public ContatosTreeMap maisNovo() {
        ContatosTreeMap maisNovo = null;
        for (ArrayList<ContatosTreeMap> listaContatos : contatosPorCategoria.values()) {
            for (ContatosTreeMap contato : listaContatos) {
                if (maisNovo == null || contato.getIdade() < maisNovo.getIdade()) {
                    maisNovo = contato;
                }
            }
        }
        return maisNovo;
      }
    
    
}