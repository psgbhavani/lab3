import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;

public class ListTests {
    @Test 
	public void testFilter() {
        List<String> input1 = new ArrayList<>();
        input1.add("hello");
        input1.add("goodbye");
        input1.add("see ya");

        StringChecker sc = new StringChecker() {
            public boolean checkString(String s){
                return true;
            }
        };

        List<String> result = ListExamples.filter(input1, sc);
        assertArrayEquals(input1.toArray(), result.toArray());
	}

    @Test
    public void testMerge() {
        List<String> input1 = new ArrayList<>();
        input1.add("a");
        input1.add("c");
        input1.add("e");

        List<String> input2 = new ArrayList<>();
        input2.add("b");
        input2.add("d");
        input2.add("f");

        List<String> result = ListExamples.merge(input1, input2);

        String[] expected = {"a", "b", "c", "d", "e", "f"};

        assertArrayEquals(expected, result.toArray());
	}
}
