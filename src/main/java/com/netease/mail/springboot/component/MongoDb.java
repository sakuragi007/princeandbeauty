/**
 * @(#)MongoDb.java, 2017/6/10.
 * <p/>
 * Copyright 2017 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.netease.mail.springboot.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;
import com.mongodb.DB;

/**
 * @author 王寒冰(hzwanghanbing02@corp.netease.com)
 */
@Component
public class MongoDb {

    private final MongoTemplate mongoTemplate;

    @Autowired
    public MongoDb(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    public MongoTemplate getMongoTemplate(){
        return mongoTemplate;
    }

}
