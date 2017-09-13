/**
 * BBD Service Inc
 * All Rights Reserved @2016
 */
package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author tjwang
 * @version $Id: HelloService.java, v 0.1 2017/9/13 0013 11:08 tjwang Exp $
 */
@Service
public class HelloService {

    @Autowired
    private RestTemplate restTemplate;

    public String hiService(String name) {
        return restTemplate.getForObject("http://service-hi/hi?name=" + name, String.class);
    }
}
