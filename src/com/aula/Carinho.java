package com.aula;

/**
 * Representa o carrinho com produtos escolhidos pelo cliente
 * */
public class Carinho {
    public double calcularTotal(Produto produto, int quantidade) {
        return produto.aplicarDesconto(0) * quantidade;
    }
}
