import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;

public class ListTests {
    @Test
    public void testFilter(){
        List<String> input = new ArrayList<>();
        input.add("apple");
        input.add("banna");
        input.add("lemon");
        input.add("pear");

        List<String> expected = new ArrayList<>();
        expected.add("apple");
        expected.add("banna");
        expected.add("pear");

        List<String> output = ListExamples.filter(input, new ContainsA());
        assertEquals(expected, output);


    }
}
