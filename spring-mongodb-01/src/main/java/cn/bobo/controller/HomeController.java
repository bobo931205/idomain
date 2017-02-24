package cn.bobo.controller;

import cn.bobo.service.HomeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

/**
 * Created by leo on 2017/2/13.
 */
@Controller
public class HomeController {

    @Resource
    private HomeService homeService;

    @RequestMapping("/home")
    public ModelAndView home(){
        homeService.printHome();
        return new ModelAndView("/views/home");
    }
}
