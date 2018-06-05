package com.study;

import com.study.vo.User;

/**
 * Created by tjwang on 2018/6/4.
 */
public class UserFacadeFallback implements UserFacade {

    @Override
    public User getUser() {
        User user = new User();
        user.setName("Error");
        user.setAge(0);
        return user;
    }

}
