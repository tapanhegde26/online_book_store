package com.learn.bookstoremanagement.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id",nullable = false)
    private User user;

    private Double totalAmount;

    @OneToMany(mappedBy = "order",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<OrderItem> orderItems;

    public Order(){

    }

    public Order(User user, Double totalAmount, List<OrderItem> orderItems){
        this.user = user;
        this.totalAmount = totalAmount;
        this.orderItems = orderItems;
    }

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public User getUser(){
        return user;
    }

    public void setUser(User user){
        this.user = user;
    }

    public Double getTotalAmount(){
        return totalAmount;
    }

    public void setTotalAmount(){
        this.totalAmount = totalAmount;
    }

    public List<OrderItem> getOrderItems(){
        return orderItems;
    }

    public void setOrderItems(){
        this.orderItems = orderItems;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", user=" + user +
                ", totalAmount=" + totalAmount +
                '}';
    }

}
