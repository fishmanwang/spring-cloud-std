package com.study;

import com.study.rpc.VersionRpc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

/**
 * @Author: wangtianjing
 * @Date: Created in 2018/5/15 17:52
 */
@RestController
@RequestMapping("/game")
public class GameController {

    @Autowired
    private VersionRpc versionRpc;

    @GetMapping("/get")
    public String getName() {
        Random random = new Random();
        int rand = random.nextInt(3);
        try {
            Thread.sleep(rand*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "the Three Kindoms " + versionRpc.getVersion();
    }

}
