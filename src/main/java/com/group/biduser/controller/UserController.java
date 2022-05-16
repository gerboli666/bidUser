package com.group.biduser.controller;

import com.group.biduser.model.User;
import com.group.biduser.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.transaction.Transactional;
import java.util.List;


@RestController
@Slf4j
@RequestMapping("/api/user")
@Transactional
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/post")
    public User saveUser(@RequestBody User user){
        log.info("User saved successful !");
        return userService.saveUser(user);
    }
    @GetMapping("/get")
    public List<User> getUsers(){
        log.info("Userat u gjeten te gjithe !");
        return userService.getUsers();
    }
    @GetMapping("/{id}")
   public List<User> findUserById(@PathVariable("id") Long id){
        log.info("Useri u gjet ne database me sukses !");
        return userService.findUserById(id);
    }
    @DeleteMapping("/deleteUser/{id}")
    public List<User> deleteUserById(@PathVariable("id") Long id){
        log.info("User u fshi nga database me sukses !");
        return userService.deleteUserById(id);
    }
}
