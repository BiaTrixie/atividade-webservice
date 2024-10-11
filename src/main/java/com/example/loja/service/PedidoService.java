package com.example.loja.service;

import com.example.loja.dto.PedidoDto;
import com.example.loja.interfaces.IService;
import com.example.loja.repository.PedidoRepository;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class PedidoService implements IService<PedidoDto, Integer>{

    final PedidoRepository PedidoRepository;

    public PedidoService(PedidoRepository PedidoRepository) {
        this.PedidoRepository = PedidoRepository;
    }


    /**
     * Esse metodo cria um pedido
     * @param entity
     * @return
     */
    @Override
    public PedidoDto create(PedidoDto entity) {
        log.info("PedidoService::create");
        return null;
    }

    /**
     * Esse metodo exibe um pedido
     * @param id
     * @return
     */
    @Override
    public PedidoDto read(Integer id) {
        log.info("PedidoService::read(id)");
        return null;
    }

    /**
     * Esse metodo lista todos os pedidos
     * @return
     */
    @Override
    public List<PedidoDto> read() {
        log.info("PedidoService::read()");
        return List.of();
    }

    /**
     * Esse metodo atualiza um pedido
     * @param id
     * @param entity
     * @return
     */
    @Override
    public PedidoDto update(Integer id, PedidoDto entity) {
        log.info("PedidoService::update(id,entity");
        return null;
    }

    /**
     * Esse metodo deleta um pedido
     * @param id
     */
    @Override
    public void delete(Integer id) {
        log.info("PedidoService::delete(id)");

    }
}
