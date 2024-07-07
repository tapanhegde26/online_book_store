package com.learn.bookstoremanagement.dto;

public class OrderItemDTO {
    private Long id;
    private Long orderId;
    private Long bookId;
    private Integer quantity;
    private Double price;

    public OrderItemDTO(){

    }

    public OrderItemDTO(Long id, Long orderId, Long bookId, Integer quantity, double price){
        this.id = id;
        this.orderId = orderId;
        this.bookId = bookId;
        this.quantity = quantity;
        this.price = price;
    }

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public Long getOrderId(){
        return  orderId;
    }

    public void setOrderId(Long orderId){
        this.orderId = orderId;
    }

    public Long getBookId(){
        return bookId;
    }

    public void setBookId(Long bookId){
        this.bookId = bookId;
    }

    public Integer getQuantity(){
        return  quantity;
    }

    public void setQuantity(Integer quantity){
        this.quantity = quantity;
    }

    public Double getPrice(){
        return price;
    }

    public void setPrice(Double price){
        this.price = price;
    }

    @Override
    public String toString() {
        return "OrderItemDTO{" +
                "id=" + id +
                ", orderId='" + orderId + '\'' +
                ", bookId='" + bookId + '\'' +
                ", quantity='" + quantity + '\'' +
                ", price='" + price + '\''+

                '}';
    }

}
