package com.edimoto.spring4.repository;

import com.edimoto.spring4.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by edicson on 14/2/17.
 */

//@Repository
//@Transactional(value = "HibernateTransactionManager")
public class HibernateUserRepository {

    SessionFactory sessionFactory;

//    @Autowired
//    public HibernateUserRepository(SessionFactory sessionFactory) {
//        this.sessionFactory = sessionFactory;
//    }

    private Session currentSession() {
        return sessionFactory.getCurrentSession();
    }

    public User findByUsername(String userName) {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("select u FROM User u WHERE u.userName = :userName").setParameter("userName", userName);

        User user = (User) query.uniqueResult();
        System.out.println(String.format("user : %s", user));
        return user;
    }


}
