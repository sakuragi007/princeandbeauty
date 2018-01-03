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
 * @author 王寒冰
 */
@Component
@Order(2)
public class AfterStartBeanTwo implements CommandLineRunner {

    @Override
    public void run(String... strings) throws Exception {
        System.out.println("AfterStartBeanTwo-----");
    }
}
