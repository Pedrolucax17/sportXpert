package com.sportxpert.sports.controller;

import com.sportxpert.sports.model.Product;
import com.sportxpert.sports.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sports")
public class ProductController {

    @Autowired
    private ProductService service;

    @PostMapping
    public Product product(@RequestBody Product product){
        return service.saveProduct(product);
    }

    @GetMapping("id/{id}")
    public Product findProductById(@PathVariable Long id){
        return service.findProductById(id);
    }

    @GetMapping
    public List<Product> listAllProducts(){
        return service.listAllProducts();
    }

    @PutMapping
    public Product updateProduct(@RequestBody Product product){
        return service.updateProduct(product);
    }

    @DeleteMapping("id/{id}")
    public void deleteProduct(@PathVariable Long id){
        service.deleteProduct(id);
    }

}
