package br.com.casadocodigo.livraria.produtos;

import br.com.casadocodigo.livraria.Autor;

public abstract class Livros implements Produto {
    //Objetos da classe encapsulados
    private String nome;
    private String descricao;
    private double valor;
    private String isbn;
    private Autor autor;

    // setters, getters e outros métodos
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao(){
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Autor getAutor(){
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }


    public void mostrarDetalhes(){
        System.out.println("Mostrando detalhes do Livro");
        System.out.println("Nome: " +nome);
        System.out.println("Descrição: " +descricao);
        System.out.println("ISBN: " +isbn);
        System.out.println("Valor: " +valor);

        if (this.temAutor()) {
            autor.mostrarDetalhes();
        }
    }

    //public abstract Boolean aplicaDescontoDe(double porcentagem);

    //Crontrutor da classe "Livro" que recebe um autor como parâmero obrigando que
    //todo livro tenha um autor
    public Livros(Autor autor) {
        this.autor = autor;
        this.isbn = "000-00-000000-00-0"; //valor padrão do ISBN
    }

    //Crontrutor da classe "Livro" (overloaded) que não recebe nenhum parâmetro
    //Será comentando, pois a regra de negócio exige que um autor por livro
    //public Livro() { }

    public Boolean temAutor() {
        //verifica se o valor do autor é null e retorna um boolean
        return this.autor != null;
    }
}
