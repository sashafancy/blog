package com.example.blog.controller;

import com.example.blog.entity.Article;
import com.example.blog.service.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class ArticlePageController {

  @Autowired private ArticleRepository articleRepository;

  @RequestMapping(method = RequestMethod.GET, path = "/articles")
  public String showArticles(Model theModel) {

    List<Article> articles = articleRepository.findAll();

    theModel.addAttribute("articles", articles);

    return "articles";
  }
}
