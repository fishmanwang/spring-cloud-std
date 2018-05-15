package com.study.rpc;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: wangtianjing
 * @Date: Created in 2018/5/15 17:21
 */
@FeignClient(value = "zipkin02")
public interface PlayRpc {

    @GetMapping("/play/with")
    String playWith();

}
