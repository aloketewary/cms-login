package com.cms.login.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cms.login.app.model.User;

/**
 * Created by fan.jin on 2016-10-15.
 */
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername( String username );
}

