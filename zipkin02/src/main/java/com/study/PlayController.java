package com.study;

import com.study.rpc.GameRpc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

/**
 * @Author: wangtianjing
 * @Date: Created in 2018/5/15 17:21
 */
@RestController
@RequestMapping("/play")
public class PlayController {

    @Autowired
    private GameRpc gameRpc;

    @RequestMapping("/with")
    public String playWith() {
        Random random = new Random();
        int rand = random.nextInt(3);
        try {
            Thread.sleep(rand*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return "King " + gameRpc.getName();
    }

}
