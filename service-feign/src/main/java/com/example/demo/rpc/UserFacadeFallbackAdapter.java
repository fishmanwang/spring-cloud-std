package com.example.demo.rpc;

import com.study.UserFacadeFallback;
import org.springframework.stereotype.Component;

/**
 * Created by tjwang on 2018/6/5.
 */
@Component
public class UserFacadeFallbackAdapter extends UserFacadeFallback implements UserFacadeAdapter {
}
