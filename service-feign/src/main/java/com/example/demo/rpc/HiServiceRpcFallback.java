/**
 * BBD Service Inc
 * All Rights Reserved @2016
 */
package com.example.demo.rpc;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author tjwang
 * @version $Id: SchedualServiceHiHystrict.java, v 0.1 2017/9/13 0013 11:45 tjwang Exp $
 */
@Component
public class HiServiceRpcFallback implements HiServiceRpc {

    @Override
    public String sayHello(@RequestParam(value = "name") String name) {
        return "sorry " + name;
    }

}
