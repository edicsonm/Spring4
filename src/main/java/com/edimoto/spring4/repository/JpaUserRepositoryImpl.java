package com.edimoto.spring4.repository;

import com.edimoto.spring4.model.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

/**
 * Created by edicson on 22/2/17.
 */
@Repository
@Transactional(value = "transactionManager")
public class JpaUserRepositoryImpl implements UserRepositoryOperations {

    @PersistenceContext()
    private EntityManager em;


    @Override
    public User findBySSO(String userName) {
        Query query = em.createQuery("select u FROM User u WHERE u.userName = :userName").setParameter("userName", userName);
        User user = (User)query.getSingleResult();
        return user;
    }

    @Override
    public void saveUser(User user) {
        em.persist(user);
    }
}
