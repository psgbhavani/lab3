import static org.junit.Assert.*;
import org.junit.*;

public class LinkedListTests {
    @Test 
	public void testAppendEmpty() {
        LinkedList l = new LinkedList();

        String expected = "";
        assertEquals(l.toString(), expected);
	}

    @Test 
	public void testAppendOne() {
        LinkedList l = new LinkedList();
        l.append(0);

        String expected = "0 ";
        assertEquals(l.toString(), expected);
	}

    @Test 
	public void testAppendMultiple() {
        LinkedList l = new LinkedList();
        l.append(0);
        l.append(1);
        l.append(2);
        l.append(3);

        String expected = "0 1 2 3 ";
        assertEquals(l.toString(), expected);
	}

    @Test 
	public void testLast() {
        LinkedList l = new LinkedList();
        l.append(0);
        l.append(1);
        l.append(2);
        l.append(3);

        int expected = 3;
        int result = l.last();
        assertEquals(result, expected);
	}

    @Test 
	public void testLength() {
        LinkedList l = new LinkedList();
        l.append(0);
        l.append(1);
        l.append(2);
        l.append(3);

        int expected = 4;
        int result = l.length();
        assertEquals(result, expected);
	}
    
}
