package com.example.blog;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
public class BlogApplicationTests {

	@Test
	public void contextLoads() {
		assertThrows(IOException.class, () -> t());
	}

	private static void t() throws IOException {
		throw new IOException();
	}

}
