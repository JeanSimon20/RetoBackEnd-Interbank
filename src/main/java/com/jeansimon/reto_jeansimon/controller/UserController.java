package com.jeansimon.reto_jeansimon.controller;

import com.jeansimon.reto_jeansimon.model.User;
import com.jeansimon.reto_jeansimon.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    Optional<User> findIdInstitute(@PathVariable Long id) {
        return userService.findIdInstitute(id);
    }

    @GetMapping
    List<User> findAll(){
        return userService.findAll();
    }

    @PostMapping
    public User create(@RequestBody User user){
        return userService.create(user);
    }

    @PutMapping
    public  User update(@RequestBody User user){
        return userService.update(user);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id){
        userService.delete(id);
    }

}
