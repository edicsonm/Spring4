package com.edimoto.spring4.repository;

import com.edimoto.spring4.model.User;

/**
 * Created by edicson on 9/2/17.
 */
public interface UserRepositoryOperations {
        User findBySSO(String userName);
        void saveUser(User user);
}
