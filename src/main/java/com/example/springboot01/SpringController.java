package com.example.springboot01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringController {

    @Autowired
    private springbootProject springbootProjectl;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String demo01(){
        return springbootProjectl.getCupSize()+springbootProjectl.getAge();
    }
}
