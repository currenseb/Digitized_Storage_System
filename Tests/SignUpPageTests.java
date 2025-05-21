import com.example.cs210finalproject.User;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

// author: Matthew Ho <ssoohoya@gmail.com>
public class SignUpPageTests {

    private final String testUsername = "testUser";
    private final String testPassword = "Valid!!123";


    @AfterEach
    void tearDown() {
        User.userDatabase.remove(testUsername);
    }

    @Test
    void testSignUpCreatesAccount() {
        boolean success = User.signUp(testUsername, testPassword);

        assertTrue(success, "Account should be created with valid username and password.");
        assertNotNull(User.userDatabase.get(testUsername), "User database should contain the new account.");
    }

}
