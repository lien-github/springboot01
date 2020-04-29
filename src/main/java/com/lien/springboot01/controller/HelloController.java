package com.lien.springboot01.controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class HelloController {
    @GetMapping("/hi")
    public String hi(){
        HashMap<Object, Object> map = new HashMap<>(16);
        map.put("name" , "nihao");
        return  "hello";
    }
}
