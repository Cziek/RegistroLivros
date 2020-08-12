package br.com.casadocodigo.livraria.produtos;

@FunctionalInterface
public interface Promocional {
    Boolean aplicaDescontoDe(double porcentagem);

    default boolean aplicaDescontoDe10Porcento() {
        return aplicaDescontoDe(0.1);
    }
}
