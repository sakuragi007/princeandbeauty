/**
 * @(#)Doc.java, 2017/6/10.
 * <p/>
 * Copyright 2017 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.netease.mail.springboot.pojo;

import java.util.Arrays;
import org.springframework.data.annotation.Id;

/**
 * @author 王寒冰(hzwanghanbing02@corp.netease.com)
 */
public class Doc {
    @Id
    private String id;

    private String title;

    private String description;

    private String by;

    private String[] tags;

    private Integer likes;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBy() {
        return by;
    }

    public void setBy(String by) {
        this.by = by;
    }

    public String[] getTags() {
        return tags;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    @Override
    public String toString() {
        return "Doc{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", by='" + by + '\'' +
                ", tags=" + Arrays.toString(tags) +
                ", likes=" + likes +
                '}';
    }
}
