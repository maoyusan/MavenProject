package mapper;

import pojo.User;

import java.util.List;

public interface StudentMapper {
    List<User> getStudent();

    List<User> getStudent1(int id);

}
