package com.example.demo2;

import com.example.demo1.Demo1;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @RequestMapping(value = "/index")
    public String index(){
        return Demo1.getString();
    }
}
