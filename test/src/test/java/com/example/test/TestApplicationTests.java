package com.example.test;


import com.example.test.domain.controller.BookController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;

import static java.rmi.server.LogStream.log;

@SpringBootApplication
class TestApplicationTests {
	public static void main(String[] args) {
		SpringApplication.run(TestApplicationTests.class, args);
	}

	/*
	@Autowired
    BookController bookController = new BookController();

	@Test
	void contextLoads() {
	}

	@Test
	public void 프론트연결확인() {
		bookController.springData("이것은 테스트");
	}

	@Test
	void 외부api연결() {
		log("api연결 시작");
		bookController.useWebClient();
	}

	 */
}
