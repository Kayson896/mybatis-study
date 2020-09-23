package com.kayson.dao;

import com.kayson.pojo.User;

import java.util.List;
import java.util.Map;

/**
 * @author
 * @date 2020/9/2 - 14:37
 */
public interface UserMapper {
    List<User> getUserList();
    int addUser(User user);
    List<User> getUserbyLimit(Map<String,Integer> map);
}
