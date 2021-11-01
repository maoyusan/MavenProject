package mapper;

import org.apache.ibatis.annotations.Param;
import pojo.Teacher;

public interface TeacherMapper {

    Teacher getTeacher(@Param("id") int id);

}
