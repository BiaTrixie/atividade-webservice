package com.example.loja.service;

import com.example.loja.dto.ProdutoDto;
import com.example.loja.interfaces.IService;
import com.example.loja.repository.ProdutoRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class ProdutoService implements IService<ProdutoDto, Integer> {

    final ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    /**
     * Esse método cria um novo produto.
     *
     * @param entity Objeto ProdutoDto contendo os dados do produto a ser criado.
     * @return Retorna o ProdutoDto criado.
     */
    @Override
    public ProdutoDto create(ProdutoDto entity) {
        log.info("ProdutoService::create");
        return null;
    }

    /**
     * Esse método retorna os detalhes de um produto específico com base no ID fornecido.
     *
     * @param id ID do produto a ser retornado.
     * @return Retorna o ProdutoDto correspondente ao ID fornecido.
     */
    @Override
    public ProdutoDto read(Integer id) {
        log.info("ProdutoService::read(id)");
        return null;
    }

    /**
     * Esse método retorna a lista de todos os produtos.
     *
     * @return Retorna uma lista de ProdutoDto contendo todos os produtos.
     */
    @Override
    public List<ProdutoDto> read() {
        log.info("ProdutoService::read()");
        return List.of();
    }

    /**
     * Esse método atualiza os dados de um produto existente com base no ID fornecido.
     *
     * @param id ID do produto a ser atualizado.
     * @param entity Objeto ProdutoDto contendo os novos dados do produto.
     * @return Retorna o ProdutoDto atualizado.
     */
    @Override
    public ProdutoDto update(Integer id, ProdutoDto entity) {
        log.info("ProdutoService::update(id,entity)");
        return null;
    }

    /**
     * Esse método exclui um produto específico com base no ID fornecido.
     *
     * @param id ID do produto a ser excluído.
     */
    @Override
    public void delete(Integer id) {
        log.info("ProdutoService::delete(id)");
    }
}
