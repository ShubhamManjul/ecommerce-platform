package com.spring.ecom.service;

import com.spring.ecom.dto.ProductDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class ProductServiceImpl {
    @Autowired
    RestTemplate restTemplate;

    public List<ProductDTO> getAllProducts(){
        return restTemplate.getForObject("https://fakestoreapi.com/products", List.class);
    }

    public ProductDTO getProductById(Long id){
        return restTemplate.getForObject("https://fakestoreapi.com/products/id", ProductDTO.class);
    }

}
