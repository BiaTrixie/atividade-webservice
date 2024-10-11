package com.example.loja.service;

import com.example.loja.dto.ProdutoDto;
import com.example.loja.dto.ProdutoDto;
import com.example.loja.interfaces.IService;
import com.example.loja.repository.ProdutoRepository;
import com.example.loja.repository.ProdutoRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class ProdutoService implements IService<ProdutoDto, Integer>{

    final ProdutoRepository ProdutoRepository;

    public ProdutoService(ProdutoRepository ProdutoRepository) {
        this.ProdutoRepository = ProdutoRepository;
    }

    /**
     * Esse metodo cria um produto
     * @param entity
     * @return
     */
    @Override
    public ProdutoDto create(ProdutoDto entity) {
        log.info("ProdutoService::create");
        return null;
    }

    /**
     * Esse metodo lista somente um produto
     * @param id
     * @return
     */
    @Override
    public ProdutoDto read(Integer id) {
        log.info("ProdutoService::read(id)");
        return null;
    }

    /**
     * Esse metodo lista todos os produtos
     * @return
     */
    @Override
    public List<ProdutoDto> read() {
        log.info("ProdutoService::read()");
        return List.of();
    }

    /**
     * Esse metodo atualiza um produto
     * @param id
     * @param entity
     * @return
     */
    @Override
    public ProdutoDto update(Integer id, ProdutoDto entity) {
        log.info("ProdutoService::update(id,entity");
        return null;
    }

    /**
     * Esse metodo deleta um produto
     * @param id
     */
    @Override
    public void delete(Integer id) {
        log.info("ProdutoService::delete(id)");

    }
}
