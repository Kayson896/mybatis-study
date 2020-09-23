import com.kayson.dao.BlogMapper;
import com.kayson.pojo.Blog;
import com.kayson.utils.IDutil;
import com.kayson.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.*;

/**
 * @author
 * @date 2020/9/8 - 17:46
 */
public class Test {
    @org.junit.Test
    public void test(){
        System.out.println(IDutil.getID());
    }
    @org.junit.Test
    public void test1(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        Blog blog = new Blog();
        blog.setId(IDutil.getID());
        blog.setAuthor("kayson");
        blog.setTitle("Java so easy");
        blog.setViews(9999);
        blog.setCreateTime(new Date());

        mapper.addBook(blog);

        blog.setId(IDutil.getID());
        blog.setTitle("Mysql so easy");

        mapper.addBook(blog);

        blog.setId(IDutil.getID());
        blog.setTitle("JavaWeb so easy");

        mapper.addBook(blog);

        blog.setId(IDutil.getID());
        blog.setTitle("Mybatis so easy");

        mapper.addBook(blog);

        sqlSession.close();
    }

    @org.junit.Test
    public void test2(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap<String, String> map = new HashMap<>();
//        map.put("title","Java so easy");
        map.put("author","kayson");
        mapper.queryBlogIf(map);
        sqlSession.close();
    }
    @org.junit.Test
    public void test3(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        HashMap<String, String> map = new HashMap<>();
        map.put("title","Spring so easy");
        map.put("author","Tom");
        map.put("id","4");


        int i = mapper.updateBlog(map);
        System.out.println(i);
        sqlSession.close();
    }

    @org.junit.Test
    public void test4(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        HashMap<Object, Object> map = new HashMap<>();
        ArrayList<Integer> ids = new ArrayList<>();
        ids.add(1);
        ids.add(2);
        map.put("ids",ids);

        List<Blog> blogs = mapper.queryForEach(map);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }
        sqlSession.close();
    }
}
