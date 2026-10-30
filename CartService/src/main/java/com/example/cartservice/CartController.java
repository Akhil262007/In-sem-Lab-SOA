package com.example.cartservice;

import org.springframework.web.bind.annotation.*;

@RestController
public class CartController {

    @GetMapping("/cart")
    public String cart() {
        return "Cart Service";
    }
}