package com.codegym.model;

public class Product {
    private int id;
    private String name;
    private double prince;
    private String description;
    private String producer;

    public Product() {
    }

    public Product(int id, String name, double prince, String description, String producer) {
        this.id = id;
        this.name = name;
        this.prince = prince;
        this.description = description;
        this.producer = producer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrince() {
        return prince;
    }

    public void setPrince(double prince) {
        this.prince = prince;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }
}
