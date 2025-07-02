package com.example.WebApplication.model;

public class Product {
    int product_id;
    String product_name;
    String product_description;
    int product_price;

    @Override
    public String toString() {
        return "Product{" +
                "product_id=" + product_id +
                ", product_name='" + product_name + '\'' +
                ", product_description='" + product_description + '\'' +
                ", product_price=" + product_price +
                '}';
    }

    public Product(int product_id, String product_name, String product_description, int product_price) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.product_description = product_description;
        this.product_price = product_price;
    }
    public int getId() { return product_id; }
    public String getName() { return product_name; }
    public String getDescription() { return product_description; }
    public int getPrice() { return product_price; }
}
