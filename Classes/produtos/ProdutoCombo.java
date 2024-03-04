package produtos;

import java.util.ArrayList;
import java.util.List;

public class ProdutoCombo extends Produto {
    private List<ItemProdutoCombo> listItemProdutoCombo = new ArrayList<>();

    public ProdutoCombo(String nome, int id) {
        super(nome, id);
    }

    public void addProduto(int quantidade, ProdutoSimples produto) {
        this.listItemProdutoCombo.add(new ItemProdutoCombo(quantidade, produto));
    }
}