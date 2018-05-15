package com.study.rpc;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author: wangtianjing
 * @Date: Created in 2018/5/15 18:19
 */
@FeignClient(value = "zipkin02")
public interface VersionRpc {

    @GetMapping("/version/get")
    String getVersion();

}
