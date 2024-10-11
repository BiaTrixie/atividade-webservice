package com.example.loja.model;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name = "itenspedido")
public class ItensPedidoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column( name = "QTDEITEM")
    private Double QtdeItem;

    @Column( name = "VALORUNIDADE")
    private Double ValUnidade;
}
