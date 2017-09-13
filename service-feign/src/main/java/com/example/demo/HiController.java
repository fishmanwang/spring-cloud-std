/**
 * BBD Service Inc
 * All Rights Reserved @2016
 */
package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author tjwang
 * @version $Id: HiController.java, v 0.1 2017/9/13 0013 11:32 tjwang Exp $
 */
@RestController
public class HiController {

    @Autowired
    private SchedualServiceHi schedualServiceHi;

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    String sayHi(@RequestParam(value = "name") String name) {
        return schedualServiceHi.sayHiFromClientOne(name);
    }

}
