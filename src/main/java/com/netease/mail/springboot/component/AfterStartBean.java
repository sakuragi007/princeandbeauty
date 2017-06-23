/**
 * @(#)MyBean.java, 2017/6/5.
 * <p/>
 * Copyright 2017 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.netease.mail.springboot.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author 王寒冰(hzwanghanbing02@corp.netease.com)
 */
@Component
@Order(1)
public class AfterStartBean implements CommandLineRunner {

    @Autowired
    public AfterStartBean(ApplicationArguments args) {
        boolean testarg = args.containsOption("testarg");
        System.out.println(testarg ? "testarg" : "no");
    }

    @Override
    public void run(String... strings) throws Exception {
        System.out.println("AfterStartBean-----");
    }
}
