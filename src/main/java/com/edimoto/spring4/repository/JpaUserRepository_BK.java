package com.edimoto.spring4.repository;

import com.edimoto.spring4.model.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


/**
 * Created by edicson on 15/2/17.
 */
@Repository
@Transactional(value = "transactionManager")
public class JpaUserRepository_BK {

    @PersistenceContext(unitName="managedPU")
    private EntityManager em;

    public void save(User user) {
        em.persist(user);
    }

}

