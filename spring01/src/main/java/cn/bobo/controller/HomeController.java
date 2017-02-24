package cn.bobo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by leo on 2017/2/10.
 */
@Controller
public class HomeController {

    @RequestMapping("/home")
    public String home(){
        return "/views/home";
    }
}
