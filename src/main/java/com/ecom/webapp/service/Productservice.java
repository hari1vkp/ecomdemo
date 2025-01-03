package com.ecom.webapp.service;

import com.ecom.webapp.model.Product;
import com.ecom.webapp.repo.Productrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Productservice {
    @Autowired
    private Productrepo ser;

    public List<Product> getAllProducts() {
        return ser.findAll();
    }

    public Optional<Product> probyid(int id) {
        return ser.findById(id);
    }

    public   Product saveProduct(Product product) {
        return ser.save(product);
    }

    public Product updateProduct(Product product) {
        return ser.save(product);
    }

    public void deleteProduct(int id) {
        ser.deleteById(id);
    }
}
