package cn.bobo.dao.impl;

import cn.bobo.dao.UserDao;
import cn.bobo.mapping.UserMapper;
import cn.bobo.model.User;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by leo on 2017/2/17.
 */
@Repository("userDao")
public class UserDaoImpl implements UserDao{

    @Resource
    private UserMapper userMapper;

    public List<User> getUserList(){
        return userMapper.getUserList();
    }

}
