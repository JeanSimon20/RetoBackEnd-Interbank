package com.jeansimon.retointerbank.service;

import com.jeansimon.retointerbank.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    Optional<User> findCodigoUnico(String codigoUnico);

    List<User> findAll();

    User create(User user);

    User update(User user);

    void delete(Long id);

}
