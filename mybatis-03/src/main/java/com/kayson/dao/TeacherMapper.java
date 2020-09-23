package com.kayson.dao;

import com.kayson.pojo.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author
 * @date 2020/9/7 - 20:13
 */

public interface TeacherMapper {
    @Select("select * from teacher where id=#{tid}")
    public Teacher getTeacher(@Param("tid") int id);
}
