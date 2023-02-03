package com.webMvc.controller;

import com.webMvc.entity.Product;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/xml")
public class XmlController {
    @GetMapping(value = "/c1")
    @ResponseBody
    public Product getProduct(){
        return new Product("kia" , 10L);
    }
}
