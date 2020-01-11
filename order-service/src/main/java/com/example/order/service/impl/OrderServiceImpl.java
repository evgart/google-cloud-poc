package com.example.order.service.impl;

import com.example.order.model.dto.OrderDto;
import com.example.order.model.entity.OrderEntity;
import com.example.order.service.OrderService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class OrderServiceImpl implements OrderService {

  private ModelMapper modelMapper;

  @Override
  public List<OrderDto> getAll() {
    return null;
  }

  @Override
  public void create(OrderDto orderDto) {

  }

  @Override
  public void deleteByNumber(String orderNumber) {

  }

  @Override
  public void deleteById(Long orderId) {

  }

  private OrderEntity getEntity(OrderDto orderDto) {
    return modelMapper.map(orderDto, OrderEntity.class);
  }
}
