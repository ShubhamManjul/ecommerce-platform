package com.spring.ecom.exception;

public class ProductNotFoundException extends Exception{
    ProductNotFoundException(String message){
        super(message);
    }
}
