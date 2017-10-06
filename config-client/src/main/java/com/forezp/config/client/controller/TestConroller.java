package com.forezp.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class TestConroller {

//	@Value("${foo}")
//    private String foo;
//	
//	@Value("${democonfigclient.message}")
//    private String message;
//	
//    @RequestMapping(value = "/foo")
//    public String foo(){
//        return foo;
//    }
//    
//    @RequestMapping(value = "/message")
//    public String message(){
//        return message;
//    }
    

    @Value("${test.hytf.name}")
    private String name;
    @Value("${test.hytf.age}")
    private String age;
    @Value("${test.hytf.sex}")
    private String sex;
    
    @RequestMapping(value = "/name")
    public String name() {
    	return name;
    }
    @RequestMapping(value = "/age")
    public String age() {
    	return age;
    }
    @RequestMapping(value = "/sex")
    public String sex() {
    	return sex;
    }
}
