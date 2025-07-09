package com.example.WebApplication.Repo;

import com.example.WebApplication.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


//ORM -> Object Relational Mapping
//JPA -> Java Persistence API
@Repository
public interface ProductRepo extends JpaRepository<Product,Integer> {

}

