package com.example.loja.resource;

import com.example.loja.dto.ItensPedidoDto;
import com.example.loja.dto.PedidoDto;
import com.example.loja.dto.ProdutoDto;
import com.example.loja.interfaces.IResource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping(value = "/api/v1/itenspedido" )
public class ItensPedidoResource implements IResource<ItensPedidoDto, Integer> {

    @Override
    @PostMapping(
            produces = {MediaType.APPLICATION_JSON_VALUE},
            consumes = {MediaType.APPLICATION_JSON_VALUE}
    )
    public  ItensPedidoDto create(@RequestBody  ItensPedidoDto entity) {
        return null;
    }

    @Override
    @GetMapping(
            value="/{id}",
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    public  ItensPedidoDto get(@PathVariable Integer id) {
        return null;
    }

    @Override
    @GetMapping(
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    public List< ItensPedidoDto> get() {
        return List.of();
    }

    @Override
    @PutMapping(
            value="/{id}",
            produces = {MediaType.APPLICATION_JSON_VALUE},
            consumes = {MediaType.APPLICATION_JSON_VALUE}
    )
    public  ItensPedidoDto update(@PathVariable Integer id,@RequestBody  ItensPedidoDto entity) {
        return null;
    }

    @Override
    @DeleteMapping(
            value="/{id}"
    )
    public void delete(@PathVariable Integer id) {

    }
}