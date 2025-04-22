package com.spring.springboot.pp312.dao;

import com.spring.springboot.pp312.model.User;

import java.util.List;

public interface UserDAO {
    void save(User user);
    User find(long id);
    void delete(long id);
    List<User> findAll();
}