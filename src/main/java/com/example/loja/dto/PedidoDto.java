package com.example.loja.dto;

import lombok.Data;
import java.util.Date;

@Data
public class PedidoDto {

    /**
     * ID único do pedido.
     */
    private Integer id;

    /**
     * Número identificador do pedido.
     */
    private Long nroPedido;

    /**
     * Data em que o pedido foi realizado.
     */
    private Date datPedido;
}
