package br.com.casadocodigo.livraria.produtos;

import br.com.casadocodigo.livraria.Autor;

//A classe ebook herda todos os atributos de livro e ainda possui atributos próprios
public class Ebook extends Livros implements Promocional {
    private String waterMark;

    //devido ao Livro possui um construtor obrigando um autor essa característica tbm é herdada aqui
    public Ebook(Autor autor) {
        super(autor); //passa a responsabilidade a superclasse
        this.waterMark = "Valor default Marca d'Água";
    }

    public String getWaterMark() {
        return waterMark;
    }

    public void setWaterMark(String waterMark) {
        this.waterMark = waterMark;
    }

    @Override
    public Boolean aplicaDescontoDe(double porcentagem) {
        if (porcentagem > 0.15)
            return false;
        double desconto = getValor() * porcentagem;
        setValor(getValor()-desconto);
        return true;
    }
}
