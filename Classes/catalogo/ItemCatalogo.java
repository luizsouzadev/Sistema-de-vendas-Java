package catalogo;

import produtos.Produto;

public class ItemCatalogo extends Catalogo {
    private Produto produto;
    private int quantidade;
    private float preco;

    public ItemCatalogo(Produto produto, int quantidade, float preco) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public float getPreco() {
        return preco;
    }

    public float calcularPrecoTotal() {
        return quantidade * preco;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
