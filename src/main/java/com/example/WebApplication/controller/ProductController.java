package com.example.WebApplication.controller;

import com.example.WebApplication.model.Product;
import com.example.WebApplication.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService service;

    @RequestMapping("/Products")
    public List<Product> getProduts(){
        return service.getProducts();
    }
}
