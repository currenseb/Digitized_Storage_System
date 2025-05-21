import com.example.cs210finalproject.User;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;


// author: Matthew Ho <ssoohoya@gmail.com>

public class LoginInPageTests {

    private final String testUsername = "testUser";
    private final String testPassword = "Valid!!123";

    @BeforeEach
    void setUp() {
        User.signUp(testUsername, testPassword);
    }

    @AfterEach
    void tearDown() {
        User.userDatabase.remove(testUsername);
    }

    @Test
    void testLogInWithValidCredentials() {
        User loggedInUser = User.logIn(testUsername, testPassword);

        assertNotNull(loggedInUser, "Login should succeed with correct credentials.");
        assertEquals(testUsername, loggedInUser.getUsername(), "Logged in username should match the expected username.");
    }
}
