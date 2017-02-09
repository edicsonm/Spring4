package com.edimoto.spring4.repository;

import com.edimoto.spring4.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import java.util.List;

/**
 * Created by edicson on 8/2/17.
 */
@Transactional
@Repository("userRepository")
public class UserRepositoryImpl implements UserRepositoryOperations {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public User findBySSO(String userName) {
        Session session = sessionFactory.getCurrentSession();

        Query query = session.createQuery("select u FROM User u WHERE u.userName = :userName")
                .setParameter( "userName", userName );

        User result = (User)query.uniqueResult();
        System.out.println(String.format("result : %s",result));


        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<User> criteria = builder.createQuery(User.class);
        criteria.from(User.class);
        List<User> users = session.createQuery(criteria).getResultList();
        System.out.println(String.format("%s",users));
        return null;
    }
}