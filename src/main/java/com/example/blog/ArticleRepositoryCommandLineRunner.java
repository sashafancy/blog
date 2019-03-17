package com.example.blog;

import com.example.blog.service.ArticleDAOService;
import com.example.blog.entity.Article;
import com.example.blog.service.ArticleRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Component
public class ArticleRepositoryCommandLineRunner implements CommandLineRunner {

    private static final Logger log =
            LoggerFactory.getLogger(ArticleRepositoryCommandLineRunner.class);

    @Autowired
    private ArticleRepository articleRepository;

    @Override
    public void run(String... args) throws Exception {
        Article article = new Article("another title", "Sophie Zhang", LocalDateTime.now(), LocalDateTime.now(), "Default content.");
        articleRepository.save(article);
        log.info("new article is created : " + article);

        Optional<Article> articleWithIdOne = articleRepository.findById(1L);
        log.info("Article is retrieved : " + articleWithIdOne);

        List<Article> articles = articleRepository.findAll();
        log.info("All articles : " + articles);
    }
}
