package cn.bobo.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * Created by leo on 2017/2/20.
 */
public class SqlSessionHelper {

    public static SqlSessionFactory getSessionFactory(){
        SqlSessionFactory sessionFactory = null;
        String resource = "config.xml";
        try{
            sessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader(resource));
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return sessionFactory;
    }
}
