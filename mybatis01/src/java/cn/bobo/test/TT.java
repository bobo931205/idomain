package cn.bobo.test;

import cn.bobo.mapper.UserMapper;
import cn.bobo.model.User;
import cn.bobo.util.SqlSessionHelper;
import org.apache.ibatis.session.SqlSession;

/**
 * Created by leo on 2017/2/20.
 */
public class TT {

    public static void main(String[] args) throws Exception {

        SqlSession sqlSession = SqlSessionHelper.getSessionFactory().openSession();

        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.getUser(1);

        System.out.println(user.getName());

    }
}
