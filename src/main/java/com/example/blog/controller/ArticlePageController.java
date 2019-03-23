package com.example.blog.controller;

import com.example.blog.entity.Article;
import com.example.blog.service.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.Optional;

@Controller
public class ArticlePageController {

  @Autowired private ArticleRepository articleRepository;

  @RequestMapping(method = RequestMethod.GET, path = "/articles")
  public String showArticles(Model theModel) {

    List<Article> articles = articleRepository.findAll();

    theModel.addAttribute("articles", articles);

    return "articles";
  }

  @RequestMapping("articles/{id}")
  public String articleDetails(@PathVariable Integer id, Model theModel) {
    Optional<Article> article = articleRepository.findById(Long.valueOf(id));
    if (article.isPresent()) {
      theModel.addAttribute("article", article.get());
    }
    return "article";
  }
}
