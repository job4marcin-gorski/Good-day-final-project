package com.example.goodday.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;

import com.example.goodday.db.User;

@Controller
public class MockUserController {


	
	public static List<User> getAll(){
		List<User> ret=new ArrayList<>();
		ret.add(new User("Jan","janek@onet.pl", ""));
		ret.add(new User("Ola","ol@wp.pl", ""));
		ret.add(new User("Kasia","kate123@gmail.com", ""));
		ret.add(new User("Zenek","zen@protonmail.com", ""));
		return ret;
	}
	
}
