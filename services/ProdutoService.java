package services;

import java.util.ArrayList;
import java.util.List;

import entities.Produto;

public class ProdutoService {
    private static List<Produto> listaProdutos = new ArrayList<>(
        List.of(
            new Produto(1, "ZOTAC RTX 2060 6GB", 2500.00),
            new Produto(2, "ZOTAC RTX 3060 Ti 8GB", 3282.34),
            new Produto(3, "ZOTAC RTX 4070 Ti 12GB", 8235.28)
        )
    );

    public List<Produto> findAll() {
        return listaProdutos;
    }
    public Produto findById(int id) {
        for (Produto produto : listaProdutos) {
            if (produto.getId() == id)
                return produto;
        }
        return null;
    }
}
