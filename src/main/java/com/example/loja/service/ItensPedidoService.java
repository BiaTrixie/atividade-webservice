package com.example.loja.service;

import com.example.loja.dto.ItensPedidoDto;
import com.example.loja.dto.PedidoDto;
import com.example.loja.interfaces.IService;
import com.example.loja.repository.ItensPedidoRepository;
import com.example.loja.repository.PedidoRepository;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class ItensPedidoService implements IService<ItensPedidoDto, Integer>{

    final ItensPedidoRepository ItensPedidoRepository;

    public ItensPedidoService(ItensPedidoRepository ItensPedidoRepository) {
        this.ItensPedidoRepository = ItensPedidoRepository;
    }

    /**
     * Esse metodo é para cadastrar os itens pedido
     *
     * @param entity
     * @return
     */
    @Override
    public ItensPedidoDto create(ItensPedidoDto entity) {
        log.info("ItensPedidoService::create");
        return null;
    }

    /**
     * Esse metodo exibe somente uma lista de items
     * @param id
     * @return
     */
    @Override
    public ItensPedidoDto read(Integer id) {
        log.info("ItensPedidoService::read(id)");
        return null;
    }

    /**
     * Esse metodo exibe todas os itenspedidos
     * @return
     */
    @Override
    public List<ItensPedidoDto> read() {
        log.info("ItensPedidoService::read()");
        return List.of();
    }

    /**
     * Esse metodo atualiza a lista
     * @param id
     * @param entity
     * @return
     */
    @Override
    public ItensPedidoDto update(Integer id, ItensPedidoDto entity) {
        log.info("ItensPedido::update(id,entity");
        return null;
    }

    /**
     * Esse metodo deleta um itenspedido
     * @param id
     */
    @Override
    public void delete(Integer id) {
        log.info("ItensPedido::delete(id)");

    }
}
