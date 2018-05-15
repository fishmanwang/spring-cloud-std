package com.study;

import com.study.rpc.PlayRpc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

/**
 * @Author: wangtianjing
 * @Date: Created in 2018/5/15 17:15
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private PlayRpc playRpc;

    @RequestMapping("/say")
    public String sayHello(@RequestParam(name = "name") String name) {
        Random random = new Random();
        int rand = random.nextInt(3);
        try {
            Thread.sleep(rand*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Hello " + name + ", play with " + playRpc.playWith();
    }

}
