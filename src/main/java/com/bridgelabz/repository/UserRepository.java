package com.bridgelabz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bridgelabz.model.User;

@Repository("UserRepository")
public interface UserRepository extends JpaRepository<User,Long> {

public User findByEmail(String email);

}
