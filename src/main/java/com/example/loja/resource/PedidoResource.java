package com.example.loja.resource;

import com.example.loja.dto.PedidoDto;
import com.example.loja.interfaces.IResource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping(value = "/api/v1/pedido" )
public class PedidoResource implements IResource<PedidoDto, Integer> {

    /**
     * Esse método cria um novo pedido.
     *
     * @param entity Objeto PedidoDto que contém os detalhes do pedido a ser criado.
     * @return Retorna o PedidoDto criado.
     */
    @Override
    @PostMapping(
            produces = {MediaType.APPLICATION_JSON_VALUE},
            consumes = {MediaType.APPLICATION_JSON_VALUE}
    )
    public PedidoDto create(@RequestBody PedidoDto entity) {
        return null;
    }

    /**
     * Esse método retorna um pedido específico com base no ID fornecido.
     *
     * @param id ID do pedido a ser retornado.
     * @return Retorna o PedidoDto correspondente ao ID fornecido.
     */
    @Override
    @GetMapping(
            value="/{id}",
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    public PedidoDto get(@PathVariable Integer id) {
        return null;
    }

    /**
     * Esse método retorna a lista de todos os pedidos.
     *
     * @return Retorna uma lista de PedidoDto.
     */
    @Override
    @GetMapping(
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    public List<PedidoDto> get() {
        return List.of();
    }

    /**
     * Esse método atualiza um pedido existente com base no ID fornecido.
     *
     * @param id ID do pedido a ser atualizado.
     * @param entity Objeto PedidoDto contendo os novos dados do pedido.
     * @return Retorna o PedidoDto atualizado.
     */
    @Override
    @PutMapping(
            value="/{id}",
            produces = {MediaType.APPLICATION_JSON_VALUE},
            consumes = {MediaType.APPLICATION_JSON_VALUE}
    )
    public PedidoDto update(@PathVariable Integer id, @RequestBody PedidoDto entity) {
        return null;
    }

    /**
     * Esse método exclui um pedido específico com base no ID fornecido.
     *
     * @param id ID do pedido a ser excluído.
     */
    @Override
    @DeleteMapping(
            value="/{id}"
    )
    public void delete(@PathVariable Integer id) {

    }
}
