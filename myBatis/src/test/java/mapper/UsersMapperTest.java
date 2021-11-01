package mapper;

import junit.framework.TestCase;
import org.apache.ibatis.session.SqlSession;
import pojo.UserBean;
import utils.MybatisUtils;

import java.util.List;

public class UsersMapperTest extends TestCase {

    private final UsersMapper mapper;
    private final SqlSession sqlSession;

    {
        //test333
        sqlSession = MybatisUtils.getSqlSession();
        mapper = sqlSession.getMapper(UsersMapper.class);
    }

    public void testGetUsers() {
        List<UserBean> users = mapper.getUsers();
        for (UserBean user : users) {
            System.out.println(user);
        }
        MybatisUtils.getSqlSession().close();
    }

    public void testGetId() {
        UserBean id = mapper.getId(1);
        System.out.println(id);
    }

    public void testAddUser() {
        int test = mapper.addUser("不测");
        System.out.println(test);
        sqlSession.commit();
        sqlSession.close();
    }

    public void testDeleteUser() {
        int i = mapper.deleteUser(2);
        System.out.println(i);
        sqlSession.commit();
        sqlSession.close();

    }

    public void testGetUsersPage() {
        List<UserBean> usersPage = mapper.getUsersPage(0, 5);
        for (UserBean userBean : usersPage) {
            System.out.println(userBean);

        }
    }
}