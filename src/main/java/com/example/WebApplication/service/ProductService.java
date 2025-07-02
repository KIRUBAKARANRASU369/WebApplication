package com.example.WebApplication.service;

import com.example.WebApplication.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Component
public class ProductService {
    List<Product> products = new ArrayList<>( Arrays.asList(
            new Product(101,"Cycle","Vehicle for locomotion",5000),
            new Product(102,"Watch","master time keeper",10000)));

    public List<Product> getProducts(){
        return products;
    }
    public Product getProductById(int product_id){
        for(Product p : products) {
            if (p.getId() == product_id) {
                return p;
            }
        }
        return null;
    }

    public void createProduct(Product product){
        System.out.println(product.toString());
        products.add(product);
    }
    public void updateProduct(Product product){
        for(int i=0 ; i< products.size() ; i++){
            if (products.get(i).getId() == product.getId()) {
                products.set(i,product);
            }
        }
    }

}