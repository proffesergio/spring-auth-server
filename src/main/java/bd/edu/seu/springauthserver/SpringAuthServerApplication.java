package bd.edu.seu.springauthserver;

import bd.edu.seu.springauthserver.repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class SpringAuthServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringAuthServerApplication.class, args);
    }

}
