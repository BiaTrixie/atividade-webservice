package com.example.loja.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "produto")
public class ProdutoModel {

    /**
     * ID único do produto, gerado automaticamente pelo banco de dados.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    /**
     * Quantidade de produto.
     */
    @Column(name = "QTDEPRODUTOS")
    private Double qtdeProduto;

    /**
     * Valor unitário do produto.
     */
    @Column(name = "VALORPRODUTO")
    private Double valProduto;

}
