package cn.bobo.service.impl;

import cn.bobo.service.RedisService;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;

/**
 * Created by leo on 2017/2/27.
 */
@Service("redisService")
public class RedisServiceImpl implements RedisService{

    @Resource
    private RedisTemplate redisTemplate;

    public void redis(){
        redisTemplate.opsForHash().put("myHash", "BJ", "����");
        redisTemplate.opsForHash().put("myHash", "SH", "�Ϻ�");
        redisTemplate.opsForHash().put("myHash", "HN", "����");
        Map<String, String> hashCache = redisTemplate.opsForHash()
                .entries("myHash");
        for (Map.Entry entry : hashCache.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
        System.out.println("---------------");
    }

}
