package com.study.controller;

import com.netflix.discovery.converters.Auto;
import com.study.ServiceMiyaApplication;
import com.study.service.InfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by tjwang on 2018/5/26.
 */

@RestController
public class HelloController {


    public static final Logger logger = LoggerFactory.getLogger(ServiceMiyaApplication.class);

    @Autowired
    private InfoService infoService;

    @RequestMapping("/hi")
    public String home() {
        logger.info("hi is being called");
        return "Hi I'm miya";
    }

    @RequestMapping("/miya")
    public String info() {
        logger.info("miya is being called");
        return infoService.getInfo();
    }

    @RequestMapping("/hello")
    public String hello(@RequestParam(value = "name") String name) {
        logger.info("hello is being called");
        return "Hello " + name;
    }

}
