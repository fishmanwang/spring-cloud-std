package com.study.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by tjwang on 2018/5/26.
 */
@Service
public class InfoService {


    @Autowired
    private RestTemplate restTemplate;

    public String getInfo() {
        return restTemplate.getForObject("http://localhost:8988/info", String.class);
    }

    public void showInfo() {
        System.out.println("There are some important info");
    }

}
