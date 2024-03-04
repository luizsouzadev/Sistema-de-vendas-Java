package main;

import carrinho.Carrinho;
import catalogo.Catalogo;
import catalogo.ItemCatalogo;
import produtos.ProdutoCombo;
import produtos.ProdutoSimples;

public class MainCatalogo {
    public static void main(String[] args) {
        Catalogo catalogo = new Catalogo();
        Carrinho carrinho = new Carrinho();

        // Criação dos Produtos Simples
        ProdutoSimples sabonete = new ProdutoSimples("Sabonete Líquido", 00);
        ProdutoSimples perfume = new ProdutoSimples("Perfume Francês", 01);
        ProdutoSimples hidratante = new ProdutoSimples("Hidratante de Pele", 02);
        ProdutoSimples baseLiquida = new ProdutoSimples("Base Líquida", 03);

        // Criação dos Combos
        ProdutoCombo doisPerfumesMaisBase = new ProdutoCombo("Dois Perfumes mais uma Base", 04);
        doisPerfumesMaisBase.addProduto(2, perfume);
        doisPerfumesMaisBase.addProduto(1, baseLiquida);


        // Adicionar ao catálogo (preço)
        catalogo.addItem(sabonete, 1, 10);
        catalogo.addItem(perfume, 1, 50);
        catalogo.addItem(hidratante, 1, 25);
        catalogo.addItem(baseLiquida, 1, 40);
        catalogo.addItem(doisPerfumesMaisBase, 1, 120);

        // Adicionar itens ao carrinho
        carrinho.adicionarItem(catalogo.getListItem()[4], 1);
        carrinho.adicionarItem(catalogo.getListItem()[3], 2);
        carrinho.adicionarItem(catalogo.getListItem()[2], 4);

        //Verificando os itens adicionados ao carrinho
        carrinho.imprimirDetalhesCarrinho();

        // Calcular o total da compra
        float totalCompra = carrinho.calcularTotalCompra();
        System.out.println("Total da compra: " + totalCompra);
    }
}
