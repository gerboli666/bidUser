package com.group.biduser.service;


import com.group.biduser.model.User;
import com.group.biduser.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public List<User> getUsers() {
        return userRepository.findAll();
    }
    public List<User> findUserById(Long id){
        return userRepository.findUserById(id);
    }

    public List<User> deleteUserById(Long id) {
        return userRepository.deleteUserById(id);
    }
}
