package com.study;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: wangtianjing
 * @Date: Created in 2018/5/15 18:19
 */
@RestController
@RequestMapping("/version")
public class VersionController {

    @GetMapping("/get")
    public String getVersion() {
        return "1.0";
    }

}
