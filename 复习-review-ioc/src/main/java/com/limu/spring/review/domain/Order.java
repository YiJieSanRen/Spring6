package com.limu.spring.review.domain;

public class Order {

    private String name;

    private String price;

    public Order(String name, String price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Order{" +
                "name='" + name + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
