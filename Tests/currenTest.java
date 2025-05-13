import com.example.cs210finalproject.ProfilePageController;
import com.example.cs210finalproject.User;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import javafx.scene.control.TextField;

public class currenTest {

    @Test
    void changeUserNameTest() {
        User exampleUser = new User("example", "1234");
        User.userDatabase.put("example", exampleUser);
        ProfilePageController controller = new ProfilePageController();
        controller.currentUser = exampleUser;
        controller.changeUsernameForTest("newname");

        assertEquals("newname", exampleUser.username);
        assertEquals("newname", exampleUser.profilePageData.username);
        assertTrue(User.userDatabase.containsKey("newname"));
        assertFalse(User.userDatabase.containsKey("example"));
    }

    @Test
    void changePasswordTest() {
        User exampleUser = new User("example", "1234");
        ProfilePageController controller = new ProfilePageController();
        controller.currentUser = exampleUser;
        controller.changePasswordForTest("newpass");

        assertEquals("newpass", exampleUser.password);
        assertEquals("newpass", exampleUser.profilePageData.password);
        assertTrue(exampleUser.password.equals("newpass"));
        assertFalse(exampleUser.password.equals("1234"));
    }

}
