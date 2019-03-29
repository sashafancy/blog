package com.example.blog.entity;

import org.hibernate.validator.constraints.Length;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

/** Table - Article. */
@Entity
public class Article {

  @Id @GeneratedValue private long id;
  private String title;
  private String author;
  private LocalDateTime createdTime;
  private LocalDateTime lastModifiedTime;

  @Length(max = 300000)
  private String content;

  public Article() {}

  public Article(
      String title,
      String author,
      LocalDateTime createdTime,
      LocalDateTime lastModifiedTime,
      String content) {
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

  public void setTitle(String title) {
    this.title = title;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public void setCreatedTime(LocalDateTime createdTime) {
    this.createdTime = createdTime;
  }

  public void setLastModifiedTime(LocalDateTime lastModifiedTime) {
    this.lastModifiedTime = lastModifiedTime;
  }

  public void setContent(String content) {
    this.content = content;
  }

  @Override
  public String toString() {
    return "Article{"
        + "id="
        + id
        + ", title='"
        + title
        + '\''
        + ", author='"
        + author
        + '\''
        + ", createdTime="
        + createdTime
        + ", lastModifiedTime="
        + lastModifiedTime
        + ", content='"
        + content
        + '\''
        + '}';
  }
}
