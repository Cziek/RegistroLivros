package br.com.casadocodigo.livraria.teste;

import br.com.casadocodigo.livraria.Autor;
import br.com.casadocodigo.livraria.produtos.LivroFisico;
import br.com.casadocodigo.livraria.produtos.Ebook;

public class CadastroDeLivro {
    public static void main (String[] args) {

        //Instancia do obejto autor e atribuição de valores
        Autor autor = new Autor();
        autor.setNome("Rodrigo Turini");
        autor.setEmail("rodrigo.turini@caelum.com.br");
        autor.setCpf("123.456.789.10");

        //Instanciando um objeto do tipo "Livro" sob nome "livro"
        LivroFisico fisico = new LivroFisico(autor);
        fisico.setNome("Java 8 Prático");
        fisico.setDescricao("Novos Recursos de Linguagem");
        fisico.setIsbn("978-85-66250-46-6");
        fisico.setValor(59.90);


        //Exibe os dados do livro na tela
        fisico.mostrarDetalhes();

        if (!fisico.aplicaDescontoDe(0.1)) {
            System.out.println("Desconto não pode ser maior do que 30%!");
        } else {
            System.out.println("Valor com desconto: "
                    + fisico.getValor());
            System.out.println("--");
        }

        //Instancia do obejto outroAutor e atribuição de valores
        Autor outroAutor = new Autor();
        outroAutor.setNome("Paulo Silveira");
        outroAutor.setEmail("paulo.silveira@caelum.com.br");
        outroAutor.setCpf("123.456.789.10");

        //Instanciando outro objeto do tipo "Livro" sob o nome "outroLivro"
        LivroFisico outroLivro = new LivroFisico(outroAutor);
        outroLivro.setNome("Lógica de Programação");
        outroLivro.setDescricao("Crie seus primeiros programas");
        outroLivro.setIsbn("978-85-66250-22-0");
        outroLivro.setValor(59.90);

        //Exibe os dados do livro na tela e do autor
        outroLivro.mostrarDetalhes();
        outroAutor.mostrarDetalhes();

        Ebook ebook = new Ebook(autor);
        ebook.setNome("Testando Ebook");
        ebook.setDescricao("teste para verificar o retorno de objetos do tipo Ebook");
        ebook.setValor(40.0);
        ebook.setWaterMark("Livro digital");
        ebook.mostrarDetalhes();

        if (!ebook.aplicaDescontoDe(0.3)) {
            System.out.println("Desconto no ebook não pode ser " +
                    "maior do que 15%");
        } else {
            System.out.println("Valor do ebook com desconto: "
                    + ebook.getValor());
        }
    }
}
