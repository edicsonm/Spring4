package com.edimoto.spring4.repository;

import com.edimoto.spring4.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;

/**
 * Created by edicson on 8/2/17.
 */
//@Repository
//@Transactional
public interface UserRepository extends JpaRepository<User, Long>, UserRepositoryOperations {

//    User save(User user);
//    User findBySSO(String userName);

}
