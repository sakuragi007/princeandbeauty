/**
 * @(#)BeforeDestroyBean.java, 2017/6/5.
 * <p/>
 * Copyright 2017 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.netease.mail.springboot.component;

import javax.annotation.PreDestroy;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.stereotype.Component;

/**
 * @author 王寒冰
 */
@Component
public class BeforeDestroyBean implements DisposableBean,ExitCodeGenerator{


    @Override
    public void destroy() throws Exception {
        System.out.println("BeforeDestroyBean-----");
    }

    @Override
    public int getExitCode() {
        return 200;
    }
}