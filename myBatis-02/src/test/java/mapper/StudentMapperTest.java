package mapper;

import junit.framework.TestCase;
import org.apache.ibatis.session.SqlSession;
import pojo.User;
import utils.MyBatisUtils;

import java.util.List;

public class StudentMapperTest extends TestCase {

    public StudentMapper mapper;
    public SqlSession sqlSession;

    {
        sqlSession = MyBatisUtils.factory.openSession();
        mapper = sqlSession.getMapper(StudentMapper.class);
    }

    public void testGetStudent() {
        List<User> student = mapper.getStudent();
        for (User user : student) {
            System.out.println(user);
        }
        sqlSession.close();
    }

    public void testGetStudent1() {
        List<User> student1 = mapper.getStudent1(1);
        for (User user : student1) {
            System.out.println(user);
        }
    }
}