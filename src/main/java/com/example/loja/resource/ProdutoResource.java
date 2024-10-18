package com.example.loja.resource;

import com.example.loja.dto.ProdutoDto;
import com.example.loja.interfaces.IResource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping(value = "/api/v1/produtos" )
public class ProdutoResource implements IResource<ProdutoDto, Integer> {

    /**
     * Esse método cria um novo produto.
     *
     * @param entity Objeto ProdutoDto contendo os dados do produto a ser criado.
     * @return Retorna o ProdutoDto criado.
     */
    @Override
    @PostMapping(
            produces = {MediaType.APPLICATION_JSON_VALUE},
            consumes = {MediaType.APPLICATION_JSON_VALUE}
    )
    public ProdutoDto create(@RequestBody ProdutoDto entity) {
        return null;
    }

    /**
     * Esse método retorna os detalhes de um produto específico com base no ID fornecido.
     *
     * @param id ID do produto a ser retornado.
     * @return Retorna o ProdutoDto correspondente ao ID fornecido.
     */
    @Override
    @GetMapping(
            value="/{id}",
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    public ProdutoDto get(@PathVariable Integer id) {
        return null;
    }

    /**
     * Esse método retorna a lista de todos os produtos.
     *
     * @return Retorna uma lista de ProdutoDto contendo todos os produtos.
     */
    @Override
    @GetMapping(
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    public List<ProdutoDto> get() {
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
    @PutMapping(
            value="/{id}",
            produces = {MediaType.APPLICATION_JSON_VALUE},
            consumes = {MediaType.APPLICATION_JSON_VALUE}
    )
    public ProdutoDto update(@PathVariable Integer id, @RequestBody ProdutoDto entity) {
        return null;
    }

    /**
     * Esse método exclui um produto específico com base no ID fornecido.
     *
     * @param id ID do produto a ser excluído.
     */
    @Override
    @DeleteMapping(
            value="/{id}"
    )
    public void delete(@PathVariable Integer id) {

    }
}
