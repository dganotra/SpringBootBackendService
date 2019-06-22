package com.gfg.deepanshu.SpringBootBackendService.service;

import com.gfg.deepanshu.SpringBootBackendService.model.User;
import com.gfg.deepanshu.SpringBootBackendService.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
// simple logging framework for java
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<User> findAllUsers(){
        return userRepository.findAll();
    }

    public User getUserById(Long id){
        Optional<User> userOptional= userRepository.findById(id);
        log.debug("User with id :{} is {}", id, userOptional.get());
        return userOptional.isPresent() ? userOptional.get(): null;
    }

    public User createUser(User user){
        return userRepository.save(user);
    }

    public User updateUser(User user){
        return userRepository.save(user);
    }

    public User deleteUser(Long id){
        User user = getUserById(id);
        userRepository.delete(user);
        return user;
    }
}
