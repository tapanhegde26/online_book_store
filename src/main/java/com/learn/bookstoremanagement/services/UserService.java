package com.learn.bookstoremanagement.services;

import com.learn.bookstoremanagement.model.User;
import com.learn.bookstoremanagement.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User registerUser(User user){
        return userRepository.save(user);
    }

    public Optional<User> findUserByUsername(String username){
        return userRepository.findByUsername(username);
    }

    public List<User> findAllUsers(){
        return findAllUsers();
    }

    public void deleteUser(Long id){
        userRepository.deleteById(id);
    }
}
