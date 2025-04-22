package com.spring.springboot.pp312.service;

import com.spring.springboot.pp312.model.User;

import java.util.List;

public interface UserService {
    void save(User user);
    void update(long id, User user);
    void delete(long id);
    List<User> findAll();
}