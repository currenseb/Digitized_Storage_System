import com.example.cs210finalproject.User;
import com.example.cs210finalproject.UserFile;
import org.junit.jupiter.api.*;
import java.io.File;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.*;

// author: JuanCarols Ramos
class UserFileTests {

    private static final String USERNAME = "testuser";
    private static final String PASSWORD = "pass123";
    private static final String FILE_NAME = "testfile";
    private static final String EXPECTED_PATH = "MainRoot/" + USERNAME + "/" + FILE_NAME + ".txt";

    @BeforeEach
    void cleanUpBefore() {
        File file = new File(EXPECTED_PATH);
        if (file.exists()) file.delete();
    }

    @AfterEach
    void cleanUpAfter() {
        File file = new File(EXPECTED_PATH);
        if (file.exists()) file.delete();
    }

    @Test
    void testFileCreationIfNotExists() throws IOException {
        User testUser = new User(USERNAME, PASSWORD);
        UserFile userFile = new UserFile(FILE_NAME, testUser);

        File file = new File(userFile.getFilePath());
        assertFalse(file.exists(), "File should not exist before creation.");

        userFile.openWithDefaultApp();

        assertTrue(file.exists(), "File should be created by openWithDefaultApp().");
        assertEquals(EXPECTED_PATH, userFile.getFilePath(), "File path should match expected path.");
    }

    @Test
    void testDeleteFile() throws IOException {
        User testUser = new User(USERNAME, PASSWORD);
        UserFile userFile = new UserFile(FILE_NAME, testUser);

        userFile.openWithDefaultApp();  // Ensure file is created
        File file = new File(userFile.getFilePath());
        assertTrue(file.exists(), "File should exist before deletion.");

        boolean deleted = userFile.deleteFile();

        assertTrue(deleted, "deleteFile() should return true.");
        assertFalse(file.exists(), "File should no longer exist after deletion.");
    }
}
