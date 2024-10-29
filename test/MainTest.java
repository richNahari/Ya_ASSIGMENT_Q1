import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MainTest {
    @Test
    public void testFindNarcissisticNumbers() {
        Main main = new Main();
        int[] expected = {153, 370, 371};
        int[] result = main.findNarcissisticNumbers(3);

        assertArrayEquals(expected, result, "הפלט של findNarcissisticNumbers לא נכון.");
    }
}
