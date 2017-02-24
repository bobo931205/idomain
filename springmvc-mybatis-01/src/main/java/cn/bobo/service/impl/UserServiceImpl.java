package cn.bobo.service.impl;

import cn.bobo.dao.UserDao;
import cn.bobo.model.User;
import cn.bobo.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by leo on 2017/2/17.
 */
@Service("userService")
public class UserServiceImpl implements UserService{

    @Resource
    private UserDao userDao;

    public List<User> getUserList(){
        return userDao.getUserList();
    }
}
