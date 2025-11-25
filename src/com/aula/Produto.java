package com.aula;

/**
 * Repersenta um produto para compra.
 * */

public class Produto {

    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    /**
     * Aplica um desconto percentual no preço do produto
     * @param percentual desconto a ser aplicado (0-100)
     * @return preço final após o desconto
     * @throws IllegalArgumentException se o percentual for negativo ou maior que que 100
     * */
    public double aplicarDesconto(double percentual) {
        if (percentual < 0 || percentual > 100) {
            throw new IllegalArgumentException("Percentual Inválido!");
        }
        return preco - (preco * (percentual / 100));
    }
}
