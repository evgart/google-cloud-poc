package com.example.order.model.entity;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@Entity
@Table(name = "Order")
public class OrderEntity {
  @Id
  private String orderId;
  private String number;
  private String description;
  @ManyToMany(mappedBy = "orders")
  private Set<ItemEntity> items = new HashSet<>();

}
