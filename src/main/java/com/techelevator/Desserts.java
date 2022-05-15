package com.techelevator;

import java.math.BigDecimal;

public class Desserts extends Product {

    public Desserts(String name, BigDecimal price, String location) {
        super(name, price, location);
    }

    @Override
    public String getMessage() {
        return "Time for a sugar rush!";
    }
}
