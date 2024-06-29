package com.learn.bookstoremanagement.model;

import jakarta.persistence.*;

@Entity
@Table(name = "order_items")
public class OrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "order_id", nullable = false)
    private Order order;

    @ManyToOne
    @JoinColumn(name = "book_id", nullable = false)
    private Book book;

    private Integer quantity;

    private Double price;

    public OrderItem()
    {

    }

    public OrderItem(Order order,Book book, Integer quantity, Double price){
        this.order = order;
        this.book = book;
        this.quantity = quantity;
        this.price = price;
    }

    //Getters and Setters
    public Long getId(){ return id;}

    public void setId(){ this.id = id;}

    public Order getOrder(){
        return order;
    }

    public void setOrder(){
        this.order = order;
    }

    public Book getBook(){
        return book;
    }

    public void setBook(){
        this.book = book;
    }

    public Integer getQuantity(){
        return quantity;
    }

    public void setQuantity(){
        this.quantity = quantity;
    }

    public Double getPrice(){
        return price;
    }

    public void setPrice(){
        this.price = price;
    }

    @Override
    public String toString()
    {
        return "OrderItem{" +
                "id=" + id +
                ", order=" + order +
                ", book=" + book +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
