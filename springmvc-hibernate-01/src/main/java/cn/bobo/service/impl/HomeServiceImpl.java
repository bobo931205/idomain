package cn.bobo.service.impl;

import cn.bobo.entity.User;
import cn.bobo.repository.UserRepository;
import cn.bobo.service.HomeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by leo on 2017/2/15.
 */
@Service
public class HomeServiceImpl implements HomeService{

    @Resource
    private UserRepository userRepository;

    public void printHome() {
        System.out.println("welcome to my home");
        User user = new User();
        user.setName("lsy");
        user.setAddress("sixian");
        userRepository.save(user);
    }
}
