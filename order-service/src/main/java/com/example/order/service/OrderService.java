package com.example.order.service;

import com.example.order.model.dto.OrderDto;

import java.util.List;

public interface OrderService {

  List<OrderDto> getAll();

  void create(OrderDto orderDto);

  void deleteByNumber(String orderNumber);

  void deleteById(Long orderId);

}
