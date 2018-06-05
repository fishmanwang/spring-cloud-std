package com.study;

import com.study.vo.User;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by tjwang on 2018/6/4.
 */
public interface UserFacade {

    @RequestMapping("/feign/user/get")
    User getUser();

}
