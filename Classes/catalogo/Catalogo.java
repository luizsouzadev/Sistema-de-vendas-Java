package catalogo;

import produtos.Produto;

import java.util.ArrayList;
import java.util.List;

public class Catalogo {
    private List<ItemCatalogo> listItem =  new ArrayList<>();

    public void addItem(Produto produto, int quantidade, float preco) {
        this.listItem.add(new ItemCatalogo(produto, quantidade, preco));
    }

    public ItemCatalogo[] getListItem() {
        return listItem.toArray(new ItemCatalogo[0]);
    }
}
