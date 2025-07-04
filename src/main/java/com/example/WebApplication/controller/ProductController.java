package com.example.WebApplication.controller;

import com.example.WebApplication.model.Product;
import com.example.WebApplication.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService service;

    //CRUD - CREATE READ UPDATE DELETE
    @RequestMapping(value = "/products",method =  RequestMethod.GET)
    public List<Product> getProduts(){
        return service.getProducts();
    }
    @GetMapping("/products/{product_id}")
    public Product getProdutsById(@PathVariable int product_id){
        return service.getProductById(product_id);
    }

//  @RequestMapping(value = "/products",method =  RequestMethod.POST)
    @PostMapping("/products")
    public void createProduct(@RequestBody Product product){ //JSON object -> JAVA Object
        service.createProduct(product);
    }

    @PutMapping("/products")
    public void updateProduct(@RequestBody Product product){
        service.updateProduct(product);
    }

    @DeleteMapping("/products/{product_id}")
    public void deleteProduct(@PathVariable int product_id){
        service.deleteProduct(product_id);
    }
}

//JAVA object and JSON object
