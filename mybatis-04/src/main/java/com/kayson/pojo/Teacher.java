package com.kayson.pojo;

import lombok.Data;

import java.util.List;

/**
 * @author
 * @date 2020/9/7 - 20:10
 */
@Data
public class Teacher {
    private int id;
    private String name;
    private List<Student> students;
}
