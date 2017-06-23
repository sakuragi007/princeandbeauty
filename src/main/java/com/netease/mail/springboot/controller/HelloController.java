/**
 * @(#)HelloController.java, 2017/6/5.
 * <p/>
 * Copyright 2017 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.netease.mail.springboot.controller;

import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.netease.mail.springboot.config.DevtoolsConfig;

/**
 * @author 王寒冰(hzwanghanbing02@corp.netease.com)
 */
@Controller
public class HelloController {

    private boolean testarg;

    @Autowired
    // TODO 没有生效？
    private ApplicationArguments args;

    @Autowired
    private DevtoolsConfig devtoolsConfig;


    @RequestMapping("/hello")
    public String hello(Map<String,Object> map){
        map.put("name", "beauty");
        /*testarg = args.containsOption("testarg");
        map.put("debug",testarg+" ok");
        map.put("prop","devtoolsConfig:"+devtoolsConfig);*/
        return "hello";
    }
}
