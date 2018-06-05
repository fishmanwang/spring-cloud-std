package com.example.demo.controller;

import com.example.demo.client.UserClient;
import com.study.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by tjwang on 2018/6/5.
 */
@RestController
public class UserController {

    @Autowired
    private UserClient userClient;

    @GetMapping("/user/get")
    public User getUser() {
        long start = System.currentTimeMillis();

        User result = null;
        try {
            result = userClient.getUser();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Time used: " + (System.currentTimeMillis() - start));

        return result;
    }

}
