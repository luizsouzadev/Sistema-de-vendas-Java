package produtos;

import produtos.ProdutoSimples;

class ItemProdutoCombo {
    private int quantidade;
    private ProdutoSimples produto;

    ItemProdutoCombo(int quantidade, ProdutoSimples produto) {
        this.quantidade = quantidade;
        this.produto = produto;
    }
}