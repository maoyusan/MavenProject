package mapper;

import junit.framework.TestCase;
import org.apache.ibatis.session.SqlSession;
import pojo.Blog;
import utils.MyBatisUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BlogMapperTest extends TestCase {


    public BlogMapper mapper;
    public SqlSession sqlSession;

    {
        sqlSession = MyBatisUtils.factory.openSession(true);
        mapper = sqlSession.getMapper(BlogMapper.class);
    }


    public void testQueryBlogs() {

        HashMap<Object, Object> map = new HashMap<>();
        map.put("id", "1");
        map.put("title", "2333");
        for (Blog queryBlog : mapper.queryBlogs(map)) {
            System.out.println(queryBlog);
        }
        sqlSession.close();
    }

    public void testUpdateBlogs() {
        HashMap<Object, Object> map = new HashMap<>();
        map.put("id", 1);
        map.put("title", 666);
        int i = mapper.updateBlogs(map);
        System.out.println(i);
        sqlSession.close();
    }

    public void testQueryBlog1() {
        ArrayList<Object> objects = new ArrayList<>();
        objects.add(1);
        objects.add(2);
        objects.add(3);
        HashMap<Object, Object> map = new HashMap<>();
        map.put("list", objects);
        List<Blog> blogs = mapper.queryBlog1(map);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }
    }
}