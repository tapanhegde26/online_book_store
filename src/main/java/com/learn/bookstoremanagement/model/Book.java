package com.learn.bookstoremanagement.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.security.PublicKey;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String author;
    private String price;
    private String category;
    private Integer stock;

    // Getter and Setter
    public Book(){
    }

    public Book(String title, String author, String price, String category,Integer stock){
        this.title = title;
        this.author = author;
        this.price = price;
        this.category = category;
        this.stock = stock;
    }
    public Long getId() {return id;}

    public void setId() {this.id = id;}

    public String getTitle() { return title;}

    public void setTitle() {
        this.title = title;
    }

    public String getPrice() {return price;}

    public void setPrice(){
        this.price = price;
    }

    public String getCategory(){ return category; }

    public void setCategory(){
        this.category = category;
    }

    public String getAuthor(){ return author;}

    public void setAuthor(){
        this.author = author;
    }

    public Integer getStock() { return stock;}

    public void setStock(){
        this.stock = stock;
    }
}
