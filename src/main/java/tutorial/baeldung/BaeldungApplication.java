package tutorial.baeldung;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("tutorial.baeldung.repo") 
@EntityScan("tutorial.baeldung.model")
@SpringBootApplication
public class BaeldungApplication {

	public static void main(String[] args) {
		SpringApplication.run(BaeldungApplication.class, args);
	}
}
