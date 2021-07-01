package com.luv2code.ecommerce.controller;

import com.luv2code.ecommerce.entity.Product;
import com.luv2code.ecommerce.models.common.ResponseStatus;
import com.luv2code.ecommerce.models.response.ApiResponse;
import com.luv2code.ecommerce.service.ProductService;
import com.luv2code.ecommerce.util.Utils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    ProductService service;

    public ProductController(
            ProductService productService
    ) {
        this.service = productService;
    }

    @GetMapping(value = "/list/products")
    public ApiResponse getProducts() {
        List<Product> products =  service.getAllProducts();
        return Utils.createResponse(products, ResponseStatus.SUCCESS, null);
    }

}
