import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


public class MyTest {
    @Test
    public void add_4_9_equals_13() throws InterruptedException {
        Calculator c = new Calculator();
        assertEquals(c.add(4, 9), 13);
        System.out.println("4+9=13"); // where will this output appear?
    }
}