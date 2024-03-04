package carrinho;

import catalogo.ItemCatalogo;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private List<ItemCatalogo> itens = new ArrayList<>();

    public void adicionarItem(ItemCatalogo item, int quantidade) {
        item.setQuantidade(quantidade); // Define a quantidade do item
        itens.add(item);
    }

    public void removerItem(ItemCatalogo item) {
        itens.remove(item);
    }

    public void imprimirDetalhesCarrinho() {
        System.out.println("Detalhes do Carrinho:");
        for (ItemCatalogo item : itens) {
            String nome = item.getProduto().getNome();
            int id = item.getProduto().getId();
            int quantidade = item.getQuantidade();
            float valor = item.getPreco();

            System.out.println();
            System.out.println("Nome: " + nome);
            System.out.println("ID: " + id);
            System.out.println("Quantidade: " + quantidade);
            System.out.println("Valor: " + valor);
            System.out.println(); // Adiciona uma linha em branco entre os itens
        }
    }


    public float calcularTotalCompra() {
        float total = 0;
        for (ItemCatalogo item : itens) {
            total += item.calcularPrecoTotal();
        }
        return total;
    }



}
