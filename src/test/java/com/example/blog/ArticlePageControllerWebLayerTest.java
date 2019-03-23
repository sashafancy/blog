package com.example.blog;

import com.example.blog.controller.ArticlePageController;
import com.example.blog.entity.Article;
import com.example.blog.service.ArticleRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.hamcrest.CoreMatchers.containsString;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(ArticlePageController.class)
public class ArticlePageControllerWebLayerTest {

  @Autowired private MockMvc mockMvc;

  @MockBean private ArticleRepository mockArticleRepository;

  @BeforeEach
  public void setup() {
    Article article =
        new Article("title", "author", LocalDateTime.now(), LocalDateTime.now(), "content");

    List<Article> articleList = new ArrayList<>(Arrays.asList(article));

    when(mockArticleRepository.findById(1L)).thenReturn(Optional.of(article));
    when(mockArticleRepository.findAll()).thenReturn(articleList);
  }

  @Test
  public void shouldReturnArticles() throws Exception {
    this.mockMvc
        .perform(get("/articles"))
        .andExpect(status().isOk())
        .andExpect(content().string(containsString("content")));
  }

  @Test
  public void shouldReturnSingleArticle() throws Exception {
    this.mockMvc
        .perform(get("/articles/1"))
        .andExpect(status().isOk())
        .andExpect(content().string(containsString("content")));
  }
}
