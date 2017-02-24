package cn.bobo.service.impl;

import cn.bobo.service.HomeService;
import org.springframework.stereotype.Service;

/**
 * Created by leo on 2017/2/15.
 */
@Service
public class HomeServiceImpl implements HomeService{

    public void printHome(){
        System.out.println("welcome to my home");
    }
}
