package com.example.ProductService.controllers;

import com.example.ProductService.models.Product;
import com.example.ProductService.services.FakeStoreProductService;
import com.example.ProductService.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable("id") int id) {
        if (id < 1 || id > 20){
            return new ResponseEntity<>(HttpStatusCode.valueOf(400));
        }

        Product product = productService.getProductById(id);
        return new ResponseEntity<>(product, HttpStatusCode.valueOf(200));
    }

}
