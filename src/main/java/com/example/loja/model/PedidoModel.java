package com.example.loja.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "pedido")
public class PedidoModel {

    /**
     * ID único do pedido, gerado automaticamente pelo banco de dados.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    /**
     * Número do pedido.
     */
    @Column(name = "NROPEDIDO")
    private Long nroPedido;

    /**
     * Data em que o pedido foi realizado.
     */
    @Column(name = "DATAPEDIDO")
    private Date datPedido;

}
