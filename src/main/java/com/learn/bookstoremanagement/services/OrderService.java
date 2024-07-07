package com.learn.bookstoremanagement.services;

import com.learn.bookstoremanagement.model.Order;
import com.learn.bookstoremanagement.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public Order placeOrder(Order order){
        return orderRepository.save(order);
    }

    public Optional<Order> findOrderById(Long id){
        return orderRepository.findById(id);
    }

    public List<Order> findAllOrders(){
        return orderRepository.findAll();
    }

    public void deleteOrder(Long id){
        orderRepository.deleteById(id);
    }
}
