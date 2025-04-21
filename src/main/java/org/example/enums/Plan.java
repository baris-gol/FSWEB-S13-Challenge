package org.example.enums;

public enum Plan {
    BASIC("Basic", 10000),
    STANDARD("Standard", 20000),
    PREMIUM("Premium", 30000);

    private final String name;
    private final int price;

    Plan(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}