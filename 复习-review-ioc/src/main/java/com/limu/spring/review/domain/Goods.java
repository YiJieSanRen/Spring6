package com.limu.spring.review.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Goods {

    @Value("15.6")
    private double price;

    @Override
    public String toString() {
        return "Goods{" +
                "price=" + price +
                '}';
    }
}
