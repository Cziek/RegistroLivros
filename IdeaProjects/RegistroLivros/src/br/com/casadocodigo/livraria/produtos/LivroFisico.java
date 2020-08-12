package br.com.casadocodigo.livraria.produtos;

import br.com.casadocodigo.livraria.Autor;


public class LivroFisico extends Livros implements Promocional {

    public LivroFisico(Autor autor) {
        super(autor);
    }

    public double gettaxaImpressao() {
        return this.getValor()*0.05;
    }

    @Override
    public Boolean aplicaDescontoDe(double porcentagem) {
        if (porcentagem > 0.3)
            return false;
        double desconto = getValor() * porcentagem;
        setValor(getValor() - desconto);
        System.out.println("aplicando desconto no LivroFisico");
        return true;
    }
}
