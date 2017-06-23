/**
 * @(#)Example.java, 2017/6/1.
 * <p/>
 * Copyright 2017 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.netease.mail.springboot;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.event.ApplicationPreparedEvent;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;

/**
 * @author 王寒冰(hzwanghanbing02@corp.netease.com)
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) throws Exception {
        for (String arg: args) {
            System.out.print("whbtest----" + arg);
        }
        new SpringApplicationBuilder().listeners(new ApplicationListener<ApplicationPreparedEvent>() {
            @Override
            public void onApplicationEvent(ApplicationPreparedEvent applicationEvent) {
                System.out.print("whbtestevent-----ApplicationPreparedEvent");
            }
        }).listeners(new ApplicationListener<ApplicationReadyEvent>() {
            @Override
            public void onApplicationEvent(ApplicationReadyEvent applicationEvent) {
                System.out.print("whbtestevent-----ApplicationReadyEvent");
            }
        }).sources(Application.class).run(args);
        //        SpringApplication.run(Application.class, args);
    }

}
