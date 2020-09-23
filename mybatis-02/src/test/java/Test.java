import com.kayson.dao.UserMapper;
import com.kayson.pojo.User;
import com.kayson.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * @author
 * @date 2020/9/6 - 17:16
 */
public class Test {
    @org.junit.Test
    public void test1(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> user = mapper.getUser();
        for (User user1 : user) {
            System.out.println(user1);
        }
        sqlSession.close();
    }
}
