/**
 * BBD Service Inc
 * All Rights Reserved @2016
 */
package com.example.demo.controller;

import com.example.demo.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author tjwang
 * @version $Id: HelloController.java, v 0.1 2017/9/13 0013 11:10 tjwang Exp $
 */
@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @RequestMapping("/hi")
    public String hi(@RequestParam String name) {
        return helloService.hiService(name);
    }
}
