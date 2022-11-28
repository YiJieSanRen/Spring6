package com.limu.spring.review.domain;

public class Vip {

    private Order order;

    public Vip(Order order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return "Vip{" +
                "order=" + order +
                '}';
    }
}
