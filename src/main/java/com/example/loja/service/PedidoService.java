package com.example.loja.service;

import com.example.loja.dto.PedidoDto;
import com.example.loja.interfaces.IService;
import com.example.loja.repository.PedidoRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class PedidoService implements IService<PedidoDto, Integer> {

    final PedidoRepository pedidoRepository;

    public PedidoService(PedidoRepository pedidoRepository) {
        this.pedidoRepository = pedidoRepository;
    }

    /**
     * Esse método cria um novo pedido.
     *
     * @param entity Objeto PedidoDto contendo os dados do pedido a ser criado.
     * @return Retorna o PedidoDto criado.
     */
    @Override
    public PedidoDto create(PedidoDto entity) {
        log.info("PedidoService::create");
        return null;
    }

    /**
     * Esse método retorna os detalhes de um pedido específico com base no ID fornecido.
     *
     * @param id ID do pedido a ser retornado.
     * @return Retorna o PedidoDto correspondente ao ID fornecido.
     */
    @Override
    public PedidoDto read(Integer id) {
        log.info("PedidoService::read(id)");
        return null;
    }

    /**
     * Esse método retorna a lista de todos os pedidos.
     *
     * @return Retorna uma lista de PedidoDto contendo todos os pedidos.
     */
    @Override
    public List<PedidoDto> read() {
        log.info("PedidoService::read()");
        return List.of();
    }

    /**
     * Esse método atualiza os dados de um pedido existente com base no ID fornecido.
     *
     * @param id ID do pedido a ser atualizado.
     * @param entity Objeto PedidoDto contendo os novos dados do pedido.
     * @return Retorna o PedidoDto atualizado.
     */
    @Override
    public PedidoDto update(Integer id, PedidoDto entity) {
        log.info("PedidoService::update(id,entity)");
        return null;
    }

    /**
     * Esse método exclui um pedido específico com base no ID fornecido.
     *
     * @param id ID do pedido a ser excluído.
     */
    @Override
    public void delete(Integer id) {
        log.info("PedidoService::delete(id)");
    }
}
