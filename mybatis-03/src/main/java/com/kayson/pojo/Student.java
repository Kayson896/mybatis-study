package com.kayson.pojo;

import lombok.Data;

/**
 * @author
 * @date 2020/9/7 - 20:11
 */
@Data
public class Student {
    private int id;
    private String name;
    private Teacher teacher;
}
