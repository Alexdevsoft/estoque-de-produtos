package br.com.estoqueapi.factory;

import br.com.estoqueapi.dto.ProdutoDTO;
import br.com.estoqueapi.entity.Produto;

public class ProdutoFactory {
    public static Produto criarProduto(ProdutoDTO dto) {
        Produto produto = new Produto();
        produto.setNome(dto.getNome());
        produto.setQuantidade(dto.getQuantidade());
        produto.setPreco(dto.getPreco());
        return produto;
    }
}