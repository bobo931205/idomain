package cn.bobo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by leo on 2017/2/16.
 */
@Controller
public class HomeController {

    @RequestMapping("/home")
    public ModelAndView home(){
        return new ModelAndView("/views/home");
    }
}
