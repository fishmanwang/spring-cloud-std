/**
 * BBD Service Inc
 * All Rights Reserved @2016
 */
package com.example.demo.rpc;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author tjwang
 * @version $Id: SchedualServiceHi.java, v 0.1 2017/9/13 0013 11:31 tjwang Exp $
 */
@FeignClient(value = "service-miya", fallback = HiServiceRpcFallback.class)
public interface HiServiceRpc {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    String sayHello(@RequestParam(value = "name") String name);

}
