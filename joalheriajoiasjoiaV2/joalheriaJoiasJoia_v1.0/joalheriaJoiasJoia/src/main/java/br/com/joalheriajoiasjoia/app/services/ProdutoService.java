package br.com.joalheriajoiasjoia.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.joalheriajoiasjoia.app.entities.Produto;
import br.com.joalheriajoiasjoia.app.repositories.ProdutoRepository;

public class ProdutoService {

	@Autowired
	private ProdutoRepository produtoRepository;

	// Adicionar Produto
	public Produto saveProduto(Produto produto) {
		return produtoRepository.save(produto);
	}

	// Buscar Produto
	public List<Produto> getAllProduto() {
		return produtoRepository.findAll();
	}

	// Buscar Produto por ID
	public Produto getProdutoById(Long id) {
		return produtoRepository.findById(id).orElse(null);
	}

	// Deletar Produto
	public void deleteProduto(Long id) {
		produtoRepository.deleteById(id);
	}

}

