package com.kayson.dao;

import com.kayson.pojo.Blog;

import java.util.List;
import java.util.Map;

/**
 * @author
 * @date 2020/9/8 - 17:35
 */
public interface BlogMapper {
    //插入数据
    public int addBook(Blog blog);
    //if查询
    public List<Blog> queryBlogIf(Map map);
    //更新Blog
    public int updateBlog(Map map);
    //遍历查询
    public List<Blog> queryForEach(Map map);
}
