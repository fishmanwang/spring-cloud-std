package com.study.service;

import com.study.MiyaTestApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by tjwang on 2018/5/26.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = MiyaTestApplication.class)
public class InfoServiceTest {

    @Autowired
    private InfoService infoService;

    @Test
    public void testShow() {
        infoService.showInfo();
    }


}
