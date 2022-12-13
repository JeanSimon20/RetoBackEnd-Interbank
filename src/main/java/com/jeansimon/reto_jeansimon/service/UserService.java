package com.jeansimon.reto_jeansimon.service;

import com.jeansimon.reto_jeansimon.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    Optional<User> findIdInstitute(Long id);
    List<User> findAll();

    User create(User user);

    User update(User user);

    void delete(Long id);

}
