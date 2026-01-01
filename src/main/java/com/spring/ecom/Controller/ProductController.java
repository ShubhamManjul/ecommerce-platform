package com.spring.ecom.Controller;

import com.spring.ecom.DTO.ProductDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/product")
public class ProductController {
    @GetMapping
    public List<ProductDTO> getAllProducts(){
        return null;
    }

    @GetMapping("/id")
    public ProductDTO getProductById(@RequestParam Long id){
        return null;
    }
}
