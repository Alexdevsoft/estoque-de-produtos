package br.com.estoqueapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.estoqueapi.entity.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}