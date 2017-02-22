package com.edimoto.spring4.repository;

import com.edimoto.spring4.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * Created by edicson on 15/2/17.
 */
public interface JpaUserRepository extends JpaRepository<User,Integer>, UserRepositoryOperations {
    User findByUserName(String userName);
}

