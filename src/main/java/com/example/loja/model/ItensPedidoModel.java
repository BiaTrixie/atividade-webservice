package com.example.loja.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "itenspedido")
public class ItensPedidoModel {

    /**
     * ID único do item do pedido, gerado automaticamente pelo banco de dados.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    /**
     * Quantidade do item no pedido.
     */
    @Column(name = "QTDEITEM")
    private Double qtdeItem;

    /**
     * Valor unitário do item no pedido.
     */
    @Column(name = "VALORUNIDADE")
    private Double valUnidade;
}
