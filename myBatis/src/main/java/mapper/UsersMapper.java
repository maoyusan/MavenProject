package mapper;

import org.apache.ibatis.annotations.Param;
import pojo.UserBean;

import java.util.List;

public interface UsersMapper {

    List<UserBean> getUsers();

    List<UserBean> getUsersPage(@Param("index") int index, @Param("size") int size);

    UserBean getId(int id);

    int addUser(String name);

    int deleteUser(int id);
}
