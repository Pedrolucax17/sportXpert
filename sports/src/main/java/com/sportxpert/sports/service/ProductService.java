package com.sportxpert.sports.service;

import com.sportxpert.sports.model.Product;
import com.sportxpert.sports.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product saveProduct(Product product){
        return productRepository.save(product);
    }

    public Product findProductById(Long id){
        Optional<Product> productOptional = productRepository.findById(id);

        if (productOptional.isPresent()){
            return productOptional.get();
        }else{
            throw new RuntimeException("Produto não encontrado!");
        }

    }

    public List<Product> listAllProducts(){
        return productRepository.findAll();
    }

    public Product updateProduct(Product product){
        Optional<Product> productOptional = productRepository.findById(product.getId());

        if(productOptional.isPresent()){
            return productRepository.save(product);
        }else{
            throw new RuntimeException("Produto não encontrado!");
        }

    }

    public void deleteProduct(Long id){
        Optional<Product> productOptional = productRepository.findById(id);
        if(productOptional.isPresent()){
            productRepository.deleteById(id);
        }else{
            throw new RuntimeException("Produto não encontrado!");
        }
    }

}

