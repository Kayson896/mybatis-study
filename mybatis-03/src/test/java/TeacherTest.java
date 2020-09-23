import com.kayson.dao.StudentMapper;
import com.kayson.dao.TeacherMapper;
import com.kayson.pojo.Student;
import com.kayson.pojo.Teacher;
import com.kayson.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author
 * @date 2020/9/7 - 20:43
 */
public class TeacherTest {
    @Test
    public void test1(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher = mapper.getTeacher(1);
        System.out.println(teacher);
        sqlSession.close();
    }
    @Test
    public void test2(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> student = mapper.getStudent();
        for (Student student1 : student) {
            System.out.println(student1);
        }
        sqlSession.close();
    } @Test
    public void test3(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> student = mapper.getStudent1();
        for (Student student1 : student) {
            System.out.println(student1);
        }
        sqlSession.close();
    }
}
