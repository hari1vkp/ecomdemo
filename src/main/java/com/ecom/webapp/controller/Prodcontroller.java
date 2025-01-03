package com.ecom.webapp.controller;

import com.ecom.webapp.model.Product;
import com.ecom.webapp.service.Productservice;
import jdk.jfr.Description;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class Prodcontroller {
    @Autowired
    Productservice service;
    @RequestMapping("/")
    public String home() {
        return "Hello";
    }
    @GetMapping("/products")
    public List<Product> getAllProducts()
    {
        return service.getAllProducts();
    }
    @GetMapping("/products/{id}")
    public Optional<Product> probyid(@PathVariable int id)
    {
        return service.probyid(id);
    }
    @PostMapping("/products")
    public Product addProduct(@RequestBody Product product)
    {
        return service.saveProduct(product);
    }
    @PutMapping("/products")
    public Product updateProduct(@RequestBody Product product)
    {
        return service.updateProduct(product);
    }
    @DeleteMapping("/products/{id}")
    public void deleteProduct(@PathVariable int id)
    {
        service.deleteProduct(id);
        System.out.println("deleted");
    }
}
