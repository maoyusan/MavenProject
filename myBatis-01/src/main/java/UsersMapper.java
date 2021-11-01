
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UsersMapper {

    @Select("select * from user")
    List<UserBean> getUsers();

}
