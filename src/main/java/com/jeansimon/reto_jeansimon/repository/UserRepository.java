package com.jeansimon.reto_jeansimon.repository;

import com.jeansimon.reto_jeansimon.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
