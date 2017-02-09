package com.edimoto.spring4.repository;

import com.edimoto.spring4.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

/**
 * Created by edicson on 8/2/17.
 */
public interface UserRepository extends JpaRepository<User, Long>, UserRepositoryOperations {
}
