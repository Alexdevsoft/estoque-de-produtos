package br.com.estoqueapi.service;

import br.com.estoqueapi.dto.ProdutoDTO;
import br.com.estoqueapi.entity.Produto;
import br.com.estoqueapi.factory.ProdutoFactory;
import br.com.estoqueapi.repository.ProdutoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository repository;

    public Produto salvarProduto(ProdutoDTO dto) {
        Produto produto = ProdutoFactory.criarProduto(dto);
        return repository.save(produto);
    }

    public List<Produto> listarProdutos() {
        return repository.findAll();
    }

    public void deletarProduto(Long id) {
        repository.deleteById(id);
    }
}