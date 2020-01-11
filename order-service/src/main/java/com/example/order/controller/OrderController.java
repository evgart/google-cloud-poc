package com.example.order.controller;

import com.example.order.model.dto.OrderDto;
import com.example.order.service.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/order")
public class OrderController {

  private OrderService orderService;

  @GetMapping
  public List<OrderDto> getAll() {
    return orderService.getAll();
  }

  @PostMapping
  public void create(OrderDto orderDto) {
    orderService.create(orderDto);
  }

  @DeleteMapping("/{orderNumber}")
  public void delete(@PathVariable String orderNumber) {
    orderService.deleteByNumber(orderNumber);
  }

}
