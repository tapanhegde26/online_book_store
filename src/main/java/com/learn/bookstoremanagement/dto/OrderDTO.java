package com.learn.bookstoremanagement.dto;

import java.util.Date;
import java.util.List;

public class OrderDTO {
    private Long id;
    private Long userId;
    private Date orderDate;
    private Double totalAmount;
    private List<OrderItemDTO> orderItems;

    public OrderDTO(){

    }

    public OrderDTO(Long id, Long userId, Date orderDate, Double totalAmount, List<OrderItemDTO> orderItems){
        this.id = id;
        this.userId = userId;
        this.orderDate = orderDate;
        this.totalAmount = totalAmount;
        this.orderItems = orderItems;
    }

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public Long getUserId(){
        return userId;
    }

    public void setUserId(Long userId){
        this.userId = userId;
    }

    public Date getOrderDate(){
        return orderDate;
    }

    public void setOrderDate(Date orderDate){
        this.orderDate = orderDate;
    }

    public List<OrderItemDTO> getOrderItems(){
        return orderItems;
    }

    public void setOrderItems(List<OrderItemDTO> orderItems){
        this.orderItems = orderItems;
    }

    public Double getTotalAmount(){
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount){
        this.totalAmount = totalAmount;
    }

    @Override
    public String toString() {
        return "OrderDTO{" +
                "id=" + id +
                ", userId='" + userId + '\'' +
                ", orderDate='" + orderDate + '\'' +
                ", orderItems='" + orderItems + '\'' +
                ", totalAmount='" + totalAmount + '\''+

                '}';
    }
    }

