package com.example.blog;

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

/** Data preloading. */
@Component
public class ArticleRepositoryCommandLineRunner implements CommandLineRunner {

  private static final Logger log =
      LoggerFactory.getLogger(ArticleRepositoryCommandLineRunner.class);

  @Autowired private ArticleRepository articleRepository;

  @Override
  public void run(String... args) {
    Article article =
        new Article(
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit.",
            "Erich Schwartzel",
            LocalDateTime.now(),
            LocalDateTime.now(),
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque viverra nisl sed urna congue, non tempor orci efficitur. Vivamus ante justo, accumsan vel magna in, placerat varius elit. Aenean placerat felis at pulvinar fermentum. Nullam id sagittis magna. Quisque et bibendum enim, ut viverra nisl. Pellentesque tristique semper sagittis. Phasellus fringilla quam ac massa porttitor, eget imperdiet tortor placerat. Proin venenatis eget orci non porttitor. Fusce congue mi ut est laoreet tempus. Etiam vel vestibulum dolor. Sed vitae ipsum quis justo accumsan rhoncus vitae ac enim. Etiam mattis posuere pharetra. Maecenas et eros porta, efficitur ante eu, aliquet diam. Curabitur magna sapien, ullamcorper vitae ex ut, mollis dictum mi. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum vel lorem eu arcu finibus ornare non vel mauris.");

    Article article1 =
        new Article(
            "Etiam non lacus lacinia, placerat orci in, dignissim tellus.",
            "Jacinda Ardern",
            LocalDateTime.now(),
            LocalDateTime.now(),
            "Cras eleifend lacinia facilisis. Curabitur bibendum quis risus eu faucibus. Sed eu consectetur risus, at sagittis lacus. Ut neque dolor, volutpat et sodales ac, tincidunt sit amet orci. Nulla et dui porta, pretium tortor id, posuere risus. Donec vel tempor diam, sit amet faucibus quam. Aenean feugiat luctus dolor sed sollicitudin. Curabitur id volutpat orci. Pellentesque molestie facilisis sem convallis tempus. Donec sollicitudin massa et dictum rhoncus. Nunc aliquam a nisl sit amet tincidunt. Quisque sagittis vehicula neque, ac posuere elit pretium sed. Nunc nec nibh id dui sodales blandit.");

    Article article2 =
        new Article(
            "Etiam id nunc euismod metus vulputate faucibus at a ipsum.",
            "testestest",
            LocalDateTime.now(),
            LocalDateTime.now(),
            "Pellentesque ut facilisis diam, vel finibus justo. Nullam odio velit, consectetur at elit eget, fermentum laoreet metus. In aliquet, sapien rutrum mollis sodales, urna dui mollis libero, elementum volutpat sapien sapien id felis. Sed non nisi lorem. Nullam convallis mi sed justo semper, sit amet viverra metus sodales. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Duis vehicula dui nulla, vitae fermentum eros dapibus ac. Quisque sit amet eros mattis, dignissim odio in, fermentum nisl. Fusce at massa iaculis, eleifend nibh congue, auctor mi. Nulla eget suscipit nisi, a interdum sapien. Cras finibus mollis dolor a tempus. Donec pellentesque vel est eu feugiat. Maecenas posuere a sem vel cursus. Morbi a convallis urna.");
    articleRepository.save(article);
    articleRepository.save(article1);
    articleRepository.save(article2);

    Optional<Article> articleWithIdOne = articleRepository.findById(1L);
    log.info("Article is retrieved : " + articleWithIdOne);

    List<Article> articles = articleRepository.findAll();
    log.info("All articles : " + articles);
  }
}
