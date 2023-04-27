package dev.danvega.dc.repository;

import dev.danvega.dc.model.Post;
import org.springframework.data.repository.ListCrudRepository;

public interface PostRepository extends ListCrudRepository<Post, Integer> {

}
