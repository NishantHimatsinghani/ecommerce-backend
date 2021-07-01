package com.luv2code.ecommerce.service;

import com.luv2code.ecommerce.dao.ProductRepository;
import com.luv2code.ecommerce.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {


    ProductRepository productRepository;

    @Autowired
    public ProductService(
            ProductRepository productRepository
    ) {
        this.productRepository = productRepository;
    }


    public List<Product> getAllProducts() {

        return productRepository.findAll();
    }
}
