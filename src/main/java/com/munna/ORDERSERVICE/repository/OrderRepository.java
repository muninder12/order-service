package com.munna.ORDERSERVICE.repository;

import com.munna.ORDERSERVICE.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
