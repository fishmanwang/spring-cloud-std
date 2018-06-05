package com.example.demo.rpc;

import com.study.UserFacade;
import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * Created by tjwang on 2018/6/5.
 */
@FeignClient(value = "user-feign", fallback = UserFacadeFallbackAdapter.class)
public interface UserFacadeAdapter extends UserFacade {
}
