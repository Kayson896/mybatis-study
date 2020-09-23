import com.kayson.dao.TeacherMapper;
import com.kayson.pojo.Teacher;
import com.kayson.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * @author
 * @date 2020/9/8 - 14:59
 */
public class Test {
    @org.junit.Test
    public void test(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        List<Teacher> teacher1 = mapper.getTeacher1(1);
        for (Teacher teacher : teacher1) {
            System.out.println(teacher);
        }
//        System.out.println(teacher1);
        sqlSession.close();
    }
}
