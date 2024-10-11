package com.example.loja.model;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name = "produto")
public class ProdutoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column( name = "QTDEPRODUTOS")
    private Double QtdeProduto;

    @Column( name = "VALORPRODUTO")
    private Double ValProduto;
}
