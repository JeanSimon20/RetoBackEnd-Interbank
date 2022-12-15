package com.jeansimon.retointerbank.controller;

import com.jeansimon.retointerbank.model.User;
import com.jeansimon.retointerbank.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/{codigoUnico}")
    Optional<User> findCodigoUnico(@PathVariable Long codigoUnico) {
        return userService.findCodigoUnico(String.valueOf(codigoUnico));
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
