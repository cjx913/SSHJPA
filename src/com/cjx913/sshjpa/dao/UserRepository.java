package com.cjx913.sshjpa.dao;

import com.cjx913.sshjpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Integer> {
        public User findByUsernameAndPassword(String username,String password);
        public User getByUsernameAndPassword(String username,String password);
}
