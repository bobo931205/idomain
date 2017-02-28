package cn.bobo.controller;

import cn.bobo.service.RedisService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

/**
 * Created by leo on 2017/2/27.
 */
@Controller
public class RedisController {

    @Resource
    private RedisService redisService;

    @RequestMapping("/redis")
    public ModelAndView home(){
        redisService.redis();
        return new ModelAndView("/views/home");
    }
}
