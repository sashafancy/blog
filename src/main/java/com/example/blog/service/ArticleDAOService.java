package com.example.blog.service;

import com.example.blog.entity.Article;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class ArticleDAOService {

    @PersistenceContext
    private EntityManager entityManager;

    public long insert(Article article) {
        // Open Transaction
        entityManager.persist(article);
        return article.getId();
    }
}
