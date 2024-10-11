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
     * Esse metodo é
     * @param entity
     * @return
     */
    @Override
    @PostMapping(
            produces = {MediaType.APPLICATION_JSON_VALUE},
            consumes = {MediaType.APPLICATION_JSON_VALUE}
    )
    public ProdutoDto create(@RequestBody ProdutoDto entity) {
        return null;
    }

    @Override
    @GetMapping(
            value="/{id}",
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    public ProdutoDto get(@PathVariable Integer id) {
        return null;
    }

    @Override
    @GetMapping(
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    public List<ProdutoDto> get() {
        return List.of();
    }

    @Override
    @PutMapping(
            value="/{id}",
            produces = {MediaType.APPLICATION_JSON_VALUE},
            consumes = {MediaType.APPLICATION_JSON_VALUE}
    )
    public ProdutoDto update(@PathVariable Integer id,@RequestBody ProdutoDto entity) {
        return null;
    }

    @Override
    @DeleteMapping(
            value="/{id}"
    )
    public void delete(@PathVariable Integer id) {

    }
}
