package com.example.loja.resource;

import com.example.loja.dto.ItensPedidoDto;
import com.example.loja.interfaces.IResource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping(value = "/api/v1/itenspedido" )
public class ItensPedidoResource implements IResource<ItensPedidoDto, Integer> {

    /**
     * Esse método cria um novo item de pedido.
     *
     * @param entity Objeto ItensPedidoDto que contém os detalhes do item de pedido a ser criado.
     * @return Retorna o ItensPedidoDto criado.
     */
    @Override
    @PostMapping(
            produces = {MediaType.APPLICATION_JSON_VALUE},
            consumes = {MediaType.APPLICATION_JSON_VALUE}
    )
    public ItensPedidoDto create(@RequestBody ItensPedidoDto entity) {
        return null;
    }

    /**
     * Esse método retorna um item de pedido específico com base no ID fornecido.
     *
     * @param id ID do item de pedido a ser retornado.
     * @return Retorna o ItensPedidoDto correspondente ao ID fornecido.
     */
    @Override
    @GetMapping(
            value="/{id}",
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    public ItensPedidoDto get(@PathVariable Integer id) {
        return null;
    }

    /**
     * Esse método retorna a lista de todos os itens de pedido.
     *
     * @return Retorna uma lista de ItensPedidoDto.
     */
    @Override
    @GetMapping(
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    public List<ItensPedidoDto> get() {
        return List.of();
    }

    /**
     * Esse método atualiza um item de pedido existente com base no ID fornecido.
     *
     * @param id ID do item de pedido a ser atualizado.
     * @param entity Objeto ItensPedidoDto contendo os novos dados do item de pedido.
     * @return Retorna o ItensPedidoDto atualizado.
     */
    @Override
    @PutMapping(
            value="/{id}",
            produces = {MediaType.APPLICATION_JSON_VALUE},
            consumes = {MediaType.APPLICATION_JSON_VALUE}
    )
    public ItensPedidoDto update(@PathVariable Integer id, @RequestBody ItensPedidoDto entity) {
        return null;
    }

    /**
     * Esse método exclui um item de pedido específico com base no ID fornecido.
     *
     * @param id ID do item de pedido a ser excluído.
     */
    @Override
    @DeleteMapping(
            value="/{id}"
    )
    public void delete(@PathVariable Integer id) {

    }
}
