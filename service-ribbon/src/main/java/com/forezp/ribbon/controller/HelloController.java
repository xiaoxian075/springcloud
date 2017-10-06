package com.forezp.ribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.forezp.ribbon.service.HelloService;

@RestController
public class HelloController {

	@Autowired
    HelloService helloService;
	
    @RequestMapping(value = "/hi")
    public String hi(@RequestParam String name){
        return helloService.hiService(name);
    }
    
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String sayHello(){
        return "Hello, I am ribbon.";
    }
}
