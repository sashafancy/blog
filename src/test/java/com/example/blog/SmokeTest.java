package com.example.blog;

import com.example.blog.controller.ArticlePageController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class SmokeTest {

  @Autowired private ArticlePageController controller;

  @Test
  public void contextLoads() throws Exception {
    assertNotNull(controller);
  }
}
