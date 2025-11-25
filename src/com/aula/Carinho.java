package com.aula;

/**
 * Representa o carrinho com produtos escolhidos pelo cliente
 * */
public class Carinho {

    /**
     * Calcula o total com base no produto e quantidade
     * @param produto produto a ser adicionado
     * @param quantidade quantidade do produto
     * @return valor total da compra
     * @see Produto#aplicarDesconto(double)
     * */
    public double calcularTotal(Produto produto, int quantidade) {
        return produto.aplicarDesconto(0) * quantidade;
    }
}
