package com.Gerenciamento_Pedidos.Pedidos.repositories;

import com.Gerenciamento_Pedidos.Pedidos.models.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}

