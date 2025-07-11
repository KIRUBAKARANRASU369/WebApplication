package com.example.WebApplication.service;

import com.example.WebApplication.Repo.ProductRepo;
import com.example.WebApplication.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Service
public class ProductService {
//    List<Product> products = new ArrayList<>( Arrays.asList(
//            new Product(101,"Cycle","Vehicle for locomotion",5000),
//            new Product(102,"Watch","master time keeper",10000)));

    @Autowired
    ProductRepo productRepo;

    public List<Product> getProducts(){
        return productRepo.findAll();
    }
    public Product getProductById(int product_id){
        return productRepo.findById(product_id).orElse(null);
    }
    public Product createProduct(Product product, MultipartFile imageFile) throws IOException {
        product.setImageName(imageFile.getOriginalFilename());
        product.setImageType(imageFile.getContentType());
        product.setImageData(imageFile.getBytes());
        return productRepo.save(product);
    }

    public void updateProduct(Product product){
        productRepo.save(product);
    }
    public void deleteProduct(int product_id){
        productRepo.deleteById(product_id);
    }

}