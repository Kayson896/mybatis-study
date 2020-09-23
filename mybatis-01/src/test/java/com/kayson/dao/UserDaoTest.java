package com.kayson.dao;

import com.kayson.pojo.User;
import com.kayson.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;


/**
 * @author
 * @date 2020/9/2 - 14:58
 */
public class UserDaoTest {
    static Logger logger = Logger.getLogger(UserDaoTest.class);
    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.getUserList();

        for (User user : userList) {
            System.out.println(user);
        }
        sqlSession.close();
    }
    @Test
    public void add(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.addUser(new User(5,"yuji","456789"));
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void testlog4j(){
        logger.debug("debug:into log4j");
        logger.info("info:into log4j");
        logger.error("error:into log4j");
    }
    @Test
    public void testLimit(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        HashMap<String, Integer> stringIntegerHashMap = new HashMap<>();
        stringIntegerHashMap.put("startindex",0);
        stringIntegerHashMap.put("pagesize",2);

        List<User> userbyLimit = mapper.getUserbyLimit(stringIntegerHashMap);

        for (User user : userbyLimit) {
            System.out.println(user);
        }
        sqlSession.close();
    }
}
