package com.learn.bookstoremanagement.dto;

public class BookDTO {
    private Long id;
    private String title;
    private String author;
    private Double price;
    private String category;
    private Integer stock;

    public BookDTO(){

    }

    public BookDTO(Long id, String title,String author, Double price,String category, Integer stock){
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
        this.category = category;
        this.stock = stock;
    }

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getAuthor(){
        return author;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public Double getPrice(){
        return price;
    }

    public void setPrice(Double price){
        this.price = price;
    }

    public String getCategory(){
        return category;
    }

    public void setCategory(String category)
    {
        this.category = category;
    }

    public Integer getStock(){
        return stock;
    }

    public void setStock(Integer stock){
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "BookDTO{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", category='" + category + '\'' +
                ", stock=" + stock +
                '}';
    }
}

