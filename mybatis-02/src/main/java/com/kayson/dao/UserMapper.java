package com.kayson.dao;

import com.kayson.pojo.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;


/**
 * @author
 * @date 2020/9/2 - 14:37
 */
public interface UserMapper {
    @Select("select * from user")
    List<User> getUser();
}
