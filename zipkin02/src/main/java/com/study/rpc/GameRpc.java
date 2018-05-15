package com.study.rpc;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author: wangtianjing
 * @Date: Created in 2018/5/15 17:54
 */
@FeignClient(name = "zipkin03")
public interface GameRpc {

    @GetMapping("/game/get")
    String getName();

}
