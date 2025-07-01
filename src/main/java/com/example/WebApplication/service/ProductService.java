package com.example.WebApplication.service;

import com.example.WebApplication.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Component
public class ProductService {
    List<Product> products = Arrays.asList(
            new Product(101,"Cycle","Vehicle for locomotion",5000),
            new Product(102,"Watch","master time keeper",10000));
    public List<Product> getProducts(){
        return products;
    }
}