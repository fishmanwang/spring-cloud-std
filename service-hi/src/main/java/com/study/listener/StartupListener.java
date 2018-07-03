package com.study.listener;

import com.study.service.AutowiredService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * Created by tjwang on 2018/7/3.
 */
@Component
public class StartupListener implements ApplicationListener<ContextRefreshedEvent> {

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        System.out.println(Thread.currentThread().getName() + " listened.");

        ApplicationContext context = event.getApplicationContext();
        if (context.getParent() == null) {
            System.out.println("Parent is null");
        }



        AutowiredService service = context.getAutowireCapableBeanFactory().createBean(AutowiredService.class);
        service.say();


//        new Thread(() -> {
//
//            while(true) {
//                try {
//                    Thread.sleep(1000L);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//
//        }).start();


    }

}
