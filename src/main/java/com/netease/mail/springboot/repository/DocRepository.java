/**
 * @(#)DocRepository.java, 2017/6/10.
 * <p/>
 * Copyright 2017 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.netease.mail.springboot.repository;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.netease.mail.springboot.pojo.Doc;

/**
 * @author 王寒冰
 */
public interface DocRepository extends MongoRepository<Doc, String> {

    public List<Doc> findByBy(String by);


}
