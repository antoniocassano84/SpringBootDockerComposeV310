package dev.danvega.dc.controller;

import dev.danvega.dc.model.Post;
import dev.danvega.dc.repository.PostRepository;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/posts")
public class PostController {

  private final PostRepository repository;

  public PostController(PostRepository repository) {
    this.repository = repository;
  }

  @GetMapping
  public List<Post> findAll() {
    return repository.findAll();
  }

}
