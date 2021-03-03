package com.webtutsplus.ecommerce.service;

import com.webtutsplus.ecommerce.model.OrderItems;
import com.webtutsplus.ecommerce.repository.OrderItemsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class OrderItemsService {

    @Autowired
    private final OrderItemsRepository orderItemsRepository;

    public OrderItemsService(OrderItemsRepository orderItemsRepository){
        this.orderItemsRepository=orderItemsRepository;
    }

    public void addOrderedProducts (OrderItems orderItem) {

        orderItemsRepository.save(orderItem);

    }


}
