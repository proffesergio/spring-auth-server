package bd.edu.seu.springauthserver.model;

import bd.edu.seu.springauthserver.models.User;
import bd.edu.seu.springauthserver.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserTest {
    @Autowired
    UserRepository userRepository;

    @Test
    public void testCreateUser() {

    }
}
