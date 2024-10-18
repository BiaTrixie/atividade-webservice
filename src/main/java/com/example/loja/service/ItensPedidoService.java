package com.example.loja.service;

import com.example.loja.dto.ItensPedidoDto;
import com.example.loja.interfaces.IService;
import com.example.loja.repository.ItensPedidoRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class ItensPedidoService implements IService<ItensPedidoDto, Integer> {

    final ItensPedidoRepository itensPedidoRepository;

    public ItensPedidoService(ItensPedidoRepository itensPedidoRepository) {
        this.itensPedidoRepository = itensPedidoRepository;
    }

    /**
     * Esse método é responsável por cadastrar um novo item de pedido.
     *
     * @param entity Objeto ItensPedidoDto contendo os dados do item de pedido a ser cadastrado.
     * @return Retorna o ItensPedidoDto criado.
     */
    @Override
    public ItensPedidoDto create(ItensPedidoDto entity) {
        log.info("ItensPedidoService::create");
        return null;
    }

    /**
     * Esse método retorna os detalhes de um item de pedido específico com base no ID fornecido.
     *
     * @param id ID do item de pedido a ser retornado.
     * @return Retorna o ItensPedidoDto correspondente ao ID fornecido.
     */
    @Override
    public ItensPedidoDto read(Integer id) {
        log.info("ItensPedidoService::read(id)");
        return null;
    }

    /**
     * Esse método retorna a lista de todos os itens de pedido.
     *
     * @return Retorna uma lista de ItensPedidoDto contendo todos os itens de pedido.
     */
    @Override
    public List<ItensPedidoDto> read() {
        log.info("ItensPedidoService::read()");
        return List.of();
    }

    /**
     * Esse método atualiza os dados de um item de pedido existente com base no ID fornecido.
     *
     * @param id ID do item de pedido a ser atualizado.
     * @param entity Objeto ItensPedidoDto contendo os novos dados do item de pedido.
     * @return Retorna o ItensPedidoDto atualizado.
     */
    @Override
    public ItensPedidoDto update(Integer id, ItensPedidoDto entity) {
        log.info("ItensPedidoService::update(id,entity)");
        return null;
    }

    /**
     * Esse método exclui um item de pedido específico com base no ID fornecido.
     *
     * @param id ID do item de pedido a ser excluído.
     */
    @Override
    public void delete(Integer id) {
        log.info("ItensPedidoService::delete(id)");
    }
}
