package com.kayson.dao;

import com.kayson.pojo.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author
 * @date 2020/9/7 - 20:13
 */

public interface TeacherMapper {
    @Select("select * from teacher where id=#{tid}")
    public Teacher getTeacher(@Param("tid") int id);

    List<Teacher> getTeacher1(@Param("tid") int id);
}
