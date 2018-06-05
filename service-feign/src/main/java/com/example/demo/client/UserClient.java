package com.example.demo.client;

import com.example.demo.rpc.UserFacadeAdapter;
import com.study.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by tjwang on 2018/6/5.
 */
@Service
public class UserClient {

    @Autowired
    private UserFacadeAdapter userFacadeAdapter;

    public User getUser() {
        return userFacadeAdapter.getUser();
    }

}
