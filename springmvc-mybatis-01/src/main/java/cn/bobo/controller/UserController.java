package cn.bobo.controller;

import cn.bobo.model.User;
import cn.bobo.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by leo on 2017/2/17.
 */
@Controller
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("/user")
    public ModelAndView home(){
        List<User> userList = userService.getUserList();
        /**
         *
         */
        return new ModelAndView("/views/home");
    }
}
