package com.example.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wang-hc
 */
@RestController
public class Page {
    @RequestMapping("/index")
    public String index(){
        return "Hello World!";
    }
}
