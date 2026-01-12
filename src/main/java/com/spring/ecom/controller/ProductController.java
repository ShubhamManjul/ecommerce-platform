package com.spring.ecom.controller;

import com.spring.ecom.dto.ProductDTO;
import com.spring.ecom.model.Product;
import com.spring.ecom.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductServiceImpl productService;

    @GetMapping
    public List<ProductDTO> getAllProducts(){
        return productService.getAllProducts();
    }

    @GetMapping("/id")
    public ProductDTO getProductById(@RequestParam Long id) {
        return productService.getProductById(id);
    }

    @PostMapping
    public String createProduct(@RequestBody Product product){
        return null;
    }
}
