package com.metastore.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lihaocheng
 * @create 2019-04-05 01:21
 **/

@RestController
public class HelloBoot {
    @RequestMapping(value = "/sayHello",method = RequestMethod.GET)
    public String sayHello(){
        return "Hello Boot";

    }

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String Test(){
        return "Test is end";
    }



}
