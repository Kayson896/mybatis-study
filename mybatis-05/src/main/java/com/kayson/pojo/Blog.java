package com.kayson.pojo;

import lombok.Data;

import java.util.Date;

/**
 * @author
 * @date 2020/9/8 - 17:29
 */
@Data
public class Blog {
    private String id;
    private String title;
    private String author;
    private Date createTime;
    private int views;
}
