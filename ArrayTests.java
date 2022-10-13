import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);

    int[] input2 = {1,2,3};
    int[] expected_output2 = {3,2,1};
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(expected_output2, input2);

	}


  @Test
  public void testReversed() {
    int[] input2 = {1,2,3};
    int[] expected_output2 = {3,2,1};
    int[] output = ArrayExamples.reversed(input2);
    assertArrayEquals(expected_output2, output);

  }

  @Test
  public void testAverageWithoutLowest(){
    double[] input = {1,1,2,3,4};
    double expected = (1+2+3+4)/4.0;
    double output = ArrayExamples.averageWithoutLowest(input);
    assertEquals(expected, output,0);
  }

}
