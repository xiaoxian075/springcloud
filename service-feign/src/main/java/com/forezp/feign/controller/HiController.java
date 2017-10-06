package com.forezp.feign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.forezp.feign.inter.SchedualServiceHi;

@RestController
public class HiController {

	@Autowired
    SchedualServiceHi schedualServiceHi;
	
	@RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String sayHi(@RequestParam String name){
        return schedualServiceHi.sayHiFromClientOne(name);
    }
	
	@RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String sayHello(){
        return "Hello, I am feign.";
    }
    
}
