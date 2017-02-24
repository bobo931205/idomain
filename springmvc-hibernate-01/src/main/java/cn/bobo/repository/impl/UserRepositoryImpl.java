package cn.bobo.repository.impl;

import cn.bobo.entity.User;
import cn.bobo.repository.UserRepository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by leo on 2017/2/15.
 */
@Repository
public class UserRepositoryImpl implements UserRepository {

    @Autowired
    private SessionFactory sessionFactory;

    private Session getCurrentSession() {
        return this.sessionFactory.openSession();
    }

    public User load(Integer id) {
        return (User)getCurrentSession().load(User.class,id);
    }

    public User get(Integer id) {
        return (User)getCurrentSession().get(User.class,id);
    }

    public List<User> findAll() {
        return null;
    }

    public void persist(User entity) {
        getCurrentSession().persist(entity);
    }

    public Integer save(User entity) {
        return (Integer)getCurrentSession().save(entity);
    }

    public void saveOrUpdate(User entity) {
        getCurrentSession().saveOrUpdate(entity);
    }

    public void delete(Integer id) {
        User user = load(id);
        getCurrentSession().delete(user);
    }

    public void flush() {
        getCurrentSession().flush();
    }
}
