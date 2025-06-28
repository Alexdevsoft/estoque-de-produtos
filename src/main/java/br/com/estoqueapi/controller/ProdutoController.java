package br.com.estoqueapi.controller;

import br.com.estoqueapi.dto.ProdutoDTO;
import br.com.estoqueapi.entity.Produto;
import br.com.estoqueapi.service.ProdutoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService service;

    @PostMapping
    public Produto criar(@RequestBody ProdutoDTO dto) {
        return service.salvarProduto(dto);
    }

    @GetMapping
    public List<Produto> listar() {
        return service.listarProdutos();
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletarProduto(id);
    }
}