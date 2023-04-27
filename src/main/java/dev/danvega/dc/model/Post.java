package dev.danvega.dc.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Post {

  @Id
  @GeneratedValue
  private Integer id;
  private String title;
  private String body;

  public Post() {
  }

  public Post(String title, String body) {
    this.title = title;
    this.body = body;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  @Override
  public String toString() {
    return "Post{" +
        "id=" + id +
        ", title='" + title + '\'' +
        ", body='" + body + '\'' +
        '}';
  }
}
