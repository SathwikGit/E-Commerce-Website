package com.sheryians.major.repo;

import com.sheryians.major.model.User;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepo extends JpaRepository<User,Integer> {
    public User findUserByEmail(String email);

}
