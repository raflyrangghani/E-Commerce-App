package com.example.aplikasi_ecommerce.Domain;

import java.io.Serializable;

public class PopularDomain implements Serializable {


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public int getReview() {
        return review;
    }

    public void setReview(int review) {
        this.review = review;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getNumberInCart() {
        return numberInCart;
    }

    public void setNumberInCart(int numberInCart) {
        this.numberInCart = numberInCart;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }



    private  String title;
    private  int stock;
    private  String description;
    private String picUrl;

    private int review;
    private double score;
    private int numberInCart;
    private double price;

    public PopularDomain(String title, String description, String picUrl, int review, double score, double price, int stock ) {
        this.title = title;
        this.description = description;
        this.picUrl = picUrl;
        this.review = review;
        this.score = score;
        this.numberInCart = 1;
        this.price = price;
        this.stock = stock;
    }

}
