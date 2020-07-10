package com.sample.client.controller;

import com.sample.client.demo.HelloWorld;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @auther zhongshunchao
 * @date 27/06/2020 10:24
 */
@RestController
@RequestMapping("/callMethod")
public class HelloWorldController {

    @Autowired
    public HelloWorld helloWorld;

    @RequestMapping("/hello")
    public String hello(){
        return helloWorld.run();
    }
}
