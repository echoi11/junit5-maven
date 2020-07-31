import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


// This class will not be tested by default.
// Class name must be Test*.java or *Test.java.  Case-sensitive.
public class MyTest3 {
    @Test
    public void add_4_9_equals_13() throws InterruptedException {
        Calculator c = new Calculator();
        assertEquals(c.add(4, 9), 13);
        System.out.println("4+9=13"); // where will this output appear?
    }
}