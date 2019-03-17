package com.example.blog;

import com.example.blog.service.ArticleDAOService;
import com.example.blog.entity.Article;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class ArticleDaoServiceCommandLineRunner implements CommandLineRunner {

    private static final Logger log =
            LoggerFactory.getLogger(ArticleDaoServiceCommandLineRunner.class);

    @Autowired
    private ArticleDAOService articleDAOService;

    @Override
    public void run(String... args) throws Exception {
        Article article = new Article("default title", "Sophie Zhang", LocalDateTime.now(), LocalDateTime.now(), "Default content.");
        long insert = articleDAOService.insert(article);
        log.info("New article is created : " + article);
    }
}
