import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}

  @Test 
	public void testReverseInPlace2() {
    int[] input1 = { 1, 2, 3, 4, 5 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 5, 4, 3, 2, 1 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test 
	public void testReversed2() {
    int[] input1 = { 1, 2, 3, 4, 5 };
    int[] result = ArrayExamples.reversed(input1);
    int[] expected = new int[]{ 5, 4, 3, 2, 1 };
    assertArrayEquals(expected, result);
	}

  @Test
  public void testAverageWithoutLowest(){
    double[] input1 = { 1.0, 2.0, 3.0, 4.0, 5.0 };
    double result = ArrayExamples.averageWithoutLowest(input1);
    double expected = 3.5;
    assertEquals(expected, result, 0.0);
  }

  @Test
  public void testAverageWithoutLowest2(){
    double[] input1 = { 1.0, 1.0, 2.0, 3.0, 4.0, 5.0 };
    double result = ArrayExamples.averageWithoutLowest(input1);
    double expected = 3.0;
    assertEquals(expected, result, 0.0);
  }
}
