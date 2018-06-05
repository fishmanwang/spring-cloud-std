package com.study.controller;

import com.study.UserFacade;
import com.study.vo.User;
import org.apache.commons.lang.math.RandomUtils;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by tjwang on 2018/6/5.
 */
@RestController
public class UserController implements UserFacade {

    public User getUser() {
        try {
            int num = 500 + RandomUtils.nextInt(1000);
            System.out.println("sleep: " + num + " ms");
            Thread.sleep(num);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        User user = new User();
        user.setName("wang");
        user.setAge(30);
        return user;
    }

}
