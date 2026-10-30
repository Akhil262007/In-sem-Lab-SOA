package com.example.productservice;

import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {

    @GetMapping("/products")
    public String products() {
        return "Product Service";
    }
}