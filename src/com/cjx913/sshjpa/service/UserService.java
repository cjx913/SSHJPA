package com.cjx913.sshjpa.service;

import com.cjx913.sshjpa.entity.User;

import java.util.List;


public interface UserService {
    public User findByUsernameAndPassword(String username, String password);
    public User getByUsernameAndPassword(String username,String password);
    public User findById(Integer id);
    public List<User> findAll();
    public void update(User user);
}
