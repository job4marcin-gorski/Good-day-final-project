package com.example.goodday.controller;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.goodday.db.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
