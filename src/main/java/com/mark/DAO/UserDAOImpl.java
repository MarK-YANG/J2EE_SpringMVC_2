package com.mark.DAO;

import com.mark.Entity.MyUser;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by mark on 5/2/15.
 */

@Repository
public class UserDAOImpl implements UserDAO {

    @Autowired
    SessionFactory sessionFactory;

    public List<MyUser> selectAll() {
        Criteria criteria = sessionFactory.getCurrentSession().createCriteria(MyUser.class);
        return criteria.list();
    }

    public List<MyUser> select(String _id) {
        String hql = "from MyUser where user_id = ?";
        Query query = sessionFactory.getCurrentSession().createQuery(hql);
        query.setString(0, _id);
        return query.list();
    }

    public void update(MyUser _u) {
        sessionFactory.getCurrentSession().update(_u);
    }

    public void delete(MyUser _u) {
        sessionFactory.getCurrentSession().delete(_u);
    }

    public void insert(MyUser _u) {
        sessionFactory.getCurrentSession().save(_u);
    }
}
