import static org.junit.Assert.*;
import org.junit.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileTests {
    @Test 
	public void testGetFiles() {
        File input1 = new File("some-files/");

        List<File> expected = new ArrayList<>();
        expected.add(new File("some-files/even-more-files/d.java"));
        expected.add(new File("some-files/even-more-files/a.txt"));
        expected.add(new File("some-files/more-files/c.java"));
        expected.add(new File("some-files/more-files/b.txt"));
        expected.add(new File("some-files/a.txt"));

        List<File> results = new ArrayList<>();
        try {
            results = FileExample.getFiles(input1);
        } catch (IOException e) {
            e.printStackTrace();
        }
        assertEquals(expected, results);
	}

}
