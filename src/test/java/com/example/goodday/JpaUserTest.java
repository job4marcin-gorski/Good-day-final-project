package com.example.goodday;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.goodday.controller.UserRepository;
import com.example.goodday.db.User;

@SpringBootTest
@SpringBootApplication
public class JpaUserTest {
	@Autowired
	private UserRepository repository;

	@Test
	public void testSaveNewProduct() {

		assertEquals(0, repository.findAll().size());

		repository.save(new User("Stefan", "st@wp.pl", "fdhskjaf"));
		repository.save(new User("Ania", "ania@wp.pl", "dupa12"));
		repository.save(new User("Taki Tam", "on@google.com", "2143424"));

		assertEquals(3, repository.findAll().size());

		assertEquals(2, repository.findByEmailPart("%wp.pl").size());
		assertEquals(1, repository.findByEmailPart("%google%").size());
		assertEquals(0, repository.findByEmailPart("%dupa%").size());
		
		
		
	}

}
