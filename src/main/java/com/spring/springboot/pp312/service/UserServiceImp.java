package com.spring.springboot.pp312.service;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.spring.springboot.pp312.dao.UserDAO;
import com.spring.springboot.pp312.model.User;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class UserServiceImp implements UserService {

   private final UserDAO userDAO;

   public UserServiceImp(UserDAO userDAO) {
      this.userDAO = userDAO;
   }

   @Transactional
   @Override
   public void save(User user) {
      userDAO.save(user);
   }

   @Transactional
   @Override
   public void update(long id, User user) {
      User existingUser = userDAO.find(id);
//      if (existingUser == null) {
//         throw new EntityNotFoundException("User with id " + id + " not found");
//      }
//
//      existingUser.setFirstName(user.getFirstName());
//      existingUser.setLastName(user.getLastName());
//      existingUser.setEmail(user.getEmail());

      userDAO.save(existingUser);
   }

   @Transactional
   @Override
   public void delete(long id) {
//      User existingUser = userDAO.find(id);
//      if (existingUser == null) {
//         throw new EntityNotFoundException("User with id " + id + " not found");
//      }
      userDAO.delete(id);
   }

   @Override
   public List<User> findAll() {
      return userDAO.findAll();
   }

}
