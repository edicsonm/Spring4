package com.edimoto.spring4.repository;

import com.edimoto.spring4.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by edicson on 8/2/17.
 */
//@Repository
//@Transactional
//@Repository("userRepository")
public class UserRepositoryImpl implements UserRepositoryOperations {

//    @Autowired
    private SessionFactory sessionFactory;

//    private JdbcOperations jdbcOperations;
//
//    @Autowired
//    public UserRepositoryImpl(JdbcOperations jdbcOperations) {
//        this.jdbcOperations = jdbcOperations;
//    }

    //    @Override
    public User findBySSO(String userName) {

//        return jdbcOperations.queryForObject(
//                "select * FROM User u WHERE u.userName = ?", (resultSet, rowNum) -> new User(resultSet.getInt("id"), resultSet.getString("firstName") , resultSet.getString("lastName"), resultSet.getString("userName") , resultSet.getString("password")),userName);


//        Session session = sessionFactory.getCurrentSession();

//        Query query = session.createQuery("select u FROM User u WHERE u.userName = :userName")
//                .setParameter( "userName", userName );
//
//        User user = (User)query.uniqueResult();
//        System.out.println(String.format("user : %s",user));

//        CriteriaBuilder builder = session.getCriteriaBuilder();
//        CriteriaQuery<User> criteria = builder.createQuery(User.class);
//        criteria.from(User.class);
//        List<User> users = session.createQuery(criteria).getResultList();
//        System.out.println(String.format("%s",users));
        return null;
//        return user;
    }

    @Override
    public void saveUser(User user) {

    }
}