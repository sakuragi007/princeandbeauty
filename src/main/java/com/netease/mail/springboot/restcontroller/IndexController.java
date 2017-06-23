/**
 * @(#)IndexController.java, 2017/6/9.
 * <p/>
 * Copyright 2017 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.netease.mail.springboot.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netease.mail.springboot.component.MongoDb;
import com.netease.mail.springboot.pojo.Doc;
import com.netease.mail.springboot.repository.DocRepository;

/**
 * @author 王寒冰(hzwanghanbing02@corp.netease.com)
 */
@RestController
public class IndexController {

    @Autowired
    private DocRepository docRepository;

    @Autowired
    private MongoDb mongoDb;

    @RequestMapping(value = "index/{docby}")
    public List<Doc> index(@PathVariable String docby) {
        List<Doc> docList = mongoDb.getMongoTemplate().find(new Query(Criteria.where("by").is(docby)), Doc.class);
        return docList;
    }

    @RequestMapping(value = "add")
    public String add(Doc doc) {
        docRepository.insert(doc);
        return "success";
    }

    @RequestMapping(value = "update")
    public String update(Doc doc) {
        docRepository.save(doc);
        return "success";
    }

    @RequestMapping(value = "del/{docId}")
    public String del(@PathVariable String docId) {
        docRepository.deleteById(docId);
        return "success";
    }
}
