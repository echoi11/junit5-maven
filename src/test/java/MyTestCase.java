import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


public class MyTestCase {
    @Test
    public void mult_4_9_equals_37() throws InterruptedException {
        Calculator c = new Calculator();
        assertEquals(c.multiply(4, 9), 37);
        System.out.println("4*9=37"); // where will this output appear?
    }
}