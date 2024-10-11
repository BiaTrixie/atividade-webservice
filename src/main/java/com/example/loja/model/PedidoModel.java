package com.example.loja.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;


@Entity
@Table(name = "pedido")
public class PedidoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column( name = "NROPEDIDO")
    private Long NroPedido;

    @Column( name = "DATAPEDIDO")
    private Date DatPedido;
}
