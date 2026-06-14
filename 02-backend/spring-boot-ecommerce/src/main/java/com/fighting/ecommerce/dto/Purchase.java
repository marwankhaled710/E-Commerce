package com.fighting.ecommerce.dto;

import com.fighting.ecommerce.entity.Address;
import com.fighting.ecommerce.entity.Customer;
import com.fighting.ecommerce.entity.Order;
import com.fighting.ecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;

}
