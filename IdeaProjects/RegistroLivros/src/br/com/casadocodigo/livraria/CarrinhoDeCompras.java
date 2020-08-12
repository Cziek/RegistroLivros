package br.com.casadocodigo.livraria;

import br.com.casadocodigo.livraria.produtos.Produto;
import br.com.casadocodigo.livraria.produtos.Revista;

public class CarrinhoDeCompras {
    private double total;

    //As subclasses de Livro serão aceitas nesse método, trata-se de uma abstração
    // Abstração: quando nos referimos a uma subclasse com a referência a superclasse
    public void adiciona(Produto produto) {
        System.out.println("Adicionando: " +produto);
        total += produto.getValor();
    }

    public void adiciona(Revista revista) {
        System.out.println("Adicionando: " +revista);
        total += revista.getValor();
    }

    public double getTotal() {
        return total;
    }
}
