package mapper;

import pojo.Blog;

import java.util.List;
import java.util.Map;

public interface BlogMapper {

    List<Blog> queryBlogs(Map map);

    List<Blog> queryBlog1(Map map);

    int updateBlogs(Map map);

}
