package com.banana.Bathbomb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CartController {

    @GetMapping("/myCart")//장바구니로
    public String goCart(){
        return "/myPage/myCart";
    }
}