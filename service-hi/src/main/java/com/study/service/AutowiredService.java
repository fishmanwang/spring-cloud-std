package com.study.service;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by tjwang on 2018/7/3.
 */
public class AutowiredService {

    @Autowired
    private TestService testService;

    public void say() {
        System.out.println("AutowiredServiced say:");
        testService.test();
    }

}
