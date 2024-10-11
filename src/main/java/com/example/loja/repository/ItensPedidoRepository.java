package com.example.loja.repository;

import com.example.loja.model.ItensPedidoModel;
import com.example.loja.model.PedidoModel;
import com.example.loja.model.ProdutoModel;
import com.sun.jdi.IntegerValue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItensPedidoRepository extends JpaRepository<ItensPedidoModel, IntegerValue> {
}
