package mapper;

import junit.framework.TestCase;
import org.apache.ibatis.session.SqlSession;
import pojo.Teacher;
import utils.MyBatisUtils;

public class TeacherMapperTest extends TestCase {

    public TeacherMapper mapper;
    public SqlSession sqlSession;

    public void testGetTeacher() {
        sqlSession = MyBatisUtils.factory.openSession();
        mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher = mapper.getTeacher(3);
        System.out.println(teacher.getUsers());
        sqlSession.close();
    }
}