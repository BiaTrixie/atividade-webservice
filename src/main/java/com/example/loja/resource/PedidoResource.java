package com.example.loja.resource;

import com.example.loja.dto.PedidoDto;
import com.example.loja.dto.ProdutoDto;
import com.example.loja.interfaces.IResource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping(value = "/api/v1/pedido" )
public class PedidoResource implements IResource<PedidoDto, Integer> {

    @Override
    @PostMapping(
            produces = {MediaType.APPLICATION_JSON_VALUE},
            consumes = {MediaType.APPLICATION_JSON_VALUE}
    )
    public PedidoDto create(@RequestBody PedidoDto entity) {
        return null;
    }

    @Override
    @GetMapping(
            value="/{id}",
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    public PedidoDto get(@PathVariable Integer id) {
        return null;
    }

    @Override
    @GetMapping(
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    public List<PedidoDto> get() {
        return List.of();
    }

    @Override
    @PutMapping(
            value="/{id}",
            produces = {MediaType.APPLICATION_JSON_VALUE},
            consumes = {MediaType.APPLICATION_JSON_VALUE}
    )
    public PedidoDto update(@PathVariable Integer id,@RequestBody PedidoDto entity) {
        return null;
    }

    @Override
    @DeleteMapping(
            value="/{id}"
    )
    public void delete(@PathVariable Integer id) {

    }
}