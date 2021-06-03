package com.example.goodday.controller;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.goodday.db.User;

public interface UserRepository extends JpaRepository<User, Long> {

	@Query("SELECT u from User u where email like :q")
	List<User> findByEmailPart(@Param("q") String mailLike);


}
