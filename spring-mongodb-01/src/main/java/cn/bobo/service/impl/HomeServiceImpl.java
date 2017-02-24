package cn.bobo.service.impl;

import cn.bobo.service.HomeService;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

/**
 * Created by leo on 2017/2/13.
 */
@Service("homeService")
public class HomeServiceImpl implements HomeService{

    @Autowired
    private MongoTemplate mongoTemplate;

    public void printHome(){
        System.out.println("welcome to my home");
        DBCollection db = mongoTemplate.getCollection("users"); //获取test数据库里面的user这个collection

        DBCursor dc = db.find();

        while (dc.hasNext()) {
            DBObject obj = dc.next();

            System.out.println(obj);
        }
    }
}
