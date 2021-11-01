import junit.framework.TestCase;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class UsersMapperTest extends TestCase {

    private SqlSession sqlSession;
    private UsersMapper mapper;

    public void testGetUsers() {
        sqlSession = MybatisUtils.getSqlSession();
        mapper = sqlSession.getMapper(UsersMapper.class);
        List<UserBean> users = mapper.getUsers();
        for (UserBean user : users) {
            System.out.println(user);

        }
        sqlSession.close();
    }


}