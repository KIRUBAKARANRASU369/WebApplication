package com.example.WebApplication.controller;

import com.example.WebApplication.model.Product;
import com.example.WebApplication.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class ProductController { //    /api/product GET
    @Autowired
    ProductService service;

    //CRUD - CREATE READ UPDATE DELETE
    @RequestMapping(value = "/products",method =  RequestMethod.GET)
    public ResponseEntity<List<Product>> getProduts(){
        return new ResponseEntity<>(service.getProducts(), HttpStatus.OK);
    }
    @GetMapping("/product/{product_id}")
    public ResponseEntity<Product> getProdutsById(@PathVariable int product_id){
        Product proObj = service.getProductById(product_id);
        if(proObj != null){
            return new ResponseEntity<>(service.getProductById(product_id), HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @GetMapping("/product/{productId}/image")
    public ResponseEntity<byte[]> getproductImage(@PathVariable int productId){
        Product proObj = service.getProductById(productId);
        byte[] imageData = proObj.getImageData();
        return ResponseEntity.ok()
                .contentType(MediaType.valueOf(proObj.getImageType()))
                .body(imageData);
    }
//  @RequestMapping(value = "/products",method =  RequestMethod.POST)
    @PostMapping("/product")
    public void createProduct(@RequestPart Product product, @RequestPart MultipartFile imageFile) throws IOException { //JSON object -> JAVA Object
        Product proRes = service.createProduct(product,imageFile);
    }

    @PutMapping("/product")
    public void updateProduct(@RequestBody Product product){
        service.updateProduct(product);
    }

    @DeleteMapping("/product/{product_id}")
    public void deleteProduct(@PathVariable int product_id){
        service.deleteProduct(product_id);
    }
}

//JAVA object and JSON object
