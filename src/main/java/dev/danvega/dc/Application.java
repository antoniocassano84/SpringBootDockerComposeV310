package dev.danvega.dc;

import dev.danvega.dc.model.Post;
import dev.danvega.dc.repository.PostRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	// sudo systemctl stop postgresql
	// docker compose up
	// psql -U postgres
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(PostRepository repository) {
		return args -> repository.save(new Post("title2", "body22"));
	}

}
