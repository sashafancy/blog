package com.example.blog.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

// Table - Article
@Entity
public class Article {

    @Id
    @GeneratedValue
    private long id;
    private String title;
    private String author;
    private LocalDateTime createdTime;
    private LocalDateTime lastModifiedTime;
    private String content;

    protected Article() {

    }

    public Article(String title, String author, LocalDateTime createdTime, LocalDateTime lastModifiedTime, String content) {
        this.title = title;
        this.author = author;
        this.createdTime = createdTime;
        this.lastModifiedTime = lastModifiedTime;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public LocalDateTime getCreatedTime() {
        return createdTime;
    }

    public LocalDateTime getLastModifiedTime() {
        return lastModifiedTime;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", createdTime=" + createdTime +
                ", lastModifiedTime=" + lastModifiedTime +
                ", content='" + content + '\'' +
                '}';
    }
}
