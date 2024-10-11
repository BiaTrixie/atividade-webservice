package com.example.loja.dto;

import lombok.Data;

import java.util.Date;

@Data
public class PedidoDto {
    private Integer id;

    private Long NroPedido;

    private Date DatPedido;

}
